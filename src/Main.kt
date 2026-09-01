// Group Members:
// 200159 - Juliet Nyakiamo
// 175852 - Lumumba Kimberly
// 192789 - Salama Shali
// 189600 - Gitacu Elizabeth

fun main() {

    println("\n Welcome to the Tenant Management System \n")

    val tenantId : Int = 1001  // tenantId uses val because the tenant ID should not be reassigned.
    // tenantId = 1002 brings error - Kotlin: 'val' cannot be reassigned.
    // tenantId cannot be reassigned because 'val' makes a variable immutable —
    // its value is fixed once it's assigned.
    //use var to make it compile

    val name : String = "Jane Wanjiku"   // name uses val because the tenant's name is not being changed.
    val phoneNumber: String = "0712345678" // phoneNumber uses val because the phone number is not being changed in this record.
    // Numbers can start with 0 which an Int would drop.
   // We don't do math with a phone number, so it should not be numeric

    val houseNumber: String = "A-204"  // houseNumber uses val because the house number is not being changed.
    val monthlyRent: Int = 25000   // monthlyRent uses val because the rent amount remains fixed for this record.
    var amountPaid: Int = 15000   // amountPaid uses var because the amount paid can change when the tenant makes another payment.
    val block : Char = 'A'
    var isActive : Boolean = true
    val rentAsDouble: Double = monthlyRent.toDouble()   // val rentAsDouble: Double = monthlyRent Does not compile. error - expected double
// this is to ensure type safety and prevent hidden bugs

    val registrationNumber: Long = 999_999_999L
    println("Company Registration Number: $registrationNumber")

    println("Amount paid before: $amountPaid")
    amountPaid = amountPaid + 5000
    println("Amount paid after: $amountPaid")
    println(name + " lives in house " + houseNumber)
    println("$name lives in house $houseNumber") // this is easier to read
    println("Total rent for 6 months: KES ${monthlyRent * 6}")

    val receipt = """
    ===== RENT RECEIPT =====
    Tenant: $name
    House: $houseNumber
    Paid: KES $amountPaid
""".trimIndent() // .trimIndent removes common leading spaces from a multiline string so it aligns to left margin
    println(receipt)

    val greeting = "Dear Tenant"
    greeting.uppercase() // strings are immutable hence greeting wont be changed
    println(greeting) // println(greeting.uppercase()) would print in upper case

    val balance = monthlyRent - amountPaid
    println("Balance: KES $balance")

    //val percentPaid = (amountPaid / monthlyRent) * 100
    //println("Paid: $percentPaid%") // not correct, brings 0%. 2 integers are divided by one another and it throws away the decimal pert completely

    val percentPaid = (amountPaid * 100) / monthlyRent
    println("Paid: $percentPaid%")

    //val percentPaid = (amountPaid.toDouble() / monthlyRent) * 100
    //println("Paid: ${percentPaid.toInt()}%") ANOTHER WAY TO GET 80%

    val instalmentAmount = 6000
    val fullInstalments = monthlyRent / instalmentAmount
    val remainingAmount = monthlyRent % instalmentAmount

    println("Full instalments: $fullInstalments")
    println("Remaining amount: KES $remainingAmount")

    val totalRent = monthlyRent.times(6)

    val isRentPaid = amountPaid >= monthlyRent
    println("Is rent paid: $isRentPaid")

    val monthsInArrears = 1
    val needsReminder = balance > 0 && monthsInArrears > 1
    println("Needs reminder: $needsReminder") // false. 1 = 1 not > 1. && needs both to be true hence its false


//    if (balance <= 0) {
//        println("Rent is fully paid")
//    } else if (balance < 10000) {
//        println("Small outstanding balance")
//    } else {
//        println("Large outstanding balance")
//    }

    when {
        balance <= 0 -> println("Rent is fully paid")
        balance < 10000 -> println("Small outstanding balance")
        else -> println("Large outstanding balance")
    } // more readable


}