package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.abstracts.ICityService;
import com.javacourse.project.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {

	private ICityService cityService;

	@Autowired
	public CitiesController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/all")
	public List<City> getAll(){
		return cityService.getAll();
	}
	
	@GetMapping("/city/{id}")
	public City get(@PathVariable int id){
		return cityService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city){
		 cityService.add(city);
	}
	
	
	@PostMapping("/update")
	public void update(@RequestBody City city){
		 cityService.update(city);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody City city){
		 cityService.delete(city);
	}
	
	
	
	
}
