class Solution {
   fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false
    val firstHash = Hashtable<Char, Int>()
    val secondHash = Hashtable<Char, Int>()
    for (i in s) {
        if (firstHash.containsKey(i)) {
            val hashValue = firstHash[i]!!
            firstHash[i] = hashValue + 1
        } else {
            firstHash[i] = 1
        }

    }


    for (i in t) {
        if (secondHash.containsKey(i)) {
            val hashValue = secondHash[i]!!
            secondHash[i] = hashValue + 1
        } else {
            secondHash[i] = 1
        }


    }

    if (firstHash.size != secondHash.size) return false

    for(i in firstHash){
        if(secondHash.containsKey(i.key)){
            if((secondHash.getValue(i.key)) != i.value){
                return false
            }
        }else{
            return false
        }
        
    }

    return true
}
}
