object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post
        posts.last().id = posts.size
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (i in posts) {
            if (i.id == post.id) return true
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        var b = false
            for (i in posts) {
                if (i.id == postId) {
                    b = true
                    comments += comment
                    comments.last().id = comments.size
                }
            }
        if (!b) throw PostNotFoundException("Такого поста нет")
        return (comments.last())
    }
}