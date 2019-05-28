package chapter3.lamda

import chapter3.function.mySum

/**
 * Created by tuoanlan on 2019/5/20.
 */
fun main(args: Array<String>) {




    //把上节说的sum 函数用lamda 表达式子.所以 lamda 表达式就是匿名函数
    val mySum={arg1:Int,arg2:Int->arg1+arg2}












   //首先看下使用for 循环遍历
    for (i in args){
        println(i)
    }

    println("第二种遍历方式")

    //另一种遍历方式 forEach。
    //forEach array 的扩展函数,它接收一个函数作为参数，让后对面个元素执行这个函数，
    // 其实是 args.forEach （{ println(it) }）方法的简写，只有一个lamda表达式，则可以把lamda表达式写到小括号的外面
    args.forEach { println(it) }


    //也可以写成这样,参数是因为被省略了。
    args.forEach { it-> println(it) }

    //还可以写成reference 的 lamda 表达式；
    //当传入的函数和需要接收的lamda 表达式的类型完全一样，那就还可以reference 形式的lamda 表达式
    args.forEach(::println)





    println("遇到e则停止打印")

    //现在假设我们遇到字符e 就跳过，代码如下
    //给 lamda 表达式取个名字叫 FFForeach（随意取），在 遍历到 e 的时候返回，不打印


    args.forEach FFForeach@ {
        if (it=="e") return@FFForeach
        println(it)

    }

    println("funtion end")







    //总结
    //1。 lamda 表达式其实就是匿名函数
    //2。 写法 {[]->[函数体，最后一行是返回值]}





    //函数的类型
    //匿名函数的函数类型：Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
    //我们定义的匿名函数怎么就变成了 什么function2 类型了呢？，其实我们定义的方法，相当于实现了 Function2 这个接口。但我们并没有实现接口中的方法啊
    //其实我们定义的方法，都会实现fuction 接口。
    println(mySum)
    mySum.invoke(1,2)


}