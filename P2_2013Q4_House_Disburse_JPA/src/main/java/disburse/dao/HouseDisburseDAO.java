package disburse.dao;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import disburse.repository.HouseDisburseRepository;
import disburse.vo.HouseDisburseDetail;

@Service
public class HouseDisburseDAO {

	@Autowired
	private HouseDisburseRepository hdrepo;
	
	
	
	public void insertHDListJPABatch(List<HouseDisburseDetail> hdList) {
		for (HouseDisburseDetail hd1 : hdList) {
			hd1.setOffice(hd1.getOffice().toLowerCase());
		}
		hdrepo.saveAll(hdList);
	}
	public List<HouseDisburseDetail> getAllHDDs() {
		return hdrepo.findAll();
	}
	
}
