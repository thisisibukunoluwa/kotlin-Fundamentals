import java.util.random;
// https://developer.android.com/courses/kotlin-bootcamp/overview
//Kotlin Apprentice 
import kotlin.math.*
import kotlin.with 

fun main() {
    println("Hello,World")
    println("I")
    println("know") 
    println("Kotlin")
    println("well.")

    print("Hello,World")
    print("I")
    print("know")
    print("Kotlin")
    print("well.")

    //Integers
    println(22 / 7)

    //Decimal Numbers
    println(22.0/7.0)

    //The remainder Operation 
    28 % 10 

    // If we want to compute the same thing using decimal numbers 
    28.0 / 10.0
    // The results is identical to using a format specifier 
    println("%.0f".format(28.0 % 10.0))

    //Shift operations 
    // These are infix operations that you plac ein between operations so it looks like an operation 
    // The Shift left and Shift right operations take the binary form of decimal number and shift the digits left or right then they return the new decimal form of the new binary number 
    //  The digits that come in to fill the empty spots on the right become zero 0 
    // Shift left - shl
    //Shift right - shr

    println(1 shl 3 )
    println(32 shr 2)
    // On reason for using shifts is making multiplting or dividing by powers of two easy 
    // Shifting left by one is the same as multiplying by two, shifiting left by two is the same thing as multiplying by four and so on....

    //Operator Precedence in Kotlin 
    350 / 5 + 2 
    // dvides by 5 then adds 2 
    350 / (5 + 2)
    // evaluates 5 + 2 then 350 divides it 

    //Math functions 
    println(sin(45 * PI / 180));

    println(sin(135 * PI / 180));

    println(sqrt(7.9));

    println(max(8, 137));

    min(-3 ,-14);

    //Naming data 
    // You use the val keyword to declare constants , it acnnot be reassigned 
    val number : Int = 10
    // The IDE will show an error 
    // number = 14;
    val pi : Double = 3.14159

    // you can also add the const keyword to val to make it a compile time constant 
    

// when you have data that might cange over time you declare it with a variale with var 

    // var variableNumber = 0


    // variableNumber = 0
    // variableNumber = 1_000_000

    // increment and decrement
    var counter : Int = 0;

    counter += 1 
    
    counter -= 1 

    //same thing as 
    var counter1 :Int = 0;

    counter1 = counter1 + 1 

    counter1 = counter - 1 

    //Mini Exercises 

    //Challenges 


    //Types and operations 
    // A type represents a set of values adn the operaions that can be performed on them 

    //Type Conversion
    var integer:Int = 100
    var decimal:Double = 12.5
    // integer = decimal 

    //You will get an error - a type mismatch 
    // Some programmng languages are not as strict and will allow the type conversin , koltin willl not allow you to do that 
    // instead of assigning , you need to say you want to explicitly convert the tyep 

    // you now tell kotlin you want to convert fro the original type Double to the new type Int 

    // also, assigning a deicmal value to the integer results in a loss of precision 


    integer = decimal.toInt()

    print(integer)

    //Operators with mixed types 

    var hourlyRate:Double = 19.5

    var hoursWorked:Int = 10 

    //hours worked is converted to a double here,
    var totalCost : Double = hourlyRate * hoursWorked.toDouble();

    // but the conversion is unnecessary , kotlin will alow you to multiply these values wihtout any conversion 

    val totalCost1: Double = hourlyRate * hoursWorked


    //Sometimes you don't need to tell kotlin the type verytime , by type inference the compile knows 
    var typeInferredInt = 90

    // Here kotlin infers the type as an int , what if you want it to be inferred as a double 
    var wantADouble = 3.toDouble();

    // something you may be tempted to try ( and something i though could work is this)
    //this is not allowed
    //The integer literal does not conform to the expected type Doublekotlin(CONSTANT_EXPECTED_TYPE_MISMATCH)
    // var actuallyDouble : Double = 3 ;

    //Strings 
    //At its base, a computer needs to be able to translate a character intot the computers language and it does so by assigning eacch character a different number .This forms a two way mapping form character to number called character set , the most standrad character set mapping today , is called Unicode 
    // The number associated with each number is called a code point 
    val characterA: Char = 'a';
    val stringDog : String = "Dog";

    //Concatenation
    // you can concatenate strings with the addition operator or the addition assignment operator 
    var message = "Hello " + "World "
    val name = "hwywisung"  
    message += name;
    println(message);

    //String templates 
    val messageTemplate = "hello my name is $name"
    println(messageTemplate)

    val oneThird = 1.0 / 3.0

    val oneThirdLogString = "one third is $oneThird as a decimal";

    val oneThirdLogString1 = "one third is ${1.0 / 3.0} as a decimal"

    // for the one thrid value, its result in the stirng temlate will be 0.33333333333333333, because it takes infinite characters to represent one third as a decimal , because it is a preating number 

    // that one of the disadvantages of template strings, it offers no way to customize the output 

    //Multi line Strings 
    val bigString = """
    | you cna have
    | a string that
    |contains multiple ines
    |by doing this.
    """.trimMargin()
    //The pipe hcaracter at the start of each kine prevents the stirng from having leading spaces
    print(bigString)

    //Pairs and Triples 
    // Sometimes data comes in groups e.g a pair of (x,y) coordinates on a 2d grid 
    //SImlarly a set of coorodinates on a 3d grid is comprised of an xvalue a yvalue and a z value'
    // in kotlin we can represent these types of data using a Pair or a Triple (other languages use a type called tuple)
    // if you want to have more than three vaues you use what kotlin calls a data class 

    val coordinates: Pair<Int, Int> = Pair(2,3)

    // leveraging on type inference 
    val coordinatesInferred = Pair(2,3)

    // we can even make this more concise using the to operator 
    val coordinatesWithTo = 2 to 3 

    //pair of doubles can be created to 
    val coordinateDoubles = Pair(2.1,2.3)

    // hw to acccess data inside a pair 
    val x1 = coordinates.first
    val y1 = coordinates.second

    // you can also use a destructuring  decalration on individual parts fo the pair 

    val (x,y) = coordinates 

    println(x);
    println(x1);
    println(y);
    println(y1);

    //Triples 
    val coordinates3D = Triple(1, 3, 5)

    // destructuring declaration
    val (x3, y3, z3) = coordinates3D

    val x6 = coordinates3D.first
    val y6 = coordinates3D.second
    val z6 = coordinates3D.third

    // if you want to ignore a certain element of a Pair or Triple, you can replace the space its uspposed to occupy (corresponding part of the variable in the declaration) with an underscore 
    val(x5,y5, _) = coordinates3D

    //Mini exercises
    val DDmmYY = Triple(4,29,2023)

    val month = DDmmYY.first
    val day = DDmmYY.second 
    val year = DDmmYY.third 

    val (_,mth,yr) = DDmmYY

    val monthModified = DDmmYY.first.toString();

    val newPair = Pair(monthModified,year) 

    //Number Types 
    //primitives require less memory - they are better for performance , but they also lack some of the features of Integer , in Kotlin you don;t have to worry whether you are using a primitive type or an objct type, kotlin handles that complexity for you 

    // You have been using double to represent fractional numbers, Kotlin offers a Float type that has lessr anrge and precision but occupies or has less sotrage size , regardless of that odern ahradware has been optimized for Doubles , so use doubles unless ypu have a good reason not to 

    val a : Short = 12
    val b : Byte = 120
    val c : Int = -10000000

    val answer = a + b + c 

    //answer will be in Int 
    println(answer)

    //Any , Unit and Nothing Types 
    // The nay type can be thought of as the mother of all types (except nullable types) any other type like Integer or String can still be considered as Any 
    
    //Unit is a special type that only ever represents one value called the unit , it is similar to the void type in java except it makes working with generics easier , every function which does not whihc does not epxlicitly return a type (for example String) returns Unit 

    val anyNumber : Any = 42
    val anyString :Any = "42"

    fun add() {
        val result = 2 + 2 
        println(result)
    }
    // The return type UNit is imlied so the above function is the same as this 
    fun add1():Unit {
        val result = 2 + 2
        println(result)
    }
    // Nothing is a type that is helpful for decalring that a function not only doesn't return anything but also never completes 
    //Challenges 
    val coordinatesS = Pair(2,3)

    val row = coordinatesS.first
    val column = coordinatesS.second 

    //Basic Control Flow 
    //Comparison Operators
    val doesOneEqualTwo = (1 == 2)

    val doesOneNotEqualTwo = (1 != 2)

    // String equality
    // you can compare strings for equality, and just as you can do with numbers, you can chck if one is lrager than the other 
    val guess = "dog"
    val dogEqualsCat = guess == "cat";
    val order = "cat" < "dog"
    println(guess)
    println(dogEqualsCat) 
    // we can encapsulate code with the use of braces 
   
    // Advanced Control Flow
// Ranges
// The range data type represents a sequence of countable integers
    val closedRange = 0..5
    // the .. signifes that the sequence is closed , means that the range goes from 0 to 5 inclusive

    //Second theres a half open range 
    val halfOpenRange = 0 until 5 
    // the range goes from 0 to 4 

    // theres a decreasing range 
    val decreaasingRange = 5 downTo 0 

    //for loops 
    val count = 10 

    var sum = 0 
    for (i in 1..count) {
        sum += i
    }
    //repeat loops 
    // you can use it when you want ot loop a number of times and you don't want to use the loop constant at all
    var sum1 = 1
    var lastSum = 0
    repeat(10) { 
        val temp = sum1
        sum1 += lastSum
        lastSum = temp
    }
    //Steps in loops 
    // it is also possible to perform certain iterations in tha range 
    // the loop will only run through the values that the step falls on 
    var sum2 = 0 
    for (i in 1..count step 2 ) {
        sum2 += i 
        println(i)
    }
    var sum3 = 0;
    for (i in count downTo 1 step 2 ) {
        sum3 += i 
        println(i) 
        println("step2")
    }
    //labelled statements 
    // you want to skip a loop iteration for a particular case without breaking out of the loop entirely , this can be done with the continue statement 
    sum = 0 
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop
            }
           sum += row * column
        }
    }
    //mini exercises
    // When expressions
    // You can also control flow via the when expression it executew d9fferent code depending on the value of a variable or constant 
    val number1 = 10 
    when (number1) {
        0 -> println("Zero")
        else -> println("Non-zero")
    }
    // to handle a specific case, you add the value followed by -> which indicates the code will execute if the condition is met 
    when (number1) {
        10 -> println("Its ten")
    }
    val string = "Dog"
    when (string) {
        "Cat","Dog" -> println("Animal is a house pet.")
        else -> println("Animal is not a house pet.")
    }
    // You can also give your when expressions more than one branch , and because its an expression you can use it to return a value 
    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }
    println(numberName)
    // Advanced when expressions 
    val hourOfDay = 12
    val timeOfDay:String

    timeOfDay = when(hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9 , 10 , 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late Evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)
    // Using expressions with ranges 
    val hourOfDay1 = 7
    val timeOfDay1 : String

    timeOfDay1 = when(hourOfDay1) {
        in 0..5 -> "Early Morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late Evening"
        else -> "INVALID HOUR"
    }
