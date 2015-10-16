package me.mikeholler.mannotate.compiler;

import me.mikeholler.mannotate.annotations.Manifest;
import me.mikeholler.mannotate.annotations.UsesPermission;
import me.mikeholler.mannotate.compiler.utils.ElementUtils;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ManifestProcessor extends AbstractProcessor {

    final ManifestEditor editor = new ManifestEditor();

    @Override
    public boolean process(final Set<? extends TypeElement> annotations,
                           final RoundEnvironment roundEnv) {
        final Messager messager = processingEnv.getMessager();

        for (final TypeElement te : annotations) {
            for (final Element e : roundEnv.getElementsAnnotatedWith(te)) {
                final Manifest manifest = e.getAnnotation(Manifest.class);
                final String qualifiedName = ElementUtils.getQualifiedName(e);
                editor.addManifest(manifest, qualifiedName);
                messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + editor.build());
            }
        }

        return false;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return new HashSet<String>(Collections.singletonList(
                Manifest.class.getCanonicalName()
        ));
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_6;
    }
}
