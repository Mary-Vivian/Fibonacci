package com.akirachix.fibonacciseries

class  Fibonaccis{
    fun generatefibonacci(count:Int):List<Int>{
        val fibonacciNumbers= mutableListOf<Int>()
        if(count>0)fibonacciNumbers.add(0)
        if(count>1)fibonacciNumbers.add(1)
        for (i in 2 until count){
            val nextNumber=fibonacciNumbers[i-1] +fibonacciNumbers[i-2]
            fibonacciNumbers.add(nextNumber)
        }
        return fibonacciNumbers
    }
}
