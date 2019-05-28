package chapter3.function

/**
 * Created by tuoanlan on 2019/5/20.
 */

//main 方法也是一个方法，这同，一般方法定义：fun 关键字 + （参数：参数类型）+:返回值类型{方法体}
//如果没有返回值，则返回 Unit, 可以不写
fun main(args: Array<String>) {
    println("main 方法是程序执行的入口")
    println("1+2=${mySum(1, 2)}")
    println("2 乘以 2 =${multiply(2,2)}")


}

//定义一个普通方法,返回为Int
fun mySum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}


//定义匿名函数
//我们计算了加法，再计算下乘法把,这个方法是没名字的
//当然要用一个参数接收，不然你方法定义了也用不了啊。

val multiply = fun(arg1: Int, arg2: Int): Int {
    return arg1 * arg2
}


//定义函数的原则
//1. 功能单一性