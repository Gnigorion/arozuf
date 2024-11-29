package arozuf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import arozuf.constants.Constants;
import arozuf.http.HTTPPolicy;

@SpringBootApplication
public class PolicyHttpApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PolicyHttpApplication.class, args);
	}

	@Autowired
	public HTTPPolicy httpPolicy;
	
	@Override
	public void run(String... args) throws Exception {
		
		Map<String, Object> requestMap = new HashMap<>();
		requestMap.put(Constants.URL, "https://jsonplaceholder.typicode.com/todos/1");
		requestMap.put(Constants.METHOD, "GET");
		httpPolicy.apply(requestMap);
		
	}

}
