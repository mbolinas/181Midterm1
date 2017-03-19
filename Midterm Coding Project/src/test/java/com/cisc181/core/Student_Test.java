package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException{
		


		
		}

	@Test
	public void TestGrade() throws PersonException{
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course("CISC181",4,eMajor.COMPSI);
		Course c2 = new Course("CHEM103",4,eMajor.CHEM);
		Course c3 = new Course("PHYS207",4,eMajor.PHYSICS);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		Semester fall = new Semester(new Date(117,9,5), new Date(118,1,1));
		Semester spring = new Semester(new Date(118,2,15), new Date(118,6,20));
		semesters.add(fall);
		semesters.add(spring);
		
		
		ArrayList<Section> sections = new ArrayList<Section>();
		Section secf1 = new Section(courses.get(0).getCourseID(),semesters.get(0).getSemesterID(),120);
		Section secf2 = new Section(courses.get(1).getCourseID(),semesters.get(0).getSemesterID(),121);
		Section secf3 = new Section(courses.get(2).getCourseID(),semesters.get(0).getSemesterID(),122);
		Section secs1 = new Section(courses.get(0).getCourseID(),semesters.get(1).getSemesterID(),120);
		Section secs2 = new Section(courses.get(1).getCourseID(),semesters.get(1).getSemesterID(),121);
		Section secs3 = new Section(courses.get(2).getCourseID(),semesters.get(1).getSemesterID(),122);
		sections.add(secf1);
		sections.add(secf2);
		sections.add(secf3);
		sections.add(secs1);
		sections.add(secs2);
		sections.add(secs3);
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("first","middle","last",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s2 = new Student("a","b","c",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s3 = new Student("jon","you know nothing","snow",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s4 = new Student("d","e","f",new Date(), eMajor.COMPSI, "home","(123)-456-7890","email");
		Student s5 = new Student("g","h","i",new Date(), eMajor.CHEM, "there","(123)-456-7890","email");
		Student s6 = new Student("j","k","l",new Date(), eMajor.NURSING, "address","(123)-456-7890","email");
		Student s7 = new Student("m","n","o",new Date(), eMajor.PHYSICS, "none","(123)-456-7890","email");
		Student s8 = new Student("p","q","r",new Date(), eMajor.COMPSI, "where","(123)-456-7890","email");
		Student s9 = new Student("s","t","u",new Date(), eMajor.BUSINESS, "address","(123)-456-7890","email");
		Student s10 = new Student("v","w","x",new Date(), eMajor.CHEM, "yes","(123)-456-7890","email");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		
		
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Student stu : students){
			for(Section sec : sections){
				enrollments.add(new Enrollment(stu.getStudentID(),sec.getSectionID(),4));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for(Student s : students){
			double gpa = 0;
			for(Enrollment e : enrollments){
				if(s.getStudentID() == e.getStudentID()){
					gpa = gpa + e.getGrade();
				}
			}
			gpa = gpa / 6;
			assertEquals(4,(int) gpa);
		}
		
		
		
		for(Course c : courses){
			double avgGrade = 0;
			for(Section s : sections){
				if(c.getCourseID() == s.getCourseID()){
					for(Enrollment e : enrollments){
						if(s.getSectionID() == e.getSectionID()){
							avgGrade = avgGrade + e.getGrade();
						}
					}
					avgGrade = avgGrade / 10;
					assertEquals(4,(int) avgGrade);
				}
			}
		}
		
		
		
		
	}
	
	
	
	
	@Test
	public void TestMajorChange() throws PersonException{
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c1 = new Course("CISC181",4,eMajor.COMPSI);
		Course c2 = new Course("CHEM103",4,eMajor.CHEM);
		Course c3 = new Course("PHYS207",4,eMajor.PHYSICS);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		Semester fall = new Semester(new Date(117,9,5), new Date(118,1,1));
		Semester spring = new Semester(new Date(118,2,15), new Date(118,6,20));
		semesters.add(fall);
		semesters.add(spring);
		
		
		ArrayList<Section> sections = new ArrayList<Section>();
		Section secf1 = new Section(courses.get(0).getCourseID(),semesters.get(0).getSemesterID(),120);
		Section secf2 = new Section(courses.get(1).getCourseID(),semesters.get(0).getSemesterID(),121);
		Section secf3 = new Section(courses.get(2).getCourseID(),semesters.get(0).getSemesterID(),122);
		Section secs1 = new Section(courses.get(0).getCourseID(),semesters.get(1).getSemesterID(),120);
		Section secs2 = new Section(courses.get(1).getCourseID(),semesters.get(1).getSemesterID(),121);
		Section secs3 = new Section(courses.get(2).getCourseID(),semesters.get(1).getSemesterID(),122);
		sections.add(secf1);
		sections.add(secf2);
		sections.add(secf3);
		sections.add(secs1);
		sections.add(secs2);
		sections.add(secs3);
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("first","middle","last",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s2 = new Student("a","b","c",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s3 = new Student("jon","you know nothing","snow",new Date(), eMajor.COMPSI, "address","(123)-456-7890","email");
		Student s4 = new Student("d","e","f",new Date(), eMajor.COMPSI, "home","(123)-456-7890","email");
		Student s5 = new Student("g","h","i",new Date(), eMajor.CHEM, "there","(123)-456-7890","email");
		Student s6 = new Student("j","k","l",new Date(), eMajor.NURSING, "address","(123)-456-7890","email");
		Student s7 = new Student("m","n","o",new Date(), eMajor.PHYSICS, "none","(123)-456-7890","email");
		Student s8 = new Student("p","q","r",new Date(), eMajor.COMPSI, "where","(123)-456-7890","email");
		Student s9 = new Student("s","t","u",new Date(), eMajor.BUSINESS, "address","(123)-456-7890","email");
		Student s10 = new Student("v","w","x",new Date(), eMajor.CHEM, "yes","(123)-456-7890","email");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		
		
		
		students.get(0).setMajor(eMajor.BUSINESS);
		
		assertEquals(eMajor.BUSINESS,students.get(0).getMajor());
	}
}