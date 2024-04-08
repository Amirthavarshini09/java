package service;

import java.util.List;

import dao.StudentDAO;
import dao.StudentDaoImpl;
import studentassignment.exception.DataNotPresentException;
import studentassignment.exception.StudentNotFoundException;
import model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student student) throws DataNotPresentException{
		//Create an object of DAO Impl class
		StudentDAO studentDAO = new StudentDaoImpl();
		//Using above object call the addStudent 
		//and pass the student reference variable
		//addStudent method on successful addition returns message
		String message = studentDAO.addStudent(student);
		//return the message to the caller
		return message;
	}

	@Override
	public List<Student> getAllStudents() {
		StudentDAO studentDAO = new StudentDaoImpl();
		List<Student> student =studentDAO.getAllStudents();
		return student;
	}

	@Override
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDaoImpl();
		return studentDAO.getStudentByCity(city);
	}

	@Override
	public Student getStudentById(Integer id) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDaoImpl();
		return studentDAO.getStudentById(id);
	}

}