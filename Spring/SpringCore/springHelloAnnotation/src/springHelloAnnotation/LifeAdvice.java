/**
 * 
 */
package springHelloAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author manis
 *
 */
@Component("myAdvice1")
public class LifeAdvice implements Advice {
	
	public HealthService healthadv;
 	
	@Autowired
	LifeAdvice(@Qualifier("healthServiceImpl")HealthService healthadvise){
 		
 		this.healthadv=healthadvise;
 		
 	}

	@Override
	public String getAdvice() {
		System.out.println("This advice is for "+ healthadv.getName()+", Unique Id: "+healthadv.getUniqueId()+"\n");
		System.out.println(healthadv.getHealthAdvice());
		return "Imagine something amazing is about to happen";
	}
	
	public void hello() {
		System.out.println("Loading Spring Hello demo...");
	}
	
	public void bye() {
		System.out.println("Bbye from spring hello demo");
	}

}
