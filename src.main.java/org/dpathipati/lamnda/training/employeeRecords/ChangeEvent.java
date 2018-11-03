/**
 * 
 */
package org.dpathipati.lamnda.training.employeeRecords;

import java.time.LocalDate;

/**
 * @author DHARMENDHAR.PATHIPAT
 *
 */
public class ChangeEvent {
	
	private Integer employeeId;
	private LocalDate hireDate;
	private LocalDate transferDate;
	private LocalDate terminatedDate;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
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
	public LocalDate getTerminatedDate() {
		return terminatedDate;
	}
	public void setTerminatedDate(LocalDate terminatedDate) {
		this.terminatedDate = terminatedDate;
	}
	
	

}
