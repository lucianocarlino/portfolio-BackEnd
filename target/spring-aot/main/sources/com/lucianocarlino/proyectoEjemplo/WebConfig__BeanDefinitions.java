package com.lucianocarlino.proyectoEjemplo;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link WebConfig}.
 */
public class WebConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'webConfig'.
   */
  public static BeanDefinition getWebConfigBeanDefinition() {
    Class<?> beanType = WebConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(WebConfig.class);
    beanDefinition.setInstanceSupplier(WebConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
