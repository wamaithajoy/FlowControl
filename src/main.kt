fun main() {
  printoddnumbers()
      drinksataparty(5)
    printnumber()
   arrayofnames()


}
fun printoddnumbers(){
    for(i in 1..100){
        if(i%2 !=0){
            println(i)

        }

    }
}
fun arrayofnames():Int{
    var names= arrayOf("Imani","Faymar","Mark","Joice")
    var x=0
    for(name in names)
        if (name.length>5){
            x++

        }
    return x
}

fun drinksataparty(age:Int){
    when(age){
        1,2,3,4,5,6 -> println("serve a glass of milk")
        7,8,9,10,11,12,13,14 -> println("serve a bottle of fanta orange")
        else -> println("serve a bottle of cocacola")
    }


}
fun printnumber(){
    for(i in 1..100){
        println(i)
        if (i%3 ==0 && i%5 ==0){
            println("FizzBuzz")
        }
        else if(i%3 ==0){
            println("Fizz")

        }
      else if(i%5 ==0){
          println("Buzz")

        }
    }

}