package cambrian

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    private final val template: String = "Hello, %s"
    private final val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting = Greeting(counter.incrementAndGet(), String.format(template, name))
}