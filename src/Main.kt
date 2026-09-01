//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Part 0 - SetUp
    println("\n Welcome to the Tenant Management System \n")

    //Tenant Details
    //Task 1.1

    val tenantId: Int = 1001

    // Task 1.3 error; conflicting declarations
    // The compiler refuses because it reads duplicate local values that is tenantId
    // changing from val to var

    val tenantName: String = "Yida"

    //Task 2.1; Phone Number is stored as String because;
    // the compiler returns an error to Int inputs that begin with a zero
    // and also the phoneNumber could be written using the country's code which usually begins with a '+'

    val phoneNumber: String = "0780072935"
    val houseNumber: String = "A-330"
    val block: Char = 'A'
    var isActive: Boolean = true

    //Task 2.4; The underscore do not show in the output
    val registrationNumber: Long = 9_9_9_9_9_9_9_9_9

    val monthlyRent: Int = 25000
    val rentAsDouble: Double = monthlyRent.toDouble()
    println("Key in Amount Paid: ")
    var amountPaid: Int= readln().toInt()
    println("Key in Added Amount: ")
    var addedAmountPaid: Int = readln().toInt()
    var amountPaidAfter = amountPaid + addedAmountPaid

    //val is used in tenant; Id,Name,phone,houseNumber and monthlyRent since the elements are immutable
    //var is used in amountPaid since the elements are mutable.

    //amountPaid genuinely needs to be var as it changes based on the payment made by the Tenant

    println("Tenant Id: $tenantId")
    println("Tenant Name: $tenantName")
    println("Phone Number: $phoneNumber")
    println("House Number: $houseNumber")
    println("Monthly Rent: $rentAsDouble")
    println("Amount Paid Before: $amountPaid")
    println("Amount Paid After: $amountPaidAfter")
    println("House Staus: $isActive")
    println("Registration Number: $registrationNumber")

//Task 2.3; The code would change the data type of monthlyRent under rentAsDouble to double
// No it doesn't compile. Actual error: Initializer type mismatch: expected 'Double', actual 'Int'.

//PART 3 - Task 3.1
//println("" +tenantName+ "lives in house" +houseNumber)

// Task 3.2
    println("$tenantName lives in house $houseNumber")

//The string template makes the code more readable
// output when using string template; Yida lives in house A-330
// output when using concatenation; Yidalives in houseA-330
//
//
//
    println("Total Rent Amount for 6 months ${rentAsDouble * 6}")

///Task 3.4
    println("\n===== RENT RECEIPT ======\n")
    println("Tenant Name: $tenantName")
    println("House Number: $houseNumber")
    println("Amount Paid After: $amountPaidAfter")

//Task 3.5
//The code should print the output in uppercase val greeting = "Dear Tenant"
    val greeting = "Dear Tenant"
    greeting.uppercase()
    println(greeting)
// greeting remains unchanged since it is a val;immutable
//

//PART 4; Task 4.1
    var balance = rentAsDouble - amountPaid
    println("Balance: $balance")


//Task 4.2
// output of (20000/25000) * 100 = 80%

    //var percentPaid = (amountPaid / monthlyRent) * 100
   // println("Paid Percentage: $percentPaid")

//Obtained output = 0
// amountPaid was set to have a data type In so when the calculations begin within the bracket the obtained answer; 0.8 is truncated to the nearest Int hence the output = 0
//Changing the data type of amountPaid to double so that it reads
    //println("Key in Amount Paid: ")
   // var amountPaid: Double = readln().toDouble()
//Computing the multipication of the amountPaid








































}