// when there are multiple branches the expression will execute the first one that matches 
// Using when expressions with conditions 
 when {
    number % 2 == 0 -> println("Even")
    else -> println("Odd.")
 }
 // Another example of using conditions in when expressions 
 val (x4, y4 , z4) = Triple(3,2,5)

 when {
    x4 == 0 && y4 == 0 && y4 == 0 -> println("Origin")
    y4 == 0 && z4 == 0 -> println("On the x-axis at x = $x4")
    x4 == 0 && y4 == 0 -> println("On the y-axis at y = $y4")
    x4 == 0 && y4 == 0 -> println("On the z-axis at z = $z4")
}
when {
    x4 == y4 -> println("Along th y = x line")
    y4  == x4 * x4 -> println("Along the y = x^2 line")
}
//Mini exercises 
//Challenges 

//Functions 
 fun printMyName() {
    println("My name is Joe Howard")
 }
 // function parameters
 fun printMultipleOfFive(value:Int) {
    println("$value * 5 = ${value * 5}")
 }

 printMultipleOfFive(10)

 fun printMultipleOf(multiplier : Int, value:Int = 1) {
    println("multiplier * $value = ${multiplier * value} ")
 }
printMultipleOf(4)

// Return values
fun multiply(number:Int, multiplier: Int):Int {
    return number * multiplier
}
// This function returns both the product and quotient of the two parameters by returning a Pair containing two Int values 
fun multiplyAndDivide(number:Int,factor:Int):Pair<Int,Int> {
    return Pair(number * factor, number / factor)
}
val (product,quotient) = multiplyAndDivide(4,2)

