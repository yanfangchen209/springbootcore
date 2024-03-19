package springbootlearn.demo.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Two types of value:
$   Application property
#   Spring Expression Language (SpEL)
*/



@Component
public class MyBeanWithValues{
	
	@Value("${name}") //inject value of "name" application property
	private String name;
	
	@Value("#{5*7.5}") //inject general java value using spel
	private double workingWeek;
	
	@Override
	public String toString() {
		return String.format("hello from mybeanwithvalues, name %s, working week %.2f", name, workingWeek);
	}
}