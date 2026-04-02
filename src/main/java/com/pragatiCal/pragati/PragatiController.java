package com.pragatiCal.pragati;
import org.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
 
/**

* Controller entrypoint for the application

* @author pragati,sri

**/
 
@RestController

public class PragatiController {
 
 
	/**

	 * Get API to launch homePage

	 * @author brajesh.mishra

	 **/

    @GetMapping("/home")

    public String homePage(){

        return "Welcome Interns! This is Home page";

    }

}
 