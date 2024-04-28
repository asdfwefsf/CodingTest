import java.lang.StringBuilder


fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    val n = readLine().toInt()

    val list = BooleanArray(2000001)

    for (i in 0 until n) {
        list[readLine().toInt()+1000000] = true
    }

    for (i in list.indices) {
        if (list[i]) {
            sb.append("${i-1000000}\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    
}