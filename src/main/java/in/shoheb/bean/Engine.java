package in.shoheb.bean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


// through annotations 
@Component
public class Engine {
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("engine started");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("engine destroy");
	}
	
}
