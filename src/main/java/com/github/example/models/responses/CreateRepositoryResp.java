package main.java.com.github.example.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRepositoryResp {
    private long id;
    private String nodeID;
    private String name;
    private String fullName;
    private Owner owner;
    private boolean welcomePrivate;
    private String htmlURL;
    private String description;
    private boolean fork;
    private String url;
    private String archiveURL;
    private String assigneesURL;
    private String blobsURL;
    private String branchesURL;
    private String collaboratorsURL;
    private String commentsURL;
    private String commitsURL;
    private String compareURL;
    private String contentsURL;
    private String contributorsURL;
    private String deploymentsURL;
    private String downloadsURL;
    private String eventsURL;
    private String forksURL;
    private String gitCommitsURL;
    private String gitRefsURL;
    private String gitTagsURL;
    private String gitURL;
    private String issueCommentURL;
    private String issueEventsURL;
    private String issuesURL;
    private String keysURL;
    private String labelsURL;
    private String languagesURL;
    private String mergesURL;
    private String milestonesURL;
    private String notificationsURL;
    private String pullsURL;
    private String releasesURL;
    private String sshURL;
    private String stargazersURL;
    private String statusesURL;
    private String subscribersURL;
    private String subscriptionURL;
    private String tagsURL;
    private String teamsURL;
    private String treesURL;
    private String cloneURL;
    private String mirrorURL;
    private String hooksURL;
    private String svnURL;
    private String homepage;
    private License license;
    private Object language;
    private long forksCount;
    private long forks;
    private long stargazersCount;
    private long watchersCount;
    private long watchers;
    private long size;
    private String defaultBranch;
    private long openIssuesCount;
    private long openIssues;
    private boolean isTemplate;
    private String[] topics;
    private boolean hasIssues;
    private boolean hasProjects;
    private boolean hasWiki;
    private boolean hasPages;
    private boolean hasDownloads;
    private boolean archived;
    private boolean disabled;
    private String visibility;
    private String pushedAt;
    private String createdAt;
    private String updatedAt;
    private Permissions permissions;
    private boolean allowRebaseMerge;
    private CreateRepositoryResp templateRepository;
    private String tempCloneToken;
    private boolean allowSquashMerge;
    private boolean allowAutoMerge;
    private boolean deleteBranchOnMerge;
    private boolean allowMergeCommit;
    private Boolean allowForking;
    private Boolean webCommitSignoffRequired;
    private long subscribersCount;
    private long networkCount;
    private Owner organization;
    private CreateRepositoryResp parent;
    private CreateRepositoryResp source;

    @JsonProperty("id")
    public long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(long value) {
        this.id = value;
    }

    @JsonProperty("node_id")
    public String getNodeID() {
        return nodeID;
    }

    @JsonProperty("node_id")
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String value) {
        this.fullName = value;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner value) {
        this.owner = value;
    }

    @JsonProperty("private")
    public boolean getWelcomePrivate() {
        return welcomePrivate;
    }

    @JsonProperty("private")
    public void setWelcomePrivate(boolean value) {
        this.welcomePrivate = value;
    }

    @JsonProperty("html_url")
    public String getHTMLURL() {
        return htmlURL;
    }

    @JsonProperty("html_url")
    public void setHTMLURL(String value) {
        this.htmlURL = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

    @JsonProperty("fork")
    public boolean getFork() {
        return fork;
    }

    @JsonProperty("fork")
    public void setFork(boolean value) {
        this.fork = value;
    }

    @JsonProperty("url")
    public String getURL() {
        return url;
    }

    @JsonProperty("url")
    public void setURL(String value) {
        this.url = value;
    }

    @JsonProperty("archive_url")
    public String getArchiveURL() {
        return archiveURL;
    }

    @JsonProperty("archive_url")
    public void setArchiveURL(String value) {
        this.archiveURL = value;
    }

    @JsonProperty("assignees_url")
    public String getAssigneesURL() {
        return assigneesURL;
    }

    @JsonProperty("assignees_url")
    public void setAssigneesURL(String value) {
        this.assigneesURL = value;
    }

    @JsonProperty("blobs_url")
    public String getBlobsURL() {
        return blobsURL;
    }

    @JsonProperty("blobs_url")
    public void setBlobsURL(String value) {
        this.blobsURL = value;
    }

    @JsonProperty("branches_url")
    public String getBranchesURL() {
        return branchesURL;
    }

    @JsonProperty("branches_url")
    public void setBranchesURL(String value) {
        this.branchesURL = value;
    }

    @JsonProperty("collaborators_url")
    public String getCollaboratorsURL() {
        return collaboratorsURL;
    }

    @JsonProperty("collaborators_url")
    public void setCollaboratorsURL(String value) {
        this.collaboratorsURL = value;
    }

    @JsonProperty("comments_url")
    public String getCommentsURL() {
        return commentsURL;
    }

    @JsonProperty("comments_url")
    public void setCommentsURL(String value) {
        this.commentsURL = value;
    }

    @JsonProperty("commits_url")
    public String getCommitsURL() {
        return commitsURL;
    }

    @JsonProperty("commits_url")
    public void setCommitsURL(String value) {
        this.commitsURL = value;
    }

    @JsonProperty("compare_url")
    public String getCompareURL() {
        return compareURL;
    }

    @JsonProperty("compare_url")
    public void setCompareURL(String value) {
        this.compareURL = value;
    }

    @JsonProperty("contents_url")
    public String getContentsURL() {
        return contentsURL;
    }

    @JsonProperty("contents_url")
    public void setContentsURL(String value) {
        this.contentsURL = value;
    }

    @JsonProperty("contributors_url")
    public String getContributorsURL() {
        return contributorsURL;
    }

    @JsonProperty("contributors_url")
    public void setContributorsURL(String value) {
        this.contributorsURL = value;
    }

    @JsonProperty("deployments_url")
    public String getDeploymentsURL() {
        return deploymentsURL;
    }

    @JsonProperty("deployments_url")
    public void setDeploymentsURL(String value) {
        this.deploymentsURL = value;
    }

    @JsonProperty("downloads_url")
    public String getDownloadsURL() {
        return downloadsURL;
    }

    @JsonProperty("downloads_url")
    public void setDownloadsURL(String value) {
        this.downloadsURL = value;
    }

    @JsonProperty("events_url")
    public String getEventsURL() {
        return eventsURL;
    }

    @JsonProperty("events_url")
    public void setEventsURL(String value) {
        this.eventsURL = value;
    }

    @JsonProperty("forks_url")
    public String getForksURL() {
        return forksURL;
    }

    @JsonProperty("forks_url")
    public void setForksURL(String value) {
        this.forksURL = value;
    }

    @JsonProperty("git_commits_url")
    public String getGitCommitsURL() {
        return gitCommitsURL;
    }

    @JsonProperty("git_commits_url")
    public void setGitCommitsURL(String value) {
        this.gitCommitsURL = value;
    }

    @JsonProperty("git_refs_url")
    public String getGitRefsURL() {
        return gitRefsURL;
    }

    @JsonProperty("git_refs_url")
    public void setGitRefsURL(String value) {
        this.gitRefsURL = value;
    }

    @JsonProperty("git_tags_url")
    public String getGitTagsURL() {
        return gitTagsURL;
    }

    @JsonProperty("git_tags_url")
    public void setGitTagsURL(String value) {
        this.gitTagsURL = value;
    }

    @JsonProperty("git_url")
    public String getGitURL() {
        return gitURL;
    }

    @JsonProperty("git_url")
    public void setGitURL(String value) {
        this.gitURL = value;
    }

    @JsonProperty("issue_comment_url")
    public String getIssueCommentURL() {
        return issueCommentURL;
    }

    @JsonProperty("issue_comment_url")
    public void setIssueCommentURL(String value) {
        this.issueCommentURL = value;
    }

    @JsonProperty("issue_events_url")
    public String getIssueEventsURL() {
        return issueEventsURL;
    }

    @JsonProperty("issue_events_url")
    public void setIssueEventsURL(String value) {
        this.issueEventsURL = value;
    }

    @JsonProperty("issues_url")
    public String getIssuesURL() {
        return issuesURL;
    }

    @JsonProperty("issues_url")
    public void setIssuesURL(String value) {
        this.issuesURL = value;
    }

    @JsonProperty("keys_url")
    public String getKeysURL() {
        return keysURL;
    }

    @JsonProperty("keys_url")
    public void setKeysURL(String value) {
        this.keysURL = value;
    }

    @JsonProperty("labels_url")
    public String getLabelsURL() {
        return labelsURL;
    }

    @JsonProperty("labels_url")
    public void setLabelsURL(String value) {
        this.labelsURL = value;
    }

    @JsonProperty("languages_url")
    public String getLanguagesURL() {
        return languagesURL;
    }

    @JsonProperty("languages_url")
    public void setLanguagesURL(String value) {
        this.languagesURL = value;
    }

    @JsonProperty("merges_url")
    public String getMergesURL() {
        return mergesURL;
    }

    @JsonProperty("merges_url")
    public void setMergesURL(String value) {
        this.mergesURL = value;
    }

    @JsonProperty("milestones_url")
    public String getMilestonesURL() {
        return milestonesURL;
    }

    @JsonProperty("milestones_url")
    public void setMilestonesURL(String value) {
        this.milestonesURL = value;
    }

    @JsonProperty("notifications_url")
    public String getNotificationsURL() {
        return notificationsURL;
    }

    @JsonProperty("notifications_url")
    public void setNotificationsURL(String value) {
        this.notificationsURL = value;
    }

    @JsonProperty("pulls_url")
    public String getPullsURL() {
        return pullsURL;
    }

    @JsonProperty("pulls_url")
    public void setPullsURL(String value) {
        this.pullsURL = value;
    }

    @JsonProperty("releases_url")
    public String getReleasesURL() {
        return releasesURL;
    }

    @JsonProperty("releases_url")
    public void setReleasesURL(String value) {
        this.releasesURL = value;
    }

    @JsonProperty("ssh_url")
    public String getSSHURL() {
        return sshURL;
    }

    @JsonProperty("ssh_url")
    public void setSSHURL(String value) {
        this.sshURL = value;
    }

    @JsonProperty("stargazers_url")
    public String getStargazersURL() {
        return stargazersURL;
    }

    @JsonProperty("stargazers_url")
    public void setStargazersURL(String value) {
        this.stargazersURL = value;
    }

    @JsonProperty("statuses_url")
    public String getStatusesURL() {
        return statusesURL;
    }

    @JsonProperty("statuses_url")
    public void setStatusesURL(String value) {
        this.statusesURL = value;
    }

    @JsonProperty("subscribers_url")
    public String getSubscribersURL() {
        return subscribersURL;
    }

    @JsonProperty("subscribers_url")
    public void setSubscribersURL(String value) {
        this.subscribersURL = value;
    }

    @JsonProperty("subscription_url")
    public String getSubscriptionURL() {
        return subscriptionURL;
    }

    @JsonProperty("subscription_url")
    public void setSubscriptionURL(String value) {
        this.subscriptionURL = value;
    }

    @JsonProperty("tags_url")
    public String getTagsURL() {
        return tagsURL;
    }

    @JsonProperty("tags_url")
    public void setTagsURL(String value) {
        this.tagsURL = value;
    }

    @JsonProperty("teams_url")
    public String getTeamsURL() {
        return teamsURL;
    }

    @JsonProperty("teams_url")
    public void setTeamsURL(String value) {
        this.teamsURL = value;
    }

    @JsonProperty("trees_url")
    public String getTreesURL() {
        return treesURL;
    }

    @JsonProperty("trees_url")
    public void setTreesURL(String value) {
        this.treesURL = value;
    }

    @JsonProperty("clone_url")
    public String getCloneURL() {
        return cloneURL;
    }

    @JsonProperty("clone_url")
    public void setCloneURL(String value) {
        this.cloneURL = value;
    }

    @JsonProperty("mirror_url")
    public String getMirrorURL() {
        return mirrorURL;
    }

    @JsonProperty("mirror_url")
    public void setMirrorURL(String value) {
        this.mirrorURL = value;
    }

    @JsonProperty("hooks_url")
    public String getHooksURL() {
        return hooksURL;
    }

    @JsonProperty("hooks_url")
    public void setHooksURL(String value) {
        this.hooksURL = value;
    }

    @JsonProperty("svn_url")
    public String getSvnURL() {
        return svnURL;
    }

    @JsonProperty("svn_url")
    public void setSvnURL(String value) {
        this.svnURL = value;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String value) {
        this.homepage = value;
    }

    @JsonProperty("license")
    public License getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(License value) {
        this.license = value;
    }

    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Object value) {
        this.language = value;
    }

    @JsonProperty("forks_count")
    public long getForksCount() {
        return forksCount;
    }

    @JsonProperty("forks_count")
    public void setForksCount(long value) {
        this.forksCount = value;
    }

    @JsonProperty("forks")
    public long getForks() {
        return forks;
    }

    @JsonProperty("forks")
    public void setForks(long value) {
        this.forks = value;
    }

    @JsonProperty("stargazers_count")
    public long getStargazersCount() {
        return stargazersCount;
    }

    @JsonProperty("stargazers_count")
    public void setStargazersCount(long value) {
        this.stargazersCount = value;
    }

    @JsonProperty("watchers_count")
    public long getWatchersCount() {
        return watchersCount;
    }

    @JsonProperty("watchers_count")
    public void setWatchersCount(long value) {
        this.watchersCount = value;
    }

    @JsonProperty("watchers")
    public long getWatchers() {
        return watchers;
    }

    @JsonProperty("watchers")
    public void setWatchers(long value) {
        this.watchers = value;
    }

    @JsonProperty("size")
    public long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(long value) {
        this.size = value;
    }

    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    @JsonProperty("default_branch")
    public void setDefaultBranch(String value) {
        this.defaultBranch = value;
    }

    @JsonProperty("open_issues_count")
    public long getOpenIssuesCount() {
        return openIssuesCount;
    }

    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(long value) {
        this.openIssuesCount = value;
    }

    @JsonProperty("open_issues")
    public long getOpenIssues() {
        return openIssues;
    }

    @JsonProperty("open_issues")
    public void setOpenIssues(long value) {
        this.openIssues = value;
    }

    @JsonProperty("is_template")
    public boolean getIsTemplate() {
        return isTemplate;
    }

    @JsonProperty("is_template")
    public void setIsTemplate(boolean value) {
        this.isTemplate = value;
    }

    @JsonProperty("topics")
    public String[] getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(String[] value) {
        this.topics = value;
    }

    @JsonProperty("has_issues")
    public boolean getHasIssues() {
        return hasIssues;
    }

    @JsonProperty("has_issues")
    public void setHasIssues(boolean value) {
        this.hasIssues = value;
    }

    @JsonProperty("has_projects")
    public boolean getHasProjects() {
        return hasProjects;
    }

    @JsonProperty("has_projects")
    public void setHasProjects(boolean value) {
        this.hasProjects = value;
    }

    @JsonProperty("has_wiki")
    public boolean getHasWiki() {
        return hasWiki;
    }

    @JsonProperty("has_wiki")
    public void setHasWiki(boolean value) {
        this.hasWiki = value;
    }

    @JsonProperty("has_pages")
    public boolean getHasPages() {
        return hasPages;
    }

    @JsonProperty("has_pages")
    public void setHasPages(boolean value) {
        this.hasPages = value;
    }

    @JsonProperty("has_downloads")
    public boolean getHasDownloads() {
        return hasDownloads;
    }

    @JsonProperty("has_downloads")
    public void setHasDownloads(boolean value) {
        this.hasDownloads = value;
    }

    @JsonProperty("archived")
    public boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(boolean value) {
        this.archived = value;
    }

    @JsonProperty("disabled")
    public boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String value) {
        this.visibility = value;
    }

    @JsonProperty("pushed_at")
    public String getPushedAt() {
        return pushedAt;
    }

    @JsonProperty("pushed_at")
    public void setPushedAt(String value) {
        this.pushedAt = value;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions value) {
        this.permissions = value;
    }

    @JsonProperty("allow_rebase_merge")
    public boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    @JsonProperty("allow_rebase_merge")
    public void setAllowRebaseMerge(boolean value) {
        this.allowRebaseMerge = value;
    }

    @JsonProperty("template_repository")
    public CreateRepositoryResp getTemplateRepository() {
        return templateRepository;
    }

    @JsonProperty("template_repository")
    public void setTemplateRepository(CreateRepositoryResp value) {
        this.templateRepository = value;
    }

    @JsonProperty("temp_clone_token")
    public String getTempCloneToken() {
        return tempCloneToken;
    }

    @JsonProperty("temp_clone_token")
    public void setTempCloneToken(String value) {
        this.tempCloneToken = value;
    }

    @JsonProperty("allow_squash_merge")
    public boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    @JsonProperty("allow_squash_merge")
    public void setAllowSquashMerge(boolean value) {
        this.allowSquashMerge = value;
    }

    @JsonProperty("allow_auto_merge")
    public boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    @JsonProperty("allow_auto_merge")
    public void setAllowAutoMerge(boolean value) {
        this.allowAutoMerge = value;
    }

    @JsonProperty("delete_branch_on_merge")
    public boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    @JsonProperty("delete_branch_on_merge")
    public void setDeleteBranchOnMerge(boolean value) {
        this.deleteBranchOnMerge = value;
    }

    @JsonProperty("allow_merge_commit")
    public boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    @JsonProperty("allow_merge_commit")
    public void setAllowMergeCommit(boolean value) {
        this.allowMergeCommit = value;
    }

    @JsonProperty("allow_forking")
    public Boolean getAllowForking() {
        return allowForking;
    }

    @JsonProperty("allow_forking")
    public void setAllowForking(Boolean value) {
        this.allowForking = value;
    }

    @JsonProperty("web_commit_signoff_required")
    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    @JsonProperty("web_commit_signoff_required")
    public void setWebCommitSignoffRequired(Boolean value) {
        this.webCommitSignoffRequired = value;
    }

    @JsonProperty("subscribers_count")
    public long getSubscribersCount() {
        return subscribersCount;
    }

    @JsonProperty("subscribers_count")
    public void setSubscribersCount(long value) {
        this.subscribersCount = value;
    }

    @JsonProperty("network_count")
    public long getNetworkCount() {
        return networkCount;
    }

    @JsonProperty("network_count")
    public void setNetworkCount(long value) {
        this.networkCount = value;
    }

    @JsonProperty("organization")
    public Owner getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Owner value) {
        this.organization = value;
    }

    @JsonProperty("parent")
    public CreateRepositoryResp getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(CreateRepositoryResp value) {
        this.parent = value;
    }

    @JsonProperty("source")
    public CreateRepositoryResp getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(CreateRepositoryResp value) {
        this.source = value;
    }
}


