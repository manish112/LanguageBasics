/**
 * 
 */
package SpringMVCTagsValidation;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;







/**
 * @author manis
 *
 */
public class Student {
	
	@NotNull(message="First name required.")
	@Size(min=4, message="First name should be atleast 4 characters long")
	String firstName;
	
	@NotNull(message="Last name is requried")
	@Size(min=2, message="Last name should be atleast 2 characters long")
	String lastName;
	String country;
	
	String []  osOpts;
	public Map<String, String> osSelect = new HashMap<String, String>();
	
	public Map<String, String> getOsSelect() {
		
		osSelect.put("Linux", "Linux");
		osSelect.put("Mac", "Mac");
		osSelect.put("Windows", "Windows");
		return osSelect;
	}
	String nativeLanguage;
	

	

	Map<String, String> radioLang=new HashMap();
	
	
	
	public Map<String, String> getRadioLang() {
		
		radioLang.put("en", "English");
		radioLang.put("hi", "Hindi");
		return radioLang;
	}
	public String getNativeLanguage() {
		return nativeLanguage;
	}
	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public String[] getOsOpts() {
		
		return osOpts;
	}
	public void setOsOpts(String[] osOpts) {
			
		this.osOpts = osOpts;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
