/**
 * 
 */
package springHelloAnnotation_noXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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


		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(appConfig.class);
		
		Advice adv=context.getBean("myAdvice", Advice.class);
		
		System.out.println(adv.getAdvice());
		
		Advice adv1=context.getBean("newAdvice", Advice.class);
		
		System.out.println(adv1.getAdvice());
		
		context.close();

	}

}
