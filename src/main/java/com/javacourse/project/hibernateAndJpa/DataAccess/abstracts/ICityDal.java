package com.javacourse.project.hibernateAndJpa.DataAccess.abstracts;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityDal {

	List<City> getAll();

	City getById(int id);
	
	void add(City city);

	void update(City city);

	void delete(City city);

}
