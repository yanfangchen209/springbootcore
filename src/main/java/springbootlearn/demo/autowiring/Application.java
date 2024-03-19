package springbootlearn.demo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{
	public static void main(String args[]) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		BankService bankService = ctx.getBean(BankService.class);
		bankService.depositIntoAccount(1, 1000);
		bankService.withdrawFromAccount(1,10);
		
		MyBeanWithValues beanWithValues = ctx.getBean(MyBeanWithValues.class);
		System.out.println(beanWithValues);
		
	}
}