// If a function consists solely of a single exressio, you can assign the expression to the function using = while at the same time not using braces, a return type, or a return statement 
fun multiplyInferred(number:Int, multiplier:Int) = number * multiplier;

// function parameters are constants by default meaning they can't be modified , its equivalent to declaring the value parameter with val 

// fun incrementAndPrint(value: Int) {
//     value += 1
//     print(value)
// }
// this results in an error - value cannot be reassigned 
fun incrementAndPrint (value:Int):Int {
    val newValue = value + 1 ;
    println(newValue);
    return newValue;
}

//Overloading lets you define similar functions with the same name
// The return type alone is not enough for the compiler to dustinguish between two functions 
// It is ususally achived thorugh a difference in parameter list - 
// A different number of parameters 
// Different parameter types 


fun getValue(value:Int): Int {
    return value + 1 
}
fun getValue(value:String):String {
    return " The value is $value "
}
//declaring this one gives an error 
// fun getValue(value:String):Int {
//     return value.length
// }
// Mini exercises 

fun printFullName(firstName:String,lastName:String) {
    println("$firstName $lastName")
}
printFullName("Timothy","Blake")

fun calculateFullName(firstName:String,lastName:String):String {
    val fullName =  "$firstName $lastName"
    return fullName
}
calculateFullName("rumuokoro","ojekwe")

