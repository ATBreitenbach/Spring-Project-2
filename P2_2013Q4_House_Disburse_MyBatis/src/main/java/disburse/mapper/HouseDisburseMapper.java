package disburse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import disburse.vo.HouseDisburseDetail;

@Mapper
public interface HouseDisburseMapper {
	@Select("SELECT * from T_2013Q4_HOUSE_DISBURSE where AMOUNT = (SELECT MAX(AMOUNT) from T_2013Q4_HOUSE_DISBURSE)")
	@Results (id = "hdResultMap", value = {	
			@Result(property = "bioGuideID", column = "BIOGUIDE_ID"),
			@Result(property = "startDate", column = "START_DATE"),
			@Result(property = "endDate", column = "END_DATE")
			}
	)
	public List<HouseDisburseDetail> getHighestAmount();
		
	
}
