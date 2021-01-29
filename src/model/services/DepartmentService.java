package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		List<Department> depList = new ArrayList<>();
		depList.add(new Department(1, "Books"));
		depList.add(new Department(2, "Computers"));
		depList.add(new Department(3, "Electronics"));
		return depList;
	}

}
