package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "Please give me a job please bro please :(((((((((((( I studied so much ec2 and java and docker and networkings and reposositories for code and docker"; //"application/json" mean this is a text not a redirect
	}
}
