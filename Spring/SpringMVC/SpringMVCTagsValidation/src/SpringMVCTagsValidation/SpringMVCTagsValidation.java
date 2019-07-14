/**
 * 
 */
package SpringMVCTagsValidation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author manis
 *
 */
@Controller
public class SpringMVCTagsValidation {

	@Value("#{countryOptions}")
	public Map<String, String> countryOpt;

	@InitBinder
	public void myBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor myTrimmer = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, myTrimmer);
	}

	@RequestMapping("/")
	public String hello() {
		return "main";
	}

	@RequestMapping("/student")
	public String studentForm(Model model) {


		Student stud = new Student();

		model.addAttribute("student", stud);
		model.addAttribute("countryOpts", countryOpt);
	

		return "student";
	}

	@RequestMapping("/register")
	public String showConf(@Valid @ModelAttribute("student") Student myStudent, BindingResult binds, Model model) {
		System.out.println("ms "+binds.hasErrors());
		System.out.println("First name "+myStudent.firstName+" lenght"+myStudent.firstName.length());
		if (binds.hasErrors()) {
			model.addAttribute("countryOpts", countryOpt);
			return "student";
		} else {
			return "student-conf";
		}
	}

}
