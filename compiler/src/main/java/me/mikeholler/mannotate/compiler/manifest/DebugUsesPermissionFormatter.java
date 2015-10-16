package me.mikeholler.mannotate.compiler.manifest;

import me.mikeholler.mannotate.annotations.UsesPermission;
import org.jdom.Comment;
import org.jdom.Element;


public class DebugUsesPermissionFormatter {

    private final Element manifest;

    public DebugUsesPermissionFormatter(final Element manifest) {
        this.manifest = manifest;
    }

    public void format(final UsesPermission annotation, final javax.lang.model.element.Element element) {
    }

}
