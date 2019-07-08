/**
 * 
 */
package springHelloMVC;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author manis
 *
 */
@Controller
public class HelloSpringMVC {
	
	
	@RequestMapping("/")
	public String hello()
	{
		return "main";
	}
	
	@RequestMapping("/name")
	public String name()
	{
		return "name";
	}
	
	
	@RequestMapping("/hello")
	public String nameHello()
	{
			
		return "hello";
	}
	
	@RequestMapping("/hellomodel")
	public String nameModelHello(@RequestParam("name") String name, Model model)
	{
			
		model.addAttribute("name", name);
		return "helloModel";
	}
	

}
