package org.dpathipati.lamnda.training.employeeRecords;

import java.time.LocalDate;

public class EmployeeRecord {
	
	private String employeeName;
	private String employeeId;
	private LocalDate hireDate;
	private LocalDate transferDate;
	private LocalDate terminateDate;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public LocalDate getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(LocalDate transferDate) {
		this.transferDate = transferDate;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	@Override
	public String toString() {
		return "EmployeeRecord [employeeName=" + employeeName + ", employeeId=" + employeeId + ", hireDate=" + hireDate
				+ ", transferDate=" + transferDate + ", terminateDate=" + terminateDate + "]";
	}
	
	

}
