package disburse.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import disburse.dao.HouseDisburseDAO;

@Controller
public class HouseDisburseController {

	@Autowired private JdbcTemplate jdbcTemplate;
	
	@Autowired private HouseDisburseDAO hdDAO;
	
	@RequestMapping("all")
	public String getAllPage(Model model) {
		System.out.println("getAllPage");
		List<Map<String, Object>> listOfHDDs = hdDAO.getListofAllHDDsJDBC();
		model.addAttribute("hdlist", listOfHDDs);
		return "disburse.html";
	}
	
}
