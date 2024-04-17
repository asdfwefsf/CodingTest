import java.util.*

fun main() {

    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())
    val row = st.nextToken().toInt()
    val column = st.nextToken().toInt()
    var min = row * column
    val arr = Array(row) { IntArray(column) }
    for (i in 0 until row) {
        val line = br.readLine().toCharArray()

        for (j in 0 until column) {
            if (((i+j) % 2 == 0 && line[j] != 'W') ||
                ((i+j) % 2 != 0 && line[j] != 'B')) {
                arr[i][j]++
            }
            if (j > 0) arr[i][j] += arr[i][j-1]
        }
    }

    for (i in 0 .. row-8) {
        for (j in 0 .. column-8) {
            var count = 0
            for (k in i until i+8) {
                count += arr[k][j+7]
                if (j > 0) count -= arr[k][j-1]
            }
            if (count > 64 - count) count = 64 - count

            if (count < min) min = count
        }
    }

    println(min)
    br.close()
}