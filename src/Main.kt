// Group Members:
// 200159 - Juliet Nyakiamo
// 175852 - Lumumba Kimberly
// 192789 - Salama Shali
// 189600 - Gitacu Elizabeth

fun main() {

    println("\n Welcome to the Tenant Management System \n")

    // ================= PART 1 — VARIABLES =================

    val tenantId: Int = 1001  // tenantId uses val because the tenant ID should not be reassigned.
    // tenantId = 1002 brings error - Kotlin: 'val' cannot be reassigned.
    // tenantId cannot be reassigned because 'val' makes a variable immutable —
    // its value is fixed once it's assigned.
    //use var to make it compile

    val name: String = "Jane Wanjiku"   // name uses val because the tenant's name is not being changed.
    val phoneNumber: String =
        "0712345678" // phoneNumber uses val because the phone number is not being changed in this record.
    // Numbers can start with 0 which an Int would drop.
    // We don't do math with a phone number, so it should not be numeric

    val houseNumber: String = "A-204"  // houseNumber uses val because the house number is not being changed.
    val monthlyRent: Int = 25000   // monthlyRent uses val because the rent amount remains fixed for this record.
    var amountPaid: Int =
        15000   // amountPaid uses var because the amount paid can change when the tenant makes another payment.
    val block: Char = 'A'
    var isActive: Boolean = true

    // ================= PART 2 — DATA TYPES AND CASTING =================

    val rentAsDouble: Double =
        monthlyRent.toDouble()   // val rentAsDouble: Double = monthlyRent Does not compile. error - expected double
// this is to ensure type safety and prevent hidden bugs

    val registrationNumber: Long = 999_999_999L
    println("Company Registration Number: $registrationNumber")

    println("Amount paid before: $amountPaid")
    amountPaid = amountPaid + 5000
    println("Amount paid after: $amountPaid")

    // ================= PART 3 — STRINGS =================

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

    // ================= PART 4 — OPERATORS =================

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

    // ================= PART 5 — MAKING DECISIONS =================


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

    val monthsBehind = 15

    when (monthsBehind) {
        0 -> println("Rent is up to date")
        in 1..2 -> println("Early arrears")
        in 3..5 -> println("Serious arrears")
        in 6..12 -> println("Critical arrears")
        else -> println("Review tenant account")
    }

    val tenantStatus = "VACATED"
    when (tenantStatus) {
        "ACTIVE" -> println("Tenant is currently occupying the house")
        "VACATED" -> println("Tenant has vacated the house")
        "PENDING" -> println("Tenant's status is pending confirmation")
        else -> println("Unknown status")
    }

    // ================= PART 6 — RANGES AND LOOPS =================

    for (month in 1..12) {
        println("Month: $month")
    }

    for (month in 1..12 step 2) {
        println("Checking payment history for month $month")
    }

    for (month in 5 downTo 1) {
        println("Month remaining: $month")
    }

    val tenants = listOf("Jane", "Brian", "Mary", "David")
    for ((index, tenant) in tenants.withIndex()) {
        println("${index + 1}. $tenant") // index + 1 is used because withIndex() starts counting from 0, but a numbered list for people starts from 1
    }

    var vacantHouses = 0
// Version A
    while (vacantHouses > 0) {
        println("Checking vacant houses...")
    }  // while checks the condition BEFORE running the loop body, so it never runs if the condition starts false

// Version B
    do {
        println("Checking vacant houses...")
    } while (vacantHouses > 0) // do-while checks the condition AFTER running the loop body once, so it always runs at least one time.

    repeat(3) {
        println("Please pay your rent.")
    }

    // ================= PART 7 — LISTS AND ARRAYS =================

    val mutableTenantList = mutableListOf("Jane Wanjiku", "Brian Otieno", "Mary Achieng", "John Kamau")
    mutableTenantList.add("David Mwangi")
    mutableTenantList.remove("Brian Otieno")

    println("First tenant: ${mutableTenantList[0]}")
    println("Last tenant: ${mutableTenantList[mutableTenantList.size - 1]}")
    println(mutableTenantList)
    println("List size: ${mutableTenantList.size}")
    //tenantList.add("David Mwangi") - error Unresolved reference 'add'
    // use mutableListOf to fix

    val houseNumbers = arrayOf("A-101", "A-102", "A-103", "A-104")
    println("Second house number: ${houseNumbers[1]}")
    houseNumbers[0] = "A-201"
    println(houseNumbers.joinToString())

//   val houseNumbers = arrayOf("A-101", "A-102")
//   println(houseNumbers) it just prints the array's memory reference not the actual values stored inside it.

    println(houseNumbers.joinToString())        // Way 1
    println(houseNumbers.contentToString())     // Way 2

    val blockA = intArrayOf(1, 2, 3)
    val blockB = intArrayOf(4, 5, 6)
    val combined = blockA + blockB //puts the left-hand array's elements first, followed by the right-hand array's elements
    println(combined.joinToString())
    val combinedSwapped = blockB + blockA
    println(combinedSwapped.joinToString())

    // A MutableList can add/remove elements
   // while an Array has a fixed size set at creation that can never change.

    // An Array can have its elements changed even when declared with val
   //but a read-only List has no methods to modify its contents, regardless of val or var.

    // ================= PART 8 — NULL SAFETY =================


    var tenantEmail: String? = "jane@gmail.com"
//error: null cannot be a value of a non-null 'String'
//add the character '?'

    println("Tenant Email:  ${tenantEmail}")
//No, the property manager will view it as an error in the system

    val email = tenantEmail?: "Email not provided"
    println("Email: $email")


//Assumption var tenantEmail: String? = null
    println(tenantEmail?.length)// output will return null
    println(tenantEmail?.length ?: 0)// output will print the value 0 instead of null
    println(tenantEmail!!.length)//output will be the length of the email if it exists
//a double-bang operator; it forces a nullable var to be treated as a non-null
// used only when certain that a var will not be null at runtime

    var nextOfKin: String? = "Yvonne Wambui"
    println(nextOfKin?.uppercase() ?:"No next of Kin on record")


}