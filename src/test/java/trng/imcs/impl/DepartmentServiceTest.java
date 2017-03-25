package trng.imcs.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import trng.imcs.DepartmentService;

public class DepartmentServiceTest {

	DepartmentService classUnderTest;
	
	@Before
	public void setup() {
		classUnderTest = new DepartmentServiceImpl();
	}
	
	@Test
	public void testGetDepartmentTotalSalary() {
		//Given
		int deptNo = 10;
		
		//Then
		double actualResult = classUnderTest.getDepartmentTotalSalary(deptNo);
		
		//Assert
		assertEquals(1000, actualResult, 0);
	}

}