fun calculateFullName(fullName:String):Pair<String,Int> {
    val fullName =  "$fullName"
    val len = fullName.length
    return Pair(fullName,len)
}
calculateFullName("ovwevwevwevwevwvwe")

//Functions as variables 
// functions in kotlin are simply another data type , you can asisgn them to variables 
fun addInt(a:Int,b:Int):Int {
    return a + b 
}

// You can assign the function to the variable using the method reference operator 
var function = ::addInt 

// here the name of the variable is function and its type is inferred as (Int,Int)-> Int
// Now you canuse function just like you would use add
function(4,2)

fun subtract(a:Int,b:Int):Int {
    return a - b 
}
// You can set the function variable from before to your new subtract function, because the parameter list and return type of subtract are compatible with the type of the function variable 
function = ::subtract 

function(4,2)

//The fact that you can assign functions to functions come in handy because it means you can pass funcitons to other functions 
// Its extremely useful to be able to pass functions to other functions it can help you write resuable code 
//Assigning functions to varibales and p[assing function to other funcitons is one aspect of functional programming 

fun printResult(function:(Int,Int) -> Int, a: Int, b: Int) {
    val result = function(a,b)
    print(result)
}
printResult(::addInt,4,2);

//PrintResult calls the passed in function, passing into it the two Int parameters , then it prints the result to the console 

//Challenges 
// fun isNumberDivisible(number:Int, divisor:Int):Boolean {
//     if (number % divisor == 0) return true 
//     return false;
// }

