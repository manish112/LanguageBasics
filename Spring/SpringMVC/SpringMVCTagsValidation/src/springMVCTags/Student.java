/**
 * 
 */
package springMVCTags;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manis
 *
 */
public class Student {
	
	String firstName;
	String lastName;
	String country;
	
	String []  osOpts;
	
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
