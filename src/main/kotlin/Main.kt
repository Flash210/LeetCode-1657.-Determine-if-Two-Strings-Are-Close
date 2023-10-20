fun main(args: Array<String>) {

    var ch="cabbba"
    var ch2="abbccc"


    System.out.println(TwoStringsClosee(ch,ch2))


}
fun TwoStringsClosee(ch:String,ch2:String):Boolean{


    val map= mutableMapOf<Char,Int>()
val map2= mutableMapOf<Char,Int>()

    if( ch.length!=ch2.length)
    {
        return false
    }
    ch.forEach{
        map[it]=map.getOrDefault(it,0)+1
    }
    /*
    for (char in ch) { map[char] = map.getOrDefault(char, 0) + 1 }
     */

    // or second way  val map1=word1.groupingBy{it }.eachCount()

    ch2.forEach {
       map2[it]= map2.getOrDefault(it,0)+1
    }

    if ( map.keys!=map2.keys){
        return  false
    }


    return map.values.sorted()==map2.values.sorted()
}

/*
notes
groupingBy{it }: It groups the elements in word1 by their values
eachCount(): and then counts the occurrences of each unique element, returning a Map



 */