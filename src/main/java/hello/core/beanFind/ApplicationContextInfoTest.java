package hello.core.beanFind;

import hello.core.AppConfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.processing.SupportedAnnotationTypes;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

 
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);{
                BeanDefinition beanDefinition= ac.getBeanDefinition(beanDefinitionName);

                if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                    Object bean = ac.getBean(beanDefinitionName);
                    System.out.println("name =" + beanDefinitionName + " object =" + bean);
                }
            }


        }
    }

}
