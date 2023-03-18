package datastructures.itemincommon

object ItemInCommon {
    fun itemInCommon(array1: IntArray, array2: IntArray): Boolean {
        val myHashMap = HashMap<Int, Boolean?>()
        for (i in array1) {
            myHashMap[i] = true
        }
        for (j in array2) {
            if (myHashMap[j] != null) {
                return true
            }
        }
        return false
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val array1 = intArrayOf(1, 3, 5)
        val array2 = intArrayOf(2, 4, 5)
        println(itemInCommon(array1, array2))
    }
}