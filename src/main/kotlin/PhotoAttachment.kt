class Photo(val photoName: String)
data class PhotoAttachment(val photo : Photo) : Attachments {
    override val type = "Photo"
}