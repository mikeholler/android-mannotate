package me.mikeholler.mannotate.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.PACKAGE,
        ElementType.TYPE
})
public @interface Manifest {
    UsesPermission[] usesPermissions() default {};
    UsesConfiguration[] usesConfigurations() default {};
}
