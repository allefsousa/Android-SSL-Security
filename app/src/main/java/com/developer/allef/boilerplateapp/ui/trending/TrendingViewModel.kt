package com.developer.allef.boilerplateapp.ui.trending

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.developer.allef.boilerplateapp.data.StateResult
import com.developer.allef.boilerplateapp.repository.TrendingRepository
import kotlinx.coroutines.launch

/**
 * @author allef.santos on 25/06/20
 */
class TrendingViewModel(private val repository: TrendingRepository) :ViewModel(){


    fun getTopRepositories(nameTec: String) {
        viewModelScope.launch {
            val result = repository.getTrendingRepositories(nameTec)
            when(result){
                is StateResult.Success ->
                    Log.d("Allef"," Sucesso- ${result.data}")
                is StateResult.Failure -> {
                    Log.d("Allef"," & Exception - ${result.throwable}")
                }
                is StateResult.Error -> {
                    Log.d("Allef"," Erro - ${result.data}")
                }
            }

        }
    }


    override fun onCleared() {
        super.onCleared()
    }
}