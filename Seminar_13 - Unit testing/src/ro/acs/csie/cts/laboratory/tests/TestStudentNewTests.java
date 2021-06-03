package ro.acs.csie.cts.laboratory.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.acs.csie.cts.laboratory.Student;
import ro.acs.csie.cts.laboratory.exceptions.WrongAgeException;
import ro.acs.csie.cts.laboratory.exceptions.WrongGradeException;

public class TestStudentNewTests {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoGrades;
	static ArrayList<Integer> performanceGrades;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		initialName = "John Doe";
		initialAge = Student.MIN_AGE + 1;
		initialNoGrades = 3;
		grades = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0; i< initialNoGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}
		student = new Student(initialName, initialAge, grades);

		ArrayList<Integer> performanceGrades = new ArrayList<Integer>();
		int noGrades2 = (int) 1e6;
		for(int j=0; j<noGrades2; j++) {
			performanceGrades.add(random.nextInt(Student.MAX_GRADE)+1);
		}
		student.setGrades(performanceGrades);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		student = new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = WrongAgeException.class)
	public void testSetAgeRangeMaxAge() throws WrongAgeException {
		
		int newAge = Integer.MAX_VALUE;
		student.setAge(newAge);
		
	}
	
	@Test (expected = WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException {
		int newAge = 200;
		student.setAge(newAge);
	}
	
	@Test
	public void testSetAgeBoundaryLowLimit() throws WrongAgeException {
		int newAge = Student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age lower limit", newAge, student.getAge());
	}
	
	@Test
	public void testSetAgeBoundaryUpperLimit() throws WrongAgeException {
		int newAge = Student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age lower limit", newAge, student.getAge());
	}
	
	@Test
	public void testSetGradesReferenceDeepCopy() throws WrongAgeException, WrongGradeException {
		int[] grades = new int[] {9,9,10};
		ArrayList<Integer> refGrades = new ArrayList<Integer>(Arrays.asList(9, 9, 10));
		
		student.setGrades(refGrades);
		refGrades.set(0,  5);
		
		int[] studentGrades = new int[student.getNoGrades()];
		for(int i=0; i<student.getNoGrades(); i++)
			studentGrades[i] = student.getGrade(i);
		
		assertArrayEquals("We do shallow copy", 
				grades, studentGrades);
		
	}
	
	@Test
	public void testGetGradesAveragePerformance() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int noGrades = (int) 1e6;
		Random random = new Random();
		for(int i=0; i<noGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE)+1);
		student.setGrades(grades);
		
		long tStart = System.currentTimeMillis();
		student.getGradesAverage();
		long tFinal = System.currentTimeMillis();
		
		long delta = tFinal - tStart;
		
		long perfomanceLimit = 6;
		if(delta <= perfomanceLimit)
			assertTrue(true);
		else
			fail("Takes too long");
		
		}
	}

	@Test(timeout = 12)
	public void testGetGradesAveragePerformanceTwo() throws WrongGradeException {
		
		student.setGrades(performanceGrades);
		student.getGradesAverage();

	}
}
