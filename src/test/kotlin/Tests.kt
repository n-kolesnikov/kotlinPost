import org.junit.Assert.*
import org.junit.Test

class Tests {
    @Test
    fun add_idNotZero() {
        //arrange
        val comments1 = Comment(id = 0, text = "Класс")
        val copyright1 = Copyright(id = 0, link = "", name = "", type = "")
        val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
        val reposts1 = Reposts(count = 0, userReposted = false)
        val views1 = Views(count = 0)
        val donut1 = Donut(isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
        val firstPost = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "aaa",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = comments1,
            copyright = copyright1,
            likes = likes1,
            repost = reposts1,
            views = views1,
            postType = "",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = donut1,
            postponedId = 0
        )
        //act
        val addedPost = WallService.add(firstPost)
        //assert
        assertEquals(1, addedPost.id)
    }

    @Test
    fun update_idToTrue() {
        //arrange
        val comments1 = Comment(id = 0, text = "Класс")
        val copyright1 = Copyright(id = 0, link = "", name = "", type = "")
        val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
        val reposts1 = Reposts(count = 0, userReposted = false)
        val views1 = Views(count = 0)
        val donut1 = Donut(isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
        val firstPost = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "aaa",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = comments1,
            copyright = copyright1,
            likes = likes1,
            repost = reposts1,
            views = views1,
            postType = "",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = donut1,
            postponedId = 0
        )
        //act
        val addedPost = WallService.add(firstPost)
        val updatedPost = WallService.update(firstPost)
        //assert
        assertEquals(true, updatedPost)
    }

    @Test
    fun update_idToFalse() {
        //arrange
        val comments1 = Comment(id = 0, text = "Класс")
        val copyright1 = Copyright(id = 0, link = "", name = "", type = "")
        val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
        val reposts1 = Reposts(count = 0, userReposted = false)
        val views1 = Views(count = 0)
        val donut1 = Donut(isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
        val firstPost = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "aaa",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = comments1,
            copyright = copyright1,
            likes = likes1,
            repost = reposts1,
            views = views1,
            postType = "",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = donut1,
            postponedId = 0
        )
        val secondPost = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "aaa",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = comments1,
            copyright = copyright1,
            likes = likes1,
            repost = reposts1,
            views = views1,
            postType = "",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = donut1,
            postponedId = 0
        )
        //act
        val addedPost = WallService.add(firstPost)
        val updatedPost = WallService.update(secondPost)
        //assert
        assertEquals(false, updatedPost)
    }

@Test
fun success_commentAdd() {
    //arrange
    val comments1 = Comment(id = 0, text = "Класс")
    val copyright1 = Copyright(id = 0, link = "", name = "", type = "")
    val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
    val reposts1 = Reposts(count = 0, userReposted = false)
    val views1 = Views(count = 0)
    val donut1 = Donut(isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
    val firstPost = Post(
        id = 0,
        ownerId = 0,
        fromId = 0,
        createdBy = 0,
        date = 0,
        text = "aaa",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = true,
        comments = comments1,
        copyright = copyright1,
        likes = likes1,
        repost = reposts1,
        views = views1,
        postType = "",
        signerId = 0,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = donut1,
        postponedId = 0
    )
    //act
    val addedPost = WallService.add(firstPost)
    val addedComment = WallService.createComment(1,comments1)
    //assert
    assertEquals("Класс", addedComment.text)
    }

    @Test(expected = PostNotFoundException::class)
    fun fail_commentAdd() {
        //arrange
        val comments1 = Comment(id = 0, text = "Класс")
        val copyright1 = Copyright(id = 0, link = "", name = "", type = "")
        val likes1 = Likes(count = 0, userLikes = true, canLike = true, canPublish = true)
        val reposts1 = Reposts(count = 0, userReposted = false)
        val views1 = Views(count = 0)
        val donut1 = Donut(isDonut = true, paidDuration = 1, canPublishFreeCopy = true, editMode = "")
        val firstPost = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "aaa",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = comments1,
            copyright = copyright1,
            likes = likes1,
            repost = reposts1,
            views = views1,
            postType = "",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = donut1,
            postponedId = 0
        )
        //act
        val addedPost = WallService.add(firstPost)
        val addedComment = WallService.createComment(2,comments1)
    }
}