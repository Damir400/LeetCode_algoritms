package easy.task27

import easy.task26.Task26

class Task27 {

    fun removeElement(nums: IntArray, qwe: Int): Int {
        var count = 0

        for (i in 0..nums.size-1){
            if(nums[i] == qwe){
                nums[i] = 51
            } else count++
        }
        nums.sort()

        return count
    }
}

fun main(){
    val task27 = Task27()
    var numss: IntArray = intArrayOf()
    println( task27.removeElement(numss, 3))
}