package me.mikeholler.mannotate.compiler.utils;

import javax.lang.model.element.*;

public class ElementUtils {

    public static String getQualifiedName(final Element element) {
        if (element instanceof PackageElement) {
            return ((PackageElement) element).getQualifiedName().toString();
        } else if (element instanceof TypeElement) {
            return ((TypeElement) element).getQualifiedName().toString();
        } else {
            throw new IllegalArgumentException("Element must be a PackageElement or TypeElement");
        }
    }
}
