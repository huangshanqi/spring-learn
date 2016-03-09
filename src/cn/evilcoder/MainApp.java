package cn.evilcoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Huangshanqi
 * Date: 2016/3/9
 * Time: 15:07
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("cn/evilcoder/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
