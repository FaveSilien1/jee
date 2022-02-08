package fr.formation.inti.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	private final Log log = LogFactory.getLog(EmployeeService.class);
    private String Message;
	
	@Autowired
	@Qualifier("employeeDao")
	private IEmployeeDao dao;

	public EmployeeService() {
		log.info("create new EmployeeService()");
	
	}
	public EmployeeService(IEmployeeDao dao) {
		log.info("------------------------- new EmployeeService(dao)");
		this.dao = dao;
	}

	

	@Override
	public Integer save(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);

	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public Employee findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		dao.beginTransaction();
		List<Employee> list = dao.findAll();
		dao.commitTransaction();
		dao.close();
		return list;
	}

	public IEmployeeDao getDao() {
		return dao;
	}
// Setter pour la config xml
	public void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}
	public String getMessage() {
		return Message;
	}
	
	// Setter pour le Message xml
	public void setMessage(String message) {
		Message = message;
	}

	
	
}
