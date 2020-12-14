package com.league.chase.annotation;

import com.league.chase.configuration.DefConfiguration;
import com.league.chase.selector.DefImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 *
 * @version 0.1.0
 * @author chase
 * @since 0.1.0
 * @create 2020/12/14下午4:10
 **/
@Target(ElementType.TYPE)
@Documented
@Inherited
@Import(DefImportSelector.class)
public @interface EnableDefImport {
}
