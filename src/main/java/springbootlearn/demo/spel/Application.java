package springbootlearn.demo.spel;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;



@SpringBootApplication
public class Application{
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		SpelBean bean = ctx.getBean(SpelBean.class);
		bean.displayScalarValues();
		bean.displayCollectionIndexing();
		bean.displayUserName();
		/*
		 * 
running results:
workingWeek: 37.50

timestamp: Mon Mar 18 17:40:09 CDT 2024

luckyNumber: 4

City: Swansea
Currency: GBP

User name : julie*/
		
	}
}