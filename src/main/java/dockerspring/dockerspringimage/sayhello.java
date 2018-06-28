package dockerspring.dockerspringimage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayhello {
	
	@RequestMapping("/hello")
	public String sayhello()
	{
		return "Spring Boot Is Running From Docker!!";
		
	}
	

}
