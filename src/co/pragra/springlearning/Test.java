package co.pragra.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.NumberFormat;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Iphone iphone=context.getBean("iphone",Iphone.class);
        //iphone.getGsm().getversion();
        System.out.println(iphone.getGsm().getversion());

        int beanDefinitionCount=context.getBeanDefinitionCount();
        Iphone iphone2=context.getBean("iphone",Iphone.class);
        System.out.println(iphone2.getGsm().getversion());

        System.out.println(iphone.getFormat().format(1499.99));
        ((ConfigurableApplicationContext)context).registerShutdownHook();





    }
}
