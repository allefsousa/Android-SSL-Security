package com.developer.allef.boilerplateapp.data.model


/**
 * @author allef.santos on 26/06/20
 */
data class Item (
    val archiveUrl: String,
    val archived: Boolean,
    val assigneesUrl: String,
    val blobsUrl: String,
    val branchesUrl: String,
    val cloneUrl: String,
    val collaboratorsUrl: String,
    val commentsUrl: String,
    val commitsUrl: String,
    val compareUrl: String,
    val contentsUrl: String,
    val contributorsUrl: String,
    val createdAt: String,
    val defaultBranch: String,
    val deploymentsUrl: String,
    val description: String,
    val disabled: Boolean,
    val downloadsUrl: String,
    val eventsUrl: String,
    val fork: Boolean,
    val forks: Int,
    val forksCount: Int,
    val forksUrl: String,
    val fullName: String,
    val gitCommitsUrl: String,
    val gitRefsUrl: String,
    val gitTagsUrl: String,
    val gitUrl: String,
    val hasDownloads: Boolean,
    val hasIssues: Boolean,
    val hasPages: Boolean,
    val hasProjects: Boolean,
    val hasWiki: Boolean,
    val hooksUrl: String,
    val htmlUrl: String,
    val id: Int,
    val issueCommentUrl: String,
    val issueEventsUrl: String,
    val issuesUrl: String,
    val keysUrl: String,
    val labelsUrl: String,
    val languagesUrl: String,
    val mergesUrl: String,
    val milestonesUrl: String,
    val name: String,
    val nodeId: String,
    val notificationsUrl: String,
    val openIssues: Int,
    val openIssuesCount: Int,
    val owner: Owner,
    val `private`: Boolean,
    val pullsUrl: String,
    val pushedAt: String,
    val releasesUrl: String,
    val score: Double,
    val size: Int,
    val sshUrl: String,
    val stargazersCount: Int,
    val stargazersUrl: String,
    val statusesUrl: String,
    val subscribersUrl: String,
    val subscriptionUrl: String,
    val svnUrl: String,
    val tagsUrl: String,
    val teamsUrl: String,
    val treesUrl: String,
    val updatedAt: String,
    val url: String,
    val watchers: Int,
    val watchersCount: Int
)