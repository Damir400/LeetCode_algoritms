package medium.task6

import medium.task29.Task29

class Task6 {

    fun convert(s: String, numRows: Int): String {
        var str = s
        var num = 0
        var result = ""
        var isCheck = true
        var list: MutableList<MutableList<Char>> = mutableListOf()

        for (i in 0.. numRows-1){
            list.add(mutableListOf())
        }

        while (!str.isEmpty()){

            if (numRows == 1){
                list[0].add(str[0])
                str = str.substring(1)
                continue
            }

            if(numRows == 2){
                list[num].add(str[0])
                str = str.substring(1)
                if (num == 0) num = 1 else num = 0
                continue
            }

            if (isCheck){
                list[num].add(str[0])
                str = str.substring(1)

                if (num == numRows-1){
                    isCheck = false
                    continue
                }
                num++
            }
            else {
                num--
                list[num].add(str[0])
                str = str.substring(1)

                if(num == 1){
                    isCheck = true
                    num = 0
                }
            }
        }

        list.forEach { item ->
            result += item.joinToString(separator = "")
        }

        return  result
    }
}

fun main(){
    val task6 = Task6()
    println( task6.convert("AB",1))
}