fun main() {
    val (k, n) = readLine()!!.split(" ").map {
        it.toInt()
    }
    val lans = Array(k) {
        readLine()!!.toLong()
    }

    var left: Long = 1L
    var right: Long = lans.maxOrNull()!!
    var mid: Long

    while (left <= right) {
        mid = (left + right) / 2
        var count : Long = 0

        for (lan in lans) {
            count += lan / mid
        }

        if(count >= n) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(right)
}