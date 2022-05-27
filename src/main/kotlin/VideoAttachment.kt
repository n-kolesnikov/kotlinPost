class Video
class VideoAttachment(val video: Video) : Attachments {
    override val type = "Video"
}