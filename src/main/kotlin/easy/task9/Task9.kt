package easy.task9

class Task9 {
    fun isPalindrome(x: Int): Boolean {
        var s = x.toString()
        var n = 1
        if(x < 0){
            return false
        }

        for (i in 0 .. s.length / 2 - 1){
            if (s[i] != s[s.length-n]){
                return false
            }
            n++
        }
        return true
    }
}