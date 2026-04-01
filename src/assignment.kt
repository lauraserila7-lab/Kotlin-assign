//laura serila

fun main() {
    // =========================
    // Section 1: Student Info
    // =========================
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

    // =========================
    // Day of week check
    // =========================
    var dayOfWeek = "Monday"
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Weekend! Time to relax")
        "Monday" -> println("Back to work")
        "Friday" -> println("TGIF!")
        else -> println("Regular weekday")
    }

    // =========================
    // Traffic light examples
    // =========================
    val trafficLight1 = "RED"
    println(
        when (trafficLight1) {
            "RED" -> "STOP"
            "YELLOW" -> "CAUTION"
            "GREEN" -> "GO"
            else -> "INVALID"
        }
    )

    val trafficLight2 = "YELLOW"
    println(
        when (trafficLight2) {
            "RED" -> "STOP"
            "YELLOW" -> "CAUTION"
            "GREEN" -> "GO"
            else -> "INVALID"
        }
    )

    // =========================
    // While loop: print numbers 1 to 10
    // =========================
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // =========================
    // Task 4.2: do-while loop
    // =========================
    var count = 5
    do {
        println("Countdown: $count")
        count--
    } while (count >= 1)
    println("Blast off!")

    // =========================
    // Task 4.3: for-in with index
    // =========================
    val shoppingList = listOf("Milk", "Eggs", "Bread", "Butter", "Coffee")
    for ((index, item) in shoppingList.withIndex()) {
        println("[${index + 1}] $item")
    }

    // =========================
    // Task 4.4: ranges
    // =========================
    for (n in 1..20) print("$n ")
    println()

    for (n in 1 until 20) print("$n ")
    println()

    for (n in 2..20 step 2) print("$n ")
    println()

    for (letter in 'A'..'Z') print("$letter ")
    println()

    // =========================
    // Task 5.2: if-else as expression
    // =========================
    val age = 20
    val status = if (age >= 18) "Adult" else "Minor"
    println("Status: $status")

    // =========================
    // Task 5.3: max of two numbers
    // =========================
    val a = 15
    val b = 25
    val maxNumber = if (a > b) a else b
    println("Max Number: $maxNumber")

    // =========================
    // Section 2: Student Management System
    // =========================
    val students = listOf(
        "Alice" to 85,
        "Bob" to 42,
        "Charlie" to 67,
        "Diana" to 91,
        "Ethan" to 38
    )

    displayAllStudents(students)
    println("Average Score: ${getAverageScore(students)}")
    println("Top Student: ${findTopStudent(students)}")
    classifyStudents(students)
}

// =========================
// Functions
// =========================
fun displayMenu() {
    println("=== MENU ===")
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
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
}

fun displayAllStudents(students: List<Pair<String, Int>>) {
    println("All Students:")
    for ((name, score) in students) {
        println("Name: $name, Score: $score")
    }
    println()
}

fun getAverageScore(students: List<Pair<String, Int>>): Double {
    val total = students.sumOf { it.second }
    return total.toDouble() / students.size
}

fun findTopStudent(students: List<Pair<String, Int>>): String {
    val top = students.maxByOrNull { it.second }
    return top?.first ?: "No students"
}

fun classifyStudents(students: List<Pair<String, Int>>) {
    println("\nClassified Students:")
    for ((name, score) in students) {
        println("Name: $name, Score: $score, Grade: ${getGrade(score)}")
    }
}
