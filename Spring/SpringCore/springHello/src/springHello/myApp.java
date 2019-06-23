/**
 * 
 */
package springHello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author manis
 *
 */
public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		ClassPathXmlApplicationContext xmlpath=new ClassPathXmlApplicationContext("appContext.xml");
		
		Advice adv=xmlpath.getBean("myAdvice", Advice.class);
		
		System.out.println(adv.getAdvice());
		
	xmlpath.close();

	}

}
