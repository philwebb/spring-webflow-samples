package org.springframework.webflow.samples.booking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ExampleController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test(RedirectAttributes redirectAttributes) {
		return "<html><form action=\"test\" method=\"post\"><input type=\"submit\"/></form></html>";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String submit(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("status", "test");
		return "redirect:outcome";
	}
	
	@RequestMapping(value="/outcome")
	@ResponseBody
	public String outcome(ModelMap model) {
		return "outcome "+model.get("status");
	}
	
}