// fun isPrime(number:Int):Boolean {
//     if(number < 0 ) return false 

// }

// isPrime(6);
// isPrime(13);
// isPrime(8893); 

//Recursive functions 
fun fibonacci(number:Int):Int {
    if (number < 0) return 0 
    if (number == 1 || number == 2) return 1 
    return fibonacci(number - 1) + fibonacci(number - 2 )
}
println(fibonacci(6))
println(fibonacci(8))
// memoized version 

// Nullability 
// nullable types allows you to represent not just a value but the absence of a value 
// A valid value that can represent a special condition , such as the absence of a value is called a sentinel value 
// Null is the name given to the absence of a value . A nullable value is allowed to hold either a value or null 

//nullbale types introduce the ambiguity by using sentinel types 

var errorCode:Int? 
// Nullable types can never be inferred from initialization values 
 
// Mini exercises 

var myFavoriteSong:String? = "in a sentimental mood"

var myFavoriteSong1:String? = null;

val parsedInt = "10".toIntOrNull();

// It is a nullable because the string method tries to parse the string to a number into an integer , if it can't do so , it will return null

var result1:Int? = 30 

// since result1 is nullable , this would not work 

// println(result1 + 1 );

// we can use the not - null assertion operator , we want to look inside 'the box' and take the value , the result of the non null type 
// the box here represnting the nullable box , that can hold a value

var authorName:String? = "Joe Howard"
var authorAge:Int? = 24 

val ageAfterBirthday = authorAge!! + 1 

println("After their next birthday, author will be $ageAfterBirthday")

 authorAge = null;

 // an exception will be thrown if we use the not null assertion operator on a variable that has no value 

//  println("After two birthdays, author will be ${authorAge!! + 2}");

// The null pointer exception occurs because the variable contains no value when you try to use it , alos you get this exception at runtime not at compile time 

// SmartCasts 
// Under certain conditions, you can check whether a nullbale has a value, and if so, you can use the variable as if it were not null using nullable checks in this type of way is an example of Kotlin smart casts 
// if the nullable contains a value , the if expression executes the first block of code, in which kotlin will smart cast authorName to a regular non null string , if the nullable doesn't contain a value the the if expression executes the else block 
// smart casts are much safer than non null assertions 
// non null assertions are only best when a nullable is guaranteed to contain a value 

var nonNullableAuthor:String
var nullableAuthor:String?

if (authorName != null) {
    nonNullableAuthor = authorName
} else {
    nullableAuthor = authorName;
}

// mini exercises 
if (myFavoriteSong != null) {
    println(myFavoriteSong)
} else {
    println("I don't have a favorite song");
}

if (myFavoriteSong != null) {
    myFavoriteSong = null;
} else {
    myFavoriteSong = "no favorite song"
}

// Safe calls 
// We can use the the .? operator to safely access nullable values eg maybe we want to access the lenght of a nullable string , using smart csting will be overkill 

var nameLength = authorName?.length;

 var nameLengthPlusFive = nameLength?.plus(5);

println("Authors name length plus 5 is $nameLengthPlusFive")

// the let() ? function 
// The safe call operator provides another way to use smart casts to work with the non null value inside a nullable, via the let() function form the standard library 

authorName?.let {
    nonNullableAuthor = authorName;
}

// Elvis operator 
// Theres another way to get a value from a nullable , we can use the elvis operator , you ue it when you want to get the value out of the nullable no matter what - and in the case of null you will use a default value 

var nullableInt:Int? = 10 
// basically mustHaveResult would contain the value of nullableInt , but if the value is null , then make it zero 
var mustHaveResult = nullableInt ?: 0 ;

var nullableInt1:Int? = 10 

// this is the less concise version 
var mustHaveResult1 = if (nullableInt != null) nullableInt else 0 ;



//Challenges 
// var answer1 : Int = 0;

// fun divideIfWhole(value:Int,divisor:Int) {
//     // num / divisor == 0 - thats when the recursive function stops (base case)

