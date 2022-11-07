import java.util.*

fun main(args: Array<String>) {
    println(challenge2("Challenge 2 completed"))
}

/*
* 1)
* Print the number from 1 to 100, and for multiples of 3 print "Fizz" instead of the number
* and for the multiples of 5 print "Buzz".
* */

fun challenge1() {
    return println((1..100).map
    {
        index -> mapOf(
            0 to index,
                index % 3 to "Fizz",
                index % 5 to "Buzz",
                index % 15 to "Fizz Buzz"
        )[0]
    })
}

/*
* Explanation:
* Map used for each index value ( 1 to 100 )
* the println function prints always '0' to $index. But, bellow this condition,
* I have: index % 3 to "Fizz". So, if index is some multiple of 3 the conditional value is 0.
* In this logic, if (0 to index) && (index % 3 == 0) then 0 to "Fizz". Because, in the first line,
* 0 to index is always true, but in the next line, 0 is also true for "Fizz", so 0 is now the KET for
* the value of the condition.
* And to put all of this information on an array, in the end of $mapOf(), I'm only want the values of the KEY '0'.
* */



/*
* 2)
* Given an input string , reverse the string word by word
* Input: "reverse words in a string"
* Output: "string a in words reverse"
* */

fun challenge2(stringToReverse: String) =
    stringToReverse
        .split(" ")
        .reversed()
        .joinToString(" ")

/*
* Explanation:
* Apply the split(" ") function to eliminate all the blank spaces on th string.
* Use the reversed() function in order to return a list with elements in reversed order.
* And finally, use the joinToString(" ") function to add a space blank between all position of the string.
* */
