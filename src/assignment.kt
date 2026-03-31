fun main() {
//section 1
    var studentName: String = "Laura Serila"
    println("Student Name: $studentName")

    val studentId: Int = 2024001
    println("Student ID: $studentId")

    var GPA: Double = 3.75
    println("GPA: $GPA")

    val isEnrolled: Boolean = true
    println("Is Enrolled: $isEnrolled")

    val middleInitial: Char = 'J'
    println("Middle Initial: $middleInitial")

    val studentRecord =
        "Student: $studentName $middleInitial. (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled"
    println(studentRecord)

    var phoneNumber: String? = null
    println("Phone Number: ${phoneNumber ?: "Not Provided"}")


    println("Discounted price: ${calculateDiscount(100.0, 10.0)}")
    println("Grade for 78: ${getGrade(78)}")
    println("Is 4 even? ${isEven(4)}")

    // Day of week check
    var dayOfWeek = "Monday"
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Weekend! Time to relax")
        "Monday" -> println("Back to work")
        "Friday" -> println("TGIF!")
        else -> println("Regular weekday")
    }
}
//section 2
fun displayMenu() {
    println("=== MENU ===")
    println()
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
    println("============")
}

fun calculateDiscount(price: Double, discountPercent: Double): Double {
    return price - (price * discountPercent / 100)
}

fun getGrade(score: Int): String {
    return when (score) {
        in 80..100 -> "A"
        in 65..79 -> "B"
        in 50..64 -> "C"
        in 35..49 -> "D"
        else -> "F"
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
    val trafficLight = "RED"

    val trafficAction = when (trafficLight) {
        "RED" -> "STOP"
        "YELLOW" -> "CAUTION"
        "GREEN" -> "GO"
        else -> "INVALID"
}
    println(trafficAction)
}

