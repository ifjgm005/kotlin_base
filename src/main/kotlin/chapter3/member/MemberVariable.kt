package chapter3.member

/**
 * Created by tuoanlan on 2019/5/21.
 */


//在构造方法里 var ,val 等修饰的都是属性，否则就是参数
//也可以在类内部定义属性
class MemberVariable(val aField: Int, notField: Int) {
    var anotherField: Int = 0

}

class Base() {

    //有多个属性时，则field 代表最后一个属性。
    var variable = 0
    var another = 5


            //重写get set 方法 field 为变量后真实的变量
        get() {
            println("some one ties to get field: $field ")
            return field
        }
        set(value) {
            println("some one ties to set field: $field")
            field = value
        }
}


class DelayInit() {

    //要求所有的var 、val 属性必须初始化，否则你告诉编译器，我要延迟加载
    //var 变量使用 lateinit 关键字进行延迟加载
    //val 变量 lazy 进行延迟加载
    // 风险就是要自己处理可能带来的空指针


    val a = 1
    lateinit var c: String
    lateinit var d: String

    //使用lamda 表达式初始化
    val b: Base by lazy {
        println("初始化  b 属性")
        Base()
    }


    //还有没有其他办法呢。。我确实不知道，又不想延迟加载呢？也可以。
    //风险同样是，你要自己处理空指针
    var e: String? = null
}


fun main(args: Array<String>) {
//val b=Base()
//    b.variable=100
//    println(b.variable)
//    b.another=110
//    println(b.another)

    //b 延迟加载，使用的时候就调用初始化方法（lamda 表达式）
    val delay = DelayInit()
    println(delay.b)


    //初始化c
     delay.c="我是 c"
    println(delay.c)



    //e 因为可能为空，所以要么告诉编译器，我要强制调用（!!的方式调用）
    // 要么就选择性调用（？的方式调用），当然都可能会报空指针。
    //所有在确定自己处理合适后这么做是没问题的，其实相当于把选择权又夺了过来。
    delay.e="我是e"
    println(delay.e!!.length)
    println(delay.e?.length)



    //不初始化d，就调用d，就会报错
//    delay.d="i am d"
    println(delay.d)




    //kotlin 做这么多就是想帮我们避免空指针的发生
    //所以最佳做法是在类初始化的尽量初始化所有属性
}