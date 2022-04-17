package disburse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseDisburseDAO {
	
	@Autowired
	private Field field;
	
	Field getField() {
		return field;
	}
	
	void setField(Field field) {
		this.field = field;
	}
}
