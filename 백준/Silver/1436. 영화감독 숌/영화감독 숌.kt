fun main() {
    var number = readLine()?.toIntOrNull()
    var target = 666
    var success = 1
    while (number != success) {
        target++
        if (target.toString().contains("666")) {
            success++
        }
    }
    print(target)

}