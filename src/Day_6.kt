
fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val testCastNum = readLine().toString().toInt()
    val ansList = mutableListOf<String>()
    for ( i in 0..(testCastNum-1)){
        val str = readLine().toString()
        ansList.add(solve(str))
    }

    for ( i in 0..(testCastNum-1) ){
        println(ansList[i])
    }
}

fun solve(str : String): String{
    val charArray = str.toCharArray()
    var str1 = ""
    var str2 = ""
    for( i in 0..(charArray.size-1))
    {
        if( (i+1) % 2 == 0 ){
            str2 += charArray[i]
        }else{
            str1 += charArray[i]
        }
    }
    return "$str1 $str2"
}