package disburse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import disburse.vo.HouseDisburseDetail;

public interface HouseDisburseRepository extends JpaRepository<HouseDisburseDetail, Integer> {
	HouseDisburseDetail findByRecordId(int recordId);
	HouseDisburseDetail findByBioGuideID(String bioGuideID);
	List<HouseDisburseDetail> findByYear(String year);
}
