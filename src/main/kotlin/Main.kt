fun main() {
    oddNumbers()

    var x= arrayNames(arrayOf("Dan","June","Glenn","Francis","Duke"))
    println(x)
    serveDrinks(4)
    serveDrinks(9)
    serveDrinks(19)
    numbersMultiple()



}
fun oddNumbers() {
 for ( nums in 1..100)
    if(nums % 2 != 0){
    println(nums)
}}
fun arrayNames(names:Array<String>):Int {
    var sum =0
    for (name in names) {
        if (name.length > 5) {
            sum++
        }
    }
return sum
}

fun serveDrinks(ages:Int){
    if(ages < 6) {
        println("Serve milk")
    }
    else if( ages in 6..14){
        println("serves a bottle of fanta orange ")}
        else {
        println(" serves a bottle cocacola")
    }
}
  fun numbersMultiple() {
      for (numbers in 1..100) {
          when {
              numbers % 3 == 0 -> println("Fuzz")
              numbers % 5 == 0 -> println("Buzz")
              numbers % 3 == 0 && 5 == 0 -> println("FuzzBuzz")

          }

          }

      }








