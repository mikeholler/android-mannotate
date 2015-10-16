package me.mikeholler.mannotate.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface UsesConfiguration {

    String reqFiveWayNav() default "";
    String reqHardKeyboard() default "";
    String reqKeyboardType() default "";
    String reqNavigation() default "";
    String reqTouchScreen() default "";

}
