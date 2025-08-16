package net.javaDocker.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    
    // getmapping annataion	
    @GetMapping("/docker")
    public String dockerDemo(){
	//this is returning message while calling get request
        return "Dockerizing Spring Boot Application...";
    }
}
