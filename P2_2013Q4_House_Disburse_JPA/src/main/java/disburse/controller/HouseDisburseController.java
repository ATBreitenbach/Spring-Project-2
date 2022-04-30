package disburse.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import disburse.dao.HouseDisburseDAO;
import disburse.repository.HouseDisburseRepository;
import disburse.vo.HouseDisburseDetail;


@Controller
public class HouseDisburseController {

	@Autowired
	private HouseDisburseRepository hdrepo;
	
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
	@GetMapping("bioGuideID/{bioguideid}")
	public String findByBioGuideID(Model model, @PathVariable String bioguideid) {	
		model.addAttribute("HDDs", hdrepo.findByBioGuideID(bioguideid));
		return "disburse.html";
	}
	
	@PostMapping("loadDisburse")
	public @ResponseBody String loadJSON(@RequestBody List<HouseDisburseDetail> hd) throws JsonProcessingException {
		hdrepo.saveAll(hd);
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(hdrepo.findByYear("2020"));
	}
	
	
}
