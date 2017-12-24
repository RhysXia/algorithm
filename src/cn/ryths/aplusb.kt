package cn.ryths

/**
 * 将两个整数相加
 */
fun aplusb(a: Int, b: Int): Int {
    var t1 = a
    var t2 = b
    var t3:Int
    while ((t1 and t2) != 0) {
        t3 = t1 xor t2
        t1 = (t1 and t2) shl 1
        t2 = t3
    }
    return t1 or t2
}

fun main(args: Array<String>) {
    aplusb(20, 20)
}