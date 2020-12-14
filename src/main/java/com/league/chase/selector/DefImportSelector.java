package com.league.chase.selector;

import com.league.chase.configuration.DefConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author chase
 */
public class DefImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{DefConfiguration.class.getName()};
    }
}
