/**
 * 
 */
package springHelloAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author manis
 *
 */
@Component("myAdvice")
@Scope("singleton")
public class CSAdvice implements Advice {

	
 	public HealthService healthadv;
 	
 	@Autowired
 	CSAdvice(@Qualifier("ayurvedaAdvice")HealthService healthadvise){
 		
 		this.healthadv=healthadvise;
 		
 	}
	
	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		
		System.out.println("This advice is for "+ healthadv.getName()+", Unique Id: "+healthadv.getUniqueId()+"\n");
		System.out.println(healthadv.getHealthAdvice());
		return "Study the concepts of CS";
	}
	
	@PostConstruct
	public void hello() {
		System.out.println("Loading Spring Hello demo...");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Bbye from spring hello demo");
	}
}
