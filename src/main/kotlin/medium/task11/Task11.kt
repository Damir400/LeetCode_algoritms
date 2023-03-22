package medium.task11

import medium.task29.Task29
import kotlin.math.max
import kotlin.math.min

class Task11 {

    fun maxArea(height: IntArray): Int {
        var volume = 0

        var m = 0
        var n = height.size-1

        while (m < n) {
            volume = max(volume, min(height[m], height[n])*(n-m))
            if (height[m] >= height[n]) {
//                if (volume < height[n] * (n - m)) {
//                    volume = height[n] * (n - m)
//                }
                n--
            } else {
//                if (volume < height[m] * (n - m)) {
//                    volume = height[m] * (n - m)
//                }
                m++
            }
        }
        return volume
    }
}

fun main(){
    val task11 = Task11()
    val qwe: IntArray = intArrayOf(1,8,6,2,5,4,8,3,7)
    println( task11.maxArea(qwe))
}