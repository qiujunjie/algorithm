package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMain {
    public void run() throws Exception{
        // 测试AnnotationTest类，得到此类的类对象
        Class c = Class.forName("annotation.AnnotationTest");
        // 获取该类所有声明的方法
        Method[] methods = c.getDeclaredMethods();
        // 声明注解集合
        Annotation[] annotations;
        // 遍历所有的方法得到各方法上面的注解信息
        for (Method method : methods) {
            // 获取每个方法上面所声明的所有注解信息
            annotations = method.getDeclaredAnnotations();
            // 再遍历所有的注解，打印其基本信息
            System.out.println(method.getName());
            for (Annotation an : annotations) {
                System.out.println("方法名为：" + method.getName() + "其上面的注解为：" + an.annotationType().getSimpleName());
                Method[] meths = an.annotationType().getDeclaredMethods();
                // 遍历每个注解的所有变量
                for (Method meth : meths) {
                    System.out.println("注解的变量名为：" + meth.getName());
                }
            }
        }
    }
}
