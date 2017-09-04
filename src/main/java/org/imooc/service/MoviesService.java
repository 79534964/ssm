package org.imooc.service;

import java.util.List;

import org.imooc.bean.Movies;
import org.imooc.dto.MoviesDto;

public interface MoviesService {
	List<MoviesDto> getMovies();
	boolean remove(int id);
	boolean insert(Movies movies);
	boolean update(Movies movies);
}
