package com.lucianocarlino.proyectoEjemplo;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link ProyectoEjemploApplication}.
 */
public class ProyectoEjemploApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'proyectoEjemploApplication'.
   */
  public static BeanDefinition getProyectoEjemploApplicationBeanDefinition() {
    Class<?> beanType = ProyectoEjemploApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(ProyectoEjemploApplication.class);
    beanDefinition.setInstanceSupplier(ProyectoEjemploApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
