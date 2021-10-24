fun main (){
   /*
   var can be changed·modified
   val variables cannot
    */
   var name = "kimyoungjae"
   val age = 25
   name = "hi~"
   println(name)
   println(age)
   println("Hello world")

   val myNum = 5             // Int
   val myDoubleNum = 5.99    // Double
   val myLetter = 'D'        // Char
   val myBoolean = true      // Boolean
   val myText = "Hello"      // String
   println("$myNum $myDoubleNum")

   val time = 20
   if (time < 18){
      println("Good day.")
   } else{
      println("Good evening.")
   }

   val day = 4

   val result = when (day) {
      1 -> "Monday"
      2 -> "Tuesday"
      3 -> "Wednesday"
      4 -> "Thursday"
      5 -> "Friday"
      6 -> "Saturday"
      7 -> "Sunday"
      else -> "Invalid day."
   }
   println(result)

   var i = 0
   while (i<5){
      println(i)
      i++
   }

   var j = 0
   while (j < 10) {
      println(j)
      j++
      if (j == 4) {
         break
      }
   }

   var k = 0
   while (k < 10) {
      if (k == 4) {
         k++
         continue
      }
      println(k)
      k++
   }

   val names = arrayOf("Youngjae","Youngjae2","Youngjae3")
   println(names[0])
   println(names.size)
}