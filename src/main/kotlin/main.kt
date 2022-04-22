fun main() {
    val comments1 = Comment(count = 0,canPost = true, groupsCanPost = true, canClose = true, canOpen = true)
    val copyright1 = Copyright(id = 0,link = "", name = "", type = "")
    val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
    val reposts1 = Reposts(count = 0, userReposted = false)
    val views1 = Views (count = 0)
    val donut1 = Donut (isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
    val firstPost = Post(id = 0, ownerId=0, fromId = 0, createdBy = 0, date = 0, text = "aaa", replyOwnerId = 0, replyPostId = 0,
        friendsOnly = true, comments = comments1, copyright = copyright1, likes = likes1, repost = reposts1, views = views1,
        postType = "", signerId = 0, canPin = true, canDelete = true, canEdit = true, isPinned = true, markedAsAds = true,
        isFavorite = true, donut = donut1, postponedId = 0)
    val secondPost = Post(id = 0, ownerId=0, fromId = 0, createdBy = 0, date = 0, text = "aaa", replyOwnerId = 0, replyPostId = 0,
        friendsOnly = true, comments = comments1, copyright = copyright1, likes = likes1, repost = reposts1, views = views1,
        postType = "", signerId = 0, canPin = true, canDelete = true, canEdit = true, isPinned = true, markedAsAds = true,
        isFavorite = true, donut = donut1, postponedId = 0)
    println(WallService.add(firstPost))
    println(WallService.update(secondPost))
}