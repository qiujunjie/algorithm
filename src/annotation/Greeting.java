package annotation;

public @interface Greeting {
    public enum FontColor {
        BLUE,
        RED,
        GREEN
    };
    String name();
    FontColor fontColor() default FontColor.RED;
}
