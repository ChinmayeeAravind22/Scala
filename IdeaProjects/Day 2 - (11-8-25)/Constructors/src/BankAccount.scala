class BankAccount(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    if (amount > 0) balance += amount
  }

  def currentBalance: Double = balance
}

object BankAccount {
  def apply(initialBalance: Double): BankAccount = new BankAccount(initialBalance)

  def reset(account: BankAccount): Unit = {
    account.balance = 0
  }
}

object Demo {
  def main(args: Array[String]) = {
    val account = BankAccount(1000.0)
    println(s"Initial balance: ${account.currentBalance}")
    account.deposit(500.0)
    println(s"Balance after deposit: ${account.currentBalance}")
    BankAccount.reset(account)
    println(s"Balance after reset: ${account.currentBalance}")
  }
}