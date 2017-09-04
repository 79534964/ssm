package org.imooc.dao;

import java.util.List;
import org.imooc.bean.Movies;

public interface MoviesDao {
	List<Movies> selectMovies(Movies movies);
	int delete(int id);
	int insert(Movies movies);
	int update(Movies movies);
}
