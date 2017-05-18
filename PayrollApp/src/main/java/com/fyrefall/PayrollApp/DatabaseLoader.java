package com.fyrefall.PayrollApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {//24 employees
		this.repository.save(new Employee("Frodo", "Baggins", "Morning"));
		this.repository.save(new Employee("Samwise", "Gamgee", "Afternoon"));
		this.repository.save(new Employee("Meriadoc", "Brandybuck", "Evening"));
		this.repository.save(new Employee("Peregrin", "Took", "mushroom Morning"));
		this.repository.save(new Employee("Legolas", "Greenleaf", "Afternoon"));
		this.repository.save(new Employee("Aragorn", "Ellesar", "Evening"));
		this.repository.save(new Employee("Eomer", "Rohan", "Morning"));
		this.repository.save(new Employee("Theoden", "Rohan", "Afternoon"));
		this.repository.save(new Employee("Eowyn", "Rohan", "Evening"));
		this.repository.save(new Employee("Gamling", "The Old", "Morning"));
		this.repository.save(new Employee("Gimli", "Son Of Gloin", "Afternoon"));
		this.repository.save(new Employee("Gandalf", "Mithrandil", "Evening"));
		
		this.repository.save(new Employee("Luke", "Skywalker", "Morning"));
		this.repository.save(new Employee("Anakin", "Skywalker", "Afternoon"));
		this.repository.save(new Employee("Mace", "Windu", "Evening"));
		this.repository.save(new Employee("Aayla", "Secura", "mushroom Morning"));
		this.repository.save(new Employee("Obi Wan", "Kenobi", "Afternoon"));
		this.repository.save(new Employee("Plo", "Koon", "Evening"));
		this.repository.save(new Employee("Padme", "Amidala", "Morning"));
		this.repository.save(new Employee("Viceroy", "Gunray", "Afternoon"));
		this.repository.save(new Employee("Master", "Yoda", "Evening"));
		this.repository.save(new Employee("Darth", "Maul", "Morning"));
		this.repository.save(new Employee("Darth", "Tyranus", "Afternoon"));
		this.repository.save(new Employee("Darth", "Sidious", "Evening"));
		
	}
}
