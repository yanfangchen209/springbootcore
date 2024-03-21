package configurationclassdemo.simpleconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	//this method return a bean named myBean
	@Bean
	public MyBean myBean() {
		MyBean b = new MyBean();
		b.setField1(1);
		b.setField2("spring is coming");
		return b;
	}

}
