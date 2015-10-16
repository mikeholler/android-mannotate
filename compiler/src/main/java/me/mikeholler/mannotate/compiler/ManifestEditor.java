package me.mikeholler.mannotate.compiler;

import me.mikeholler.mannotate.annotations.Manifest;
import me.mikeholler.mannotate.annotations.UsesPermission;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class ManifestEditor {

    final Element manifest = new Element("manifest");
    final Document document = new Document(manifest);

    /**
     *
     * @param manifest the annotation
     * @param qualifiedName the name of the element on which manifest was found
     */
    public void addManifest(final Manifest manifest, final String qualifiedName) {
        manifest.
    }

    public void addUsesPermission(final UsesPermission permission, final javax.lang.model.element.Element element) {
        final Element permissionElement = new Element("uses-permission");
        permissionElement.setAttribute("name", permission.value());
        permissionElement.setAttribute("maxSdkVersion", Integer.toString(permission.maxSdkVersion()));
        manifest.addContent(new Comment("From " + element.getSimpleName()));
        manifest.addContent(permissionElement);
    }

    public String build() {
        return new XMLOutputter(Format.getPrettyFormat()).outputString(document);
    }

}
