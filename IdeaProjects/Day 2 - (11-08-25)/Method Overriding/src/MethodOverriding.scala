object MethodOverriding {
    class BankAccount {
      def balance(): String = "Account balance is $0"
    }

    class SavingsAccount extends BankAccount {
      override def balance(): String = "Savings account balance is $1000"
    }

    def main(args: Array[String]): Unit = {
      val savings = new SavingsAccount
      println(savings.balance())
    }
  }


