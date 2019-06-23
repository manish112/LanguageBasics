/**
 * 
 */
package springHello;

/**
 * @author manis
 *
 */
public class HealthServiceImpl implements HealthService {

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

	String uniqueId;
	
	@Override
	public String getHealthAdvice() {
		// TODO Auto-generated method stub
		return "Run for 15 min everyday";
	}

}
