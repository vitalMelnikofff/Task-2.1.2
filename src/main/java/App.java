import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext;
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld hello1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld hello2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        boolean helloEquals = (hello1 == hello2);
        boolean catEquals = (cat1 == cat2);
        System.out.println("Сравнение HelloWorld: " + helloEquals);
        System.out.println("Сравнение Cat: " + catEquals);

        applicationContext.close();
    }
}



