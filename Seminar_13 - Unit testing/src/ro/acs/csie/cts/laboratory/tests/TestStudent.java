package ro.acs.csie.cts.laboratory.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.acs.csie.cts.laboratory.Student;
import ro.acs.csie.cts.laboratory.exceptions.WrongAgeException;
import ro.acs.csie.cts.laboratory.exceptions.WrongNameException;

public class TestStudent {
	
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName = "John";
	static int initialAge = 21;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		grades = new ArrayList<Integer>();
		grades.add(1);
		grades.add(7);
		grades.add(8);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName, initialAge , grades);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		String newName = "John Doe";
		student.setName(newName);
		assertEquals("Testing with a proper name",  newName,  student.getName());
	}
	
	@Test
	public void testSetAgeConformanceForRightInput()  {
		int newAge = initialAge +1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with a proper age",  newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for right data");
		}
	}
	
	@Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge = initialAge * (-1);
		try {
			student.setAge(newAge);
			fail("We didn't get the exception.");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException {
		String newName = "Na";
		student.setName(newName);
	}

}