class License {
    private String key;
    private String name;
    private String url;
    private String spdxID;
    private String nodeID;
    private String htmlURL;

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String value) {
        this.key = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("url")
    public String getURL() {
        return url;
    }

    @JsonProperty("url")
    public void setURL(String value) {
        this.url = value;
    }

    @JsonProperty("spdx_id")
    public String getSpdxID() {
        return spdxID;
    }

    @JsonProperty("spdx_id")
    public void setSpdxID(String value) {
        this.spdxID = value;
    }

    @JsonProperty("node_id")
    public String getNodeID() {
        return nodeID;
    }

    @JsonProperty("node_id")
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    @JsonProperty("html_url")
    public String getHTMLURL() {
        return htmlURL;
    }

    @JsonProperty("html_url")
    public void setHTMLURL(String value) {
        this.htmlURL = value;
    }
}


class Owner {
    private String login;
    private long id;
    private String nodeID;
    private String avatarURL;
    private String gravatarID;
    private String url;
    private String htmlURL;
    private String followersURL;
    private String followingURL;
    private String gistsURL;
    private String starredURL;
    private String subscriptionsURL;
    private String organizationsURL;
    private String reposURL;
    private String eventsURL;
    private String receivedEventsURL;
    private String type;
    private boolean siteAdmin;

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String value) {
        this.login = value;
    }

    @JsonProperty("id")
    public long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(long value) {
        this.id = value;
    }

    @JsonProperty("node_id")
    public String getNodeID() {
        return nodeID;
    }

    @JsonProperty("node_id")
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    @JsonProperty("avatar_url")
    public String getAvatarURL() {
        return avatarURL;
    }

    @JsonProperty("avatar_url")
    public void setAvatarURL(String value) {
        this.avatarURL = value;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarID() {
        return gravatarID;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarID(String value) {
        this.gravatarID = value;
    }

    @JsonProperty("url")
    public String getURL() {
        return url;
    }

    @JsonProperty("url")
    public void setURL(String value) {
        this.url = value;
    }

    @JsonProperty("html_url")
    public String getHTMLURL() {
        return htmlURL;
    }

    @JsonProperty("html_url")
    public void setHTMLURL(String value) {
        this.htmlURL = value;
    }

    @JsonProperty("followers_url")
    public String getFollowersURL() {
        return followersURL;
    }

    @JsonProperty("followers_url")
    public void setFollowersURL(String value) {
        this.followersURL = value;
    }

    @JsonProperty("following_url")
    public String getFollowingURL() {
        return followingURL;
    }

    @JsonProperty("following_url")
    public void setFollowingURL(String value) {
        this.followingURL = value;
    }

    @JsonProperty("gists_url")
    public String getGistsURL() {
        return gistsURL;
    }

    @JsonProperty("gists_url")
    public void setGistsURL(String value) {
        this.gistsURL = value;
    }

    @JsonProperty("starred_url")
    public String getStarredURL() {
        return starredURL;
    }

    @JsonProperty("starred_url")
    public void setStarredURL(String value) {
        this.starredURL = value;
    }

    @JsonProperty("subscriptions_url")
    public String getSubscriptionsURL() {
        return subscriptionsURL;
    }

    @JsonProperty("subscriptions_url")
    public void setSubscriptionsURL(String value) {
        this.subscriptionsURL = value;
    }

    @JsonProperty("organizations_url")
    public String getOrganizationsURL() {
        return organizationsURL;
    }

    @JsonProperty("organizations_url")
    public void setOrganizationsURL(String value) {
        this.organizationsURL = value;
    }

    @JsonProperty("repos_url")
    public String getReposURL() {
        return reposURL;
    }

    @JsonProperty("repos_url")
    public void setReposURL(String value) {
        this.reposURL = value;
    }

    @JsonProperty("events_url")
    public String getEventsURL() {
        return eventsURL;
    }

    @JsonProperty("events_url")
    public void setEventsURL(String value) {
        this.eventsURL = value;
    }

    @JsonProperty("received_events_url")
    public String getReceivedEventsURL() {
        return receivedEventsURL;
    }

    @JsonProperty("received_events_url")
    public void setReceivedEventsURL(String value) {
        this.receivedEventsURL = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String value) {
        this.type = value;
    }

    @JsonProperty("site_admin")
    public boolean getSiteAdmin() {
        return siteAdmin;
    }

    @JsonProperty("site_admin")
    public void setSiteAdmin(boolean value) {
        this.siteAdmin = value;
    }
}


class Permissions {
    private boolean pull;
    private boolean push;
    private boolean admin;

    @JsonProperty("pull")
    public boolean getPull() {
        return pull;
    }

    @JsonProperty("pull")
    public void setPull(boolean value) {
        this.pull = value;
    }

    @JsonProperty("push")
    public boolean getPush() {
        return push;
    }

    @JsonProperty("push")
    public void setPush(boolean value) {
        this.push = value;
    }

    @JsonProperty("admin")
    public boolean getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(boolean value) {
        this.admin = value;
    }
}

