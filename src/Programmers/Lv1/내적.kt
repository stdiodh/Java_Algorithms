package Programmers.Lv1

class `내적` {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        for(i in a.indices){
            answer += a[i] * b[i]
        }

        return answer
    }
}