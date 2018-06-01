package main.java.com.codecool.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//meta-annotations of the annotation:
@Retention(RetentionPolicy.RUNTIME) // are to be retained by the VM so they can be read reflectively at run-time.
@Target(ElementType.METHOD)         // can be used to annotate only method declarations.
public @interface WebRoute {
    String value() default "";
}
