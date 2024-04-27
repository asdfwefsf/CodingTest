import java.lang.StringBuilder

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    val (first , last) = readLine().split(" ").map { it.toInt() }

    val array = BooleanArray(last + 1) { false }
    array[1] = true

    for (i in 2..last) {
        if (!array[i]) {
            for (j in i * 2..last step i) {
                array[j] = true
            }
        }
    }

    val primes = (first..last).filter { !array[it] }

    primes.forEach { sb.append(it).append('\n') }
    bw.write("$sb")
    bw.flush()
    bw.close()
}