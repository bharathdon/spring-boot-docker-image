package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerImageApplication.class, args);
	}

	@GetMapping("/")
	public String abc() {
		return "docker image is buid and running.....";
	}
}

//google jib maven plugin && create settings.xml in .m2 folder
