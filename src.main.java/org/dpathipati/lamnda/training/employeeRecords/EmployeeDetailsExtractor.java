/**
 * 
 */
package org.dpathipati.lamnda.training.employeeRecords;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author DHARMENDHAR.PATHIPAT
 *
 */
public class EmployeeDetailsExtractor {

	/**
	 * Problem Statement
	 * I have a list of Employee Records which contains a list of Employees record for each change event
	 * and a list of DiffEmployeeDetails Records which contains employee event difference information
	 * and I wish to get the Information for an Employee
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeRecord> employeeQueryResults = new ArrayList<EmployeeRecord>();
		List<DiffEmployeeRecord> diffQueryRecords = new ArrayList<DiffEmployeeRecord>();
		
		employeeQueryResults.add(getEmployeeRecord("Dharma", "1", LocalDate.now(), null, null));
		diffQueryRecords.add(getDiffEmployeeRecord(1, LocalDate.now(), "Hired Today"));
		employeeQueryResults.add(getEmployeeRecord("Dharma", "1", LocalDate.now(), LocalDate.now().plusDays(1), null));
		diffQueryRecords.add(getDiffEmployeeRecord(1, LocalDate.now(), "Transfered Today"));
		employeeQueryResults.add(getEmployeeRecord("Dharma", "1", LocalDate.now(), null, LocalDate.now().plusDays(1)));
		diffQueryRecords.add(getDiffEmployeeRecord(1, LocalDate.now(), "Terminated Today"));
		
		employeeQueryResults.add(getEmployeeRecord("Pat", "2", LocalDate.now(), null, null));
		diffQueryRecords.add(getDiffEmployeeRecord(2, LocalDate.now(), "Hired Today"));
		employeeQueryResults.add(getEmployeeRecord("Pat", "2", LocalDate.now(), LocalDate.now().plusDays(1), null));
		diffQueryRecords.add(getDiffEmployeeRecord(2, LocalDate.now(), "Transfered Today"));
		employeeQueryResults.add(getEmployeeRecord("Pat", "2", LocalDate.now(), null, LocalDate.now().plusDays(1)));
		diffQueryRecords.add(getDiffEmployeeRecord(2, LocalDate.now(), "Terminated Today"));
		
		employeeQueryResults.stream().collect(Collectors.groupingBy(EmployeeRecord::getEmployeeId));
		
		
		
		
		

	}
	
	
	
	private static EmployeeRecord getEmployeeRecord(String name, String employeeId, LocalDate hireDate, LocalDate transferDate, LocalDate terminateDate) {
		EmployeeRecord employeeRecord = new EmployeeRecord();
		employeeRecord.setEmployeeName(name);
		employeeRecord.setEmployeeId(employeeId);
		employeeRecord.setHireDate(hireDate);
		employeeRecord.setTransferDate(transferDate);
		employeeRecord.setTerminateDate(terminateDate);
		return employeeRecord;
	}
	
	private static DiffEmployeeRecord getDiffEmployeeRecord(int employeeId, LocalDate hireDate, String notes) {
		DiffEmployeeRecord diffEmployeeRecord = new DiffEmployeeRecord();
		diffEmployeeRecord.setEmployeeId(employeeId);
		diffEmployeeRecord.setHireDate(hireDate);
		diffEmployeeRecord.setNotes(notes);
		return diffEmployeeRecord;
	}

}
