package com.thedancingbeartribe.performerportal.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("application")
//now each controller will map to /application/
public class ApplicationController {//this will control how performer applications are handled

    /*//lives at path /hello
    @ResponseBody//annotation used in the Spring controller context to return plain text from a controller method
    @GetMapping("hello")//For every GET request made to the provided path, the controller method will be called.
    public String hello(){
        return "Hello, world!";
    }
    //lives at path /goodbye
    @ResponseBody
    @PostMapping("goodbye")//responds to POST request at goodbye
    public String goodbye(){
        return "Goodbye, Spring";
    }

    // responds to get and post requests at "/hellogoodbye"
    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    public String hellogoodbye() {
        // method code here ...
    }
*/
    // Responds to get requests at /hello?coder=LaunchCoder**
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")//handles get and post request
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

  /*  // Responds to get requests at /hello/LaunchCode
    @GetMapping("{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    } */


    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

}
