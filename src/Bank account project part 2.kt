fun main() {
    var accountBalance=(0..1000).random()
    val money=(0..1000).random()
    println("The account blance is $${accountBalance}.")
    println("The amount to be depostie withdrawn is $${money}")
    var output=0
    fun withdraw(amount:Int):Int{
        accountBalance-=amount
        println("Withdrawn : $${amount}. New account balance: $${accountBalance}.")
        return amount
    }
    output=withdraw(money)
    println("Output of withdraw operation : $${output}")

    fun debitWithdaw(amount:Int):Int{
        return when{
            accountBalance==0 ->{
                println("can't withdraw ,no money in this account !")
                accountBalance
            }
            amount > accountBalance ->{
                println("Not enough money on this account ! The checking balance is $${accountBalance} dollars.")
                0
            }
            else -> withdraw(amount)
        }
    }
    output=debitWithdaw(money)
    println("Output of debitWithdraw operation : $${output}.")
    fun deposite(amount:Int):Int{
        accountBalance+=amount
        println("" +
                "Deposted : $${amount}. New acount balance :$${accountBalance}.")
        return amount
    }
    output =deposite(money)
    println(" Output of deposte Operation :$${output}.")

    fun creditDeposit(amount:Int):Int{
        return when{
            accountBalance==0 ->{
                println("Deposit faild . your account is alrady paid off.")
                accountBalance
            }
            accountBalance+amount>0 ->{
                println("Deposte failed , you tried to pay off an amount greater than the credit balance. The checking balance is $${accountBalance} dollars.")
                0
            }
            accountBalance+amount==0 ->{
                println("You deposited just enough money to completely pay off the account.")
                deposite(amount)
            }
            else -> deposite(amount)
        }
    }
    output=creditDeposit(money)
    println("Output of creditDeposit operation: $${output}.")
}