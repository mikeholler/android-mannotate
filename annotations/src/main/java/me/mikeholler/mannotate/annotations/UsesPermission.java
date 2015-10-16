package me.mikeholler.mannotate.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface UsesPermission {

    String value();
    int maxSdkVersion() default -1;

}
