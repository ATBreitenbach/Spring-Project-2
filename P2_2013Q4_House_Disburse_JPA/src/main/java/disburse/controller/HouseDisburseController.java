package disburse.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import disburse.dao.HouseDisburseDAO;


@Controller
public class HouseDisburseController {

	@Autowired
	private HouseDisburseDAO hdDAO;
	
	@RequestMapping("all")
	public String getAllPage(Model model) {
		System.out.println("Get All Page begin");
		model.addAttribute("HDDs", hdDAO.getAllHDDs());
		return "disburse.html";
	}
	public HouseDisburseController(HouseDisburseDAO hdDAO) {
		this.hdDAO = hdDAO;
	}
	
	
}
