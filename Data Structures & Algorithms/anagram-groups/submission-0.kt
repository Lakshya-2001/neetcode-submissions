class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val stringMap = hashMapOf<List<Int>, MutableList<String>>()
    for (i in strs) {
        val count = MutableList(26) { 0 }
        for (s in i) {
            count[s - 'a']++
        }

        print(stringMap.containsKey(count))
        stringMap.getOrPut(count) { mutableListOf() }.add(i)

    }

    return stringMap.values.toList()



    }
}
