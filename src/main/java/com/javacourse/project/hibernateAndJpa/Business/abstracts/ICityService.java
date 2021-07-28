package com.javacourse.project.hibernateAndJpa.Business.abstracts;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityService {

	
	List<City> getAll();
	
	City getById(int id);

	void add(City city);

	void update(City city);

	void delete(City city);
}
