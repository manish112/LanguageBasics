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

public class HealthServiceImpl implements HealthService {

	@Value("${name}")
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Value("${uniqId}")
	String uniqueId;
	
	@Override
	public String getHealthAdvice() {
		// TODO Auto-generated method stub
		return "Run for 15 min everyday";
	}

}
