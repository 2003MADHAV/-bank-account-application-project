fun main() {
    println("Welcome to your banking system")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    var accountType:String= ""
    var userChoice :Int= 0
    while (accountType==""){
        println("Chose an Option (1,2 or 3)")
        userChoice= (1..4).random()
        println("The selected option is $userChoice")

        // Determine account type based on user input
        accountType = when(userChoice){
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> {
                println("Invalid choice ,Please try again")
                continue
            }
        }
    }

    println("You have crated a $accountType account.")

}
