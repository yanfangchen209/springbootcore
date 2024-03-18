package springbootlearn.demo.spel;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;

public class SpelBean{
	
	//scalar values.
	@Value("#{5*7.5}")
	private double workingWeek;
	
	@Value("#{new java.util.Date()}")
	private Date timestamp;
	
	
	
	
}