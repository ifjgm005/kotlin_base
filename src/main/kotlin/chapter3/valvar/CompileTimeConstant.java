package chapter3.valvar;

/**
 * Created by tuoanlan on 2019/5/17.
 */
public class CompileTimeConstant {

    //编译期常量，在编译期间就能确定值了
    final String FINAL_HELLO_WORLD = "HELLO";

    String helloWorld = FINAL_HELLO_WORLD;
}
