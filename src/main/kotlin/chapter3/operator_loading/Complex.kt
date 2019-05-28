package chapter3.operator_loading

/**
 * Created by tuoanlan on 2019/5/28.
 * 复数
 */

class Complex(var real: Double, var imagnary: Double) {


    //重载 + 号参数
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imagnary + other.imagnary)
    }

    //重载对参数和返回值没有要求，只要 operate 关键字+ 方法名相同，参数数量相同即可
    operator fun plus(other: Int):Int{
        return real.toInt()+other
    }


    //重载（）invoke 方法，我们把它重载为一个打印hellworld 的方法把
    operator fun invoke(){
        println("hello world!!")
    }





    //复写
    override fun toString(): String {
        return "$real+${imagnary}i"

    }

}
class Desk{

    //中缀表达式，普通的方法前面加个 infix 就是中缀表达式
    infix fun On(name:String){
        println("$name on the Desk!!")
    }
}

fun main(args: Array<String>) {
    val a = Complex(1.0, 2.0)
    val b = Complex(5.0, 7.9)
    val c=10
    val desk=Desk()
    println(a+b)
    println (a+c)
    a()

    //中缀表达式的调用，可以省略 .  和 （）。不过这玩意有啥用呢？随便还是不要用的好，不容易阅读。
    desk On "a lot of books"
}