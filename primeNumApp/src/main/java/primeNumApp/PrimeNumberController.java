package primeNumApp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrimeNumberController {

	
	//initial login & gets the input from the user
	 @GetMapping("/findPrime")
	    public String sendForm(UserInput user) {

	        return "getInput";
	    }

	 // display the result
	    @PostMapping("/findPrime")
	    public String processForm(UserInput user) {
          String finalResult = processInput(user.getEnterNumber());
          System.out.println("FINAL OUTPUT :" +finalResult);
          user.setResult(finalResult);
	        return "showResult";
	    }
	    
	    //processing logic to display Prime Numbers  for given user input
	    public String processInput(String inputNumber) {
	    	String resultString = "";
	    	PrimeNumberService service = new PrimeNumberService();
	    	resultString = service.findPrime(inputNumber);
	    	return resultString;
	    }

}
