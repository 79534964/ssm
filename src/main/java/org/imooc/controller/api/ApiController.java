package org.imooc.controller.api;

import java.util.List;

import org.imooc.bean.Movies;
import org.imooc.dto.MoviesDto;
import org.imooc.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController{
	@Autowired 
	private MoviesService moviesService;
	
	@RequestMapping(value="/movies", method = RequestMethod.GET)
	public List<MoviesDto> movies(){
		return moviesService.getMovies();
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public boolean remove(@RequestParam("id") int id) {
		return moviesService.remove(id);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public boolean insert(Movies movies) {
		return moviesService.insert(movies);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public boolean update(Movies movies) {
		return moviesService.update(movies);
	}

}
