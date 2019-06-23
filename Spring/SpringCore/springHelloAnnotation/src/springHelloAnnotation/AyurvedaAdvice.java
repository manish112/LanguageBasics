/**
 * 
 */
package springHelloAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author manis
 *
 */
@Component
public class AyurvedaAdvice implements HealthService {

	
	@Value("${name}")
	String name;
	public String getName() {
		return name;
	}


	@Override
	public String getHealthAdvice() {
		// TODO Auto-generated method stub
		return "Dont eat junk food";
	}
	
	public String getUniqueId() {
		return uniqueId;
	}



	@Value("${uniqId}")
	String uniqueId;


	}

