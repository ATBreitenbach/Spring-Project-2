package disburse.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import disburse.dao.HouseDisburseDAO;
import disburse.mapper.HouseDisburseMapper;
import disburse.vo.HouseDisburseDetail;

@Controller
public class HouseDisburseController {

	@Autowired HouseDisburseMapper hdm;
	@Autowired JdbcTemplate jdbct;
	
	@GetMapping("highestAmount")
	public String getHighestAmount(Model model){
		model.addAttribute("hdList", hdm.getHighestAmount());
		return "disburse.html";
	}
	@GetMapping("highestAmountByBioGuideID")
	public @ResponseBody String getHighestAmountByBioGuideID() throws DataAccessException, JsonProcessingException {
		List<Map<String, Object>> hdlist = jdbct.queryForList("SELECT BIOGUIDE_ID, MAX(AMOUNT) AS maxamount from T_2013Q4_HOUSE_DISBURSE GROUP BY BIOGUIDE_ID");
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(hdlist);
	}
}
