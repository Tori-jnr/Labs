//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Part 0 - SetUp
    println("\n Welcome to the Tenant Management System \n")

    //Tenant Details
    //Task 1.1

    val tenantId: Int = 1001
    val tenantName: String = "Yida"
    val phoneNumber: String = "0780072935"
    val houseNumber: String = "A-330"
    val monthlyRent: Int = 20000
    println("Key in Amount Paid: ")
    var amountPaid: Int = readln().toInt()
    println("Key in Added Amount: ")
    var addedAmountPaid:Int = readln().toInt()
    var amountPaidAfter = amountPaid + addedAmountPaid

     //val is used in tenant; Id,Name,phone,houseNumber and monthlyRent since the elements are immutable
    //var is used in amountPaid since the elements are mutable.

  //amountPaid genuinely needs to be var as it changes based on the payment made by the Tenant

    println("Tenant Id: $tenantId")
    println("Tenant Name: $tenantName")
    println("Phone Number: $phoneNumber")
    println("House Number: $houseNumber")
    println("Monthly Rent: $monthlyRent")
    println("Amount Before: $amountPaid")
    println("Amount After: $amountPaidAfter")

// Task 1.3 error; conflicting declarations
// The compiler refuses because it reads duplicate local values that is tenantId
// changing from val to var






}