package xmlfile.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Building {
	
	@Value("103")
	private int b_id;
	
	public void details() {
		System.out.println("Building with id "+b_id+" will ready for living!!");
	}
}