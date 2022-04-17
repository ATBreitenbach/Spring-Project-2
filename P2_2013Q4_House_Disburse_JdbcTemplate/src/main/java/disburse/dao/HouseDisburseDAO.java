package disburse.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HouseDisburseDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public HouseDisburseDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Map<String, Object>> getListofAllHDDsJDBC() {
		return jdbcTemplate.queryForList("SELECT * from T_2013Q4_HOUSE_DISBURSE");
	}
}
