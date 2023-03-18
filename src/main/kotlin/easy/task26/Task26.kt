package easy.task26

import easy.task20.Task20

class Task26 {

    fun removeDuplicates(nums: IntArray): Int {

        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1

        var result =0

        for(i in 0 ..nums.size-2){
            for(j in i+1 .. nums.size-1){
                if(nums[i] != -101 && nums[i] == nums[j]){
                    nums[j] = -101
                } else if (nums[i] == -101 && nums[i] != nums[j]){
                    nums[i] = nums[j]
                    nums[j] = -101
                }
            }
        }
        nums.forEach { item ->
            if (item != -101){
                result++
            }
        }
        return result
    }
}

fun main(){
    val task26 = Task26()
    var numss: IntArray = intArrayOf(1,1,2)
    println( task26.removeDuplicates(numss))
}