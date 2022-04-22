object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post{
        posts += post
        posts.last().id = posts.size
        return posts.last()
    }

    fun update(post: Post):Boolean{
      for (i in posts){
          if (i.id == post.id) return true
      }
        return false
    }
}