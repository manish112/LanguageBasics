/**
 * 
 */
package springHello;

/**
 * @author manis
 *
 */
public class CSAdvice implements Advice {

	
 	public HealthService healthadv;
 	
 	CSAdvice(HealthService healthadvise){
 		
 		this.healthadv=healthadvise;
 		
 	}
	
	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		
		System.out.println("This advice is for "+ healthadv.getName()+", Unique Id: "+healthadv.getUniqueId()+"\n");
		System.out.println(healthadv.getHealthAdvice());
		return "Study the concepts of CS";
	}
	
	public void hello() {
		System.out.println("Loading Spring Hello demo...");
	}
	
	public void bye() {
		System.out.println("Bbye from spring hello demo");
	}
}
