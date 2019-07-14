/**
 * 
 */
package springMVCTags;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author manis
 *
 */
@Controller
public class SpringMVCTags {
	
	@Value("#{countryOptions}")
	public Map<String, String> countryOpt;
	
	
	public Map<String, String> osSelect = new HashMap<String, String>();
	
	
			
	
	
	
	
	
	@RequestMapping("/")
	public String hello()
	{
		return "main";
	}
	
	@RequestMapping("/student")
	public String studentForm(Model model)
	{
		osSelect.put("Linux", "Linux");
		osSelect.put("Mac", "Mac");
		osSelect.put("Windows", "Windows");
		
		
		Student stud=new Student();
		
		model.addAttribute("student", stud);
		model.addAttribute("countryOpts", countryOpt);
		model.addAttribute("osSelection", osSelect);
		
		return "student";
	}
	
	
	
	

	@RequestMapping("/register")
	public String showConf(@ModelAttribute("student") Student myStudent)
	{
			
		return "student-conf";
	}
	
	
	

}
