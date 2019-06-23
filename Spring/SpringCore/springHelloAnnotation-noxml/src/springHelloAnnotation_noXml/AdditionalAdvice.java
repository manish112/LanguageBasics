/**
 * 
 */
package springHelloAnnotation_noXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author manis
 *
 */
public class AdditionalAdvice implements Advice {
	
	public AdditionalAdvice() {
		System.out.println("New bean constructor");
	}

	

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Always respect your parents";
	}
	@PostConstruct
	public void startUp() {
		System.out.println("New bean creation");
	}
	
	@PreDestroy
	public void shutDown() {
		System.out.println("New bean destroy");
	}

}
