fun main() {

   println ("Welcome to Stephanie's Calculator!")

   // The calculator will continue to run
   while (true) {
      println ("Here are the options:")
      println("1. +")
      println("2. - ")
      println("3. *")
      println("4. /")
      println("5. Exit")
      print("Please enter your choice (1-5): ")

      //The User's choice will be stored in this variable
      val choice = readLine()?.toIntOrNull()
   // if the user chooses 5, it will stop the console
      if (choice == 5) {
         println("Bye!")
         break
      }
      // If the user writes another option it will stop the console
      if (choice !in 1..4) {
         println("Sorry, invalid choice. Bye!")
         break
      }

      print("Enter first number: ")
      //This will store the first number that the user writes
      val num1 = readLine()?.toDoubleOrNull()
      print("Enter second number: ")
      //This will store the second number that the user writes
      val num2 = readLine()?.toDoubleOrNull()
      //If the numbers are null, it will start again
      if (num1 == null || num2 == null) {
         println("Invalid number input. Please enter valid numbers.")
         continue
      }

      // In this variable, it will store the result depending on the operation selected
      val result = when (choice) {
         1 -> String.format("%.2f", add(num1, num2))
         2 -> String.format("%.2f", subtract(num1, num2))
         3 -> String.format("%.2f", multiply(num1, num2))
         4 -> {
            val divideResult = divide(num1, num2)
            if (divideResult != null) String.format("%.2f", divideResult) else null
         }
         else -> null
      }
      // it will implement the operation sign
      val operation = when (choice){
         1 -> "+"
         2 -> "-"
         3 -> "*"
         4 -> "/"
         else -> ""
      }

         if (result != null) {
             println("$num1 $operation $num2 = $result")
      } else {
         println("Sorry, an error occurred, try again")
            continue
      }
   }
}


