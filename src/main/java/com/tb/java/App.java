package com.tb.java;

import com.tb.dao.DataDao;
import com.tb.dao.StudentDao;
import com.tb.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Creating dummy object
		Student student = new Student(1, "techburps", "New delhi");

		DataDao<Student> dataDao = new StudentDao();
		dataDao.insert(student);
	}
}
