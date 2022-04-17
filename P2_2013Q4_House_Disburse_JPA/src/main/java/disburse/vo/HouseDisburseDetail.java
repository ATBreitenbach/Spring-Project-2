package disburse.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_2013Q4_HOUSE_DISBURSE")
public class HouseDisburseDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "RECORDID")
	private int recordId;
	@Column(nullable = true, name = "BIOGUIDE_ID")
	private String bioguideId;
	@Column(nullable = true, name = "OFFICE")
	private String office;
	@Column(nullable = true, name = "CATEGORY")
	private String category;
	@Column(nullable = true, name = "PAYEE")
	private String payee;
	@Column(nullable = true, name = "START_DATE")
	private String startDate;
	@Column(nullable = true, name = "END_DATE")
	private String endDate;
	@Column(nullable = true, name = "PURPOSE")
	private String purpose;
	@Column(nullable = true, name = "AMOUNT")
	private double amount;
	@Column(nullable = true, name = "YEAR")
	private String year;
	
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getBioguideId() {
		return bioguideId;
	}
	public void setBioguideId(String bioguideId) {
		this.bioguideId = bioguideId;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "HouseDisburseDetail [recordId=" + recordId + ", bioguideId=" + bioguideId + ", office=" + office
				+ ", category=" + category + ", payee=" + payee + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", purpose=" + purpose + ", amount=" + amount + ", year=" + year + "]";
	}
	
}
