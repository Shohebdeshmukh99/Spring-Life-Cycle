package in.shoheb.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


// through interface
@Component
public class Motor implements InitializingBean ,DisposableBean{
	
	public Motor() {
		System.out.println("Motor::constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet() called");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
		
	}

}