//     var quotient = value / divisor 

//     if (quotient  ) {
//         println("it divides $answer1 times");
//     }
//     else {
//         answer1 += 1 
//         println(answer1)
//         divideIfWhole(quotient, divisor)
//     }
// }

// divideIfWhole(100, 5);


// Collection and lambdas 
// Arrays and lists
// easiest way to create an array in kotlin is by using the arrayOf() function 

// Kotlin infers the type as Array<Int> 
val evenNumbers = arrayOf(2,4,6,8)

// it is alos possible to create an array with all of its values set to a default value 

val fiveFives = Array(5, { 5 })

// declare arrays that are not going to change as constants using val 

val vowels = arrayOf("a","e","i","o","u")

// creating arrays of primitive types 
val oddNumbers = intArrayOf(1,3,5,7)

val zeros = DoubleArray(4)

//iterating over an array 

for (arg in vowels) {
    println(arg)
}

vowels.forEach {
    arg -> println(arg)
}

//Lists
// A type that is conceptually similar to an array is a list , arrays are usually more efficientin terms of raw performance , but lists have the additional feature of being dynamically sized 


// The list type inferred here is List<String>
// under the hood, the type being used to store innerPlanets is ArrayList 
val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")

// we can explicitly declare the make an arrayList using arrayListOf 

val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth","Mars")

// when creating empty lists ,you need to explicitly specify the type 
// but note that the list returned from listOf is immutable, meaning you can't do anythng with it , to be able to change the list , we have to create a list using mutableListOf 

val subscribers:List<String> = listOf()

val subscribers1 = listOf<String>()

// Mutable Lists 
val outerPlanets = mutableListOf("Jupiter","Saturn","Uranus","Neptune")

val exoPlanets = mutableListOf<String>()

val players = mutableListOf("Alice","Bob","Cindy","Dan")

print(players.isEmpty())

if(players.size < 2 ) {
    println("We need at least two players")
} else {
    println("Let's start")
}

// gets the first value in a list of throws an exception if empty 
var currentPlayer = players.first()

println(currentPlayer)

// gets the last value in a list of throws an exception if empty
var lastPlayer = players.last()

// returns the element with the lowest value - not the lowets index! take note 
// instead of throwing an exception , minOrNull returns a nullable type , so you need to check if the value returned is null

val minPlayer = players.minOrNull()

minPlayer.let {
    println("$minPlayer will start")
}

// both methods will not return the same value 
println(arrayOf(2 , 3 , 1).first())

println(arrayOf(2,3,1).minOrNull())

val maxPlayer = players.maxOrNull()

if (maxPlayer != null) {
    println("$maxPlayer is the MAX") 
}

// using indexing 
val firstPlayer = players[0]
println("first layer is $firstPlayer")

// the indexing syntax is equivalent to using get() on the array or list and passing in the index as argument 

val secondPlayer = players.get(1)

// if you try to access an index that is out of bounds of the array you will get an exception 
// val player = players[4] 

val upcomingPlayersSlice = players.slice(1..2)

println(upcomingPlayersSlice.joinToString())

