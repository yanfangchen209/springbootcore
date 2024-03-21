package configurationclassdemo.simpleconfiguration;

//no need to annotate @Component because of the configuration class, which will create beans there.

public class MyBean {
	private int field1;
	private String field2;
	
	public void setField1(int field1) {
		this.field1 = field1;
	}
	
	public void setField2(String field2) {
		this.field2 = field2;
	}
	
	@Override
	public String toString() {
		return String.format("Hello from MyBean, fileds %d %s", field1, field2);
	}
}
