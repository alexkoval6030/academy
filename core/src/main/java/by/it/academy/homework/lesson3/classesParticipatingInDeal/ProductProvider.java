package by.it.academy.homework.lesson3.classesParticipatingInDeal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ProductProvider {
    String country() default "Belarus";
    int lifeTime();
    String[] parts = new String[0];
}