import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    console.log(message)

    val email = document.getElementById("email") as HTMLInputElement
    email.height = 50
    email.width = 250
    email.value = "helpdesk@zionex.com"

    val chk = document.getElementById("chk") as HTMLInputElement
    email.onfocus = {
        window.alert("The checkbox value is: " + chk.checked)
        chk.focus()
    }

    chk.onclick = {
        if (chk.checked)
            email.value = ""
        else
            email.value = "helpdesk@zionex.com"
    }
}