package cambrian

class Greeting(private val _id: Long, private val _content: String) {
    private val id: Long
        get() = _id

    private val content: String
        get() = _content
}