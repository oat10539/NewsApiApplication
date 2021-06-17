class Fibonacci {
    fun main() {
        val n = 9
        fibonacciCheck(n).forEach {
            print("$it  ")
        }
    }

    private fun fibonacciCheck(N: Int): ArrayList<Int> {
        val intArray = ArrayList<Int>()
        intArray.add(0)
        intArray.add(1)
        for (i in 2 until N) {
            val a = intArray[i - 1] + intArray[i - 2]
            if (a > N) {
                break
            }
            intArray.add(a)
        }
        return intArray
    }
}
