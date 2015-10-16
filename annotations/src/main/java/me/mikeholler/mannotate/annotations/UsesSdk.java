package me.mikeholler.mannotate.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface UsesSdk {

    int minSdkVersion() default -1;
    int targetSdkVersion() default -1;
    int maxSdkVersion() default -1;

}
