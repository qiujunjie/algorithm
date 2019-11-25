package annotation;

import java.lang.annotation.Annotation;

public class AnnotationTest implements Annotation {
    @NewAnnotation("mainmethod")
    public static void main(String[]args) {
        saying();
        sayHelloWithDefaultFontColor();
        sayHelloWithRedFontColor();
    }

    @NewAnnotation("saymethod")
    public static void saying() {
    }

    // 此时的fontColor为默认的RED
    @Greeting(name="defaultfontcolor")
    public static void sayHelloWithDefaultFontColor() {
    }

    // 将fontColor改为BLUE
    @Greeting(name="notdefault", fontColor=Greeting.FontColor.BLUE)
    public static void sayHelloWithRedFontColor() {
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}