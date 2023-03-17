package easy.tsak1

class Task1 {


    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = IntArray(2)
        for (i in 0..nums.size-1){
            for (n in i+1..nums.size-1)
                if (nums[i] + nums[n] == target){
                    result[0] = i
                    result[1] = n
                    return result
                }
        }
        return result
    }
}