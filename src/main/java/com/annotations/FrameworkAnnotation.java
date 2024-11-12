package com.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface FrameworkAnnotation {

    String author() default "Dev" ; //if you think it's an optional add default keyword and default value at last
    // String author() default "mahesh";
}
