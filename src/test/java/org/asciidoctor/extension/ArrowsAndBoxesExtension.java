package org.asciidoctor.extension;

import org.asciidoctor.Asciidoctor;

public class ArrowsAndBoxesExtension implements ExtensionRegistry {

    
    @Override
    public void register(Asciidoctor asciidoctor) {
        
        JavaExtensionRegistry javaExtensionRegistry = asciidoctor.javaExtensionRegistry();
        javaExtensionRegistry.postprocessor(ArrowsAndBoxesIncludesPostProcessor.class);
        javaExtensionRegistry.block("arrowsAndBoxes", ArrowsAndBoxesBlock.class);
        
    }

}
