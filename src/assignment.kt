fun main() {

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

    displayMenu()
}

fun displayMenu() {
    println("=== MENU ===")
    println()
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
    println("   ============")
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

