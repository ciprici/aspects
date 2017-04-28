import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.SimpleService;


public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		SimpleService service = appContext.getBean("simpleService", SimpleService.class);
		System.out.println(service.doSomething());
		System.out.println(service.throwException());
	}

}
