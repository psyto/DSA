package datastructures.factorial

object Factorial2 {
    fun factorial(n: Int): Int {
        return if (n == 1) {
            1
        } else n * factorial(n - 1)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val myFac = factorial(4)
        println(myFac)
    }
}