//checking for an element 
    fun isEliminated(player:String):Boolean {
        return player !in players
    }
    println(isEliminated("Bob"));

    // testing for the existenc of an element in a specific range 
    players.slice(1..3).contains("Alice")

    //modifying lists
    //adding elements 
    players.add("Ella")

    players += "Joy"

    println(players.joinToString())

    // while arrays are of fixed size , you can use += operator on an array declared as var 
    // but we are not appending to a new array , we are creating a new array thathas the additional element and assigning the new array to the variable 

    var array3 = arrayOf(1,2,3)

    array3 += 4 

    println(array3.joinToString())

    //inserting elements 
    players.add(5,"Frank")

    val wasPlayerRemoved = players.remove("Frank")
    println("it is $wasPlayerRemoved that frank was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")

    // remove returns a boolean indicating whether a boolean was rmeoved from the list or not , removeAt returns the element that was removed from the list 

    //mini exercise
    println(players.indexOf("Dan"))

    //updating elements 
    println(players.joinToString())


    players[4] = "Franklin"

    println(players.joinToString());

    players[3] = "Anna"

    players.sort()

    println(players.joinToString())

    // when updating elements the set method is equivalent to updating with bracket 

    players.set(3, "bisi")

    val scores = listOf(2, 2, 8, 6, 1)

    for (players in players) {
        println(players)
    }

    // if you need the index of each element you can iterate over the return values of list's withIndex() emthod which can be destructed to the elements index and value 
    for((index,player) in players.withIndex()) {
        println("${index + 1}. $player")
    }

    fun sumOfElements(list:List<Int>):Int {
        var sum = 0 
        for (number in list) {
            sum += number
        }
        return sum
    }

    println(sumOfElements(scores)) 

    //mini exercise 
    for ((index,player) in players.withIndex()) {   
        println("${player}'s score is ${scores[index]}");
    }
    //Nullability and collection types 
    // is the collection nullable? or are the elements nullable 
    // here the list itself can be null
    var nullableList:List<Int>? = listOf(1,2,3,4);

    nullableList = null

    // if you want to make the elements null 
    var listOfNullables:List<Int?> = listOf(1,2,null,4);
    // you cant set the list itself you will get an error 
    // listOfNullables = null
    // you can now let both the list and the elements be null
    var nullableListOfNullables:List<Int?>? = listOf(1,2,null,4)

    nullableListOfNullables = null;

    //Challenges 
    // val array1 = Array<Int>();
    // val array2 = arrayOf();
    val arrayThree:Array<String> = arrayOf();

    var array4 = arrayOf(1,2,3);;

    println(array4[0])
    println(array4[5])
    array4[0] = 4

    val array5 = arrayOf(1,2,3)

    array5[0] = array5[1]
    // inferred type is Int so you can't assign an String
    // array5[0] = "Six"
    //val cannot be reassigned
    // array5 += 6
    // for item in array5 {println(item)}


    // fun removeOne(item:Int, list:List<Int>):List<Int> {

    // }
    // fun remove(item:Int, list:List<Int>):List<Int> {

    // }
    // fun reverse(array:Array<Int>):Array<Int> {

    // }
    // val random = Random()

    // fun rand(from:Int, to :Int):Int {
    //     return random.nextInt(to - from) + from;
    // }
    // fun randomized(array:Array<Int>):Array<Int> {

    // }
    // fun minMax(numbers:Array<Int>):Pair<Int,Int>? {

    // }
    //Maps and sets 
    var yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )
    var namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8, 
        "Donna" to 6
    )
    println(namesAndScores)
    //we can create an empty map as so 

    namesAndScores = mutableMapOf()

    // we can also create a new Map by calling its constructor
    var pairs = HashMap<String,Int>();

    // when we create a map ,we can also define its capacity 
    var pairs1 = HashMap<String,Int>(20)
    
    //Accessing values

    println(namesAndScores["Anna"]) // > 2
    println(namesAndScores["Greg"]) // null

    //Using properties and methods 
    println(namesAndScores.get("Craig"))

    namesAndScores.isEmpty();
    namesAndScores.size

    //modifying mutable maps 
    val bobData = mutableMapOf(
        "name" to "Bob",
        "Profession" to "CardPlayer",
        "country" to "USA"
    )
    bobData.put("state","CA")

    bobData["city"] = "San Francisco"

    fun stateprint() {
        
    }
}

//If we put it inside the main method or inside a class, it will give the error -  Modifier 'const' is not applicable to 'local variable'


const val reallyConstant : Int = 42 


// Variables 

var variableNumber : Int = 42 ;

// You declare constants using val, while you declare variables using var 

//once you have declared a variables , you can change it however you wish you simply reassign its value 

// in kotlin, you can use underscores to amke larger numbers more human readable 



