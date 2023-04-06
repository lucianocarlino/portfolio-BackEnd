package org.springframework.web.servlet.config.annotation;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DelegatingWebMvcConfiguration}.
 */
public class DelegatingWebMvcConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'delegatingWebMvcConfiguration'.
   */
  public static BeanDefinition getDelegatingWebMvcConfigurationBeanDefinition() {
    Class<?> beanType = DelegatingWebMvcConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<DelegatingWebMvcConfiguration> instanceSupplier = InstanceSupplier.using(DelegatingWebMvcConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(DelegatingWebMvcConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
