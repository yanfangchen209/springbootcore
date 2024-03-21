package configurationclassdemo.simpleconfiguration;

import javax.naming.OperationNotSupportedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {
	
	@Autowired
	private MyBean myBean;
	public void operate() {
		System.out.println(myBean);
	}

}
