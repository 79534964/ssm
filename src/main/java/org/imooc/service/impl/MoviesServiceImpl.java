package org.imooc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.imooc.bean.Movies;
import org.imooc.dao.MoviesDao;
import org.imooc.dto.MoviesDto;
import org.imooc.service.MoviesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesServiceImpl implements MoviesService {
	@Autowired
	private MoviesDao moviesDao;

	@Override
	public List<MoviesDto> getMovies() {
		List<MoviesDto> result = new ArrayList<MoviesDto>();
		List<Movies> moviesList = moviesDao.selectMovies(new Movies());
		for (Movies movies : moviesList) {
			MoviesDto MoviesDto = new MoviesDto();
			BeanUtils.copyProperties(movies, MoviesDto);
			if (movies.getMovieFrom() == 1) {
				MoviesDto.setFrom("µçÄÔ");

			} else if (movies.getMovieFrom() == 2) {
				MoviesDto.setFrom("ÊÖ»ú");
			}
			result.add(MoviesDto);

		}
		return result;
	}

	@Override
	public boolean remove(int id) {
		return moviesDao.delete(id) == 1;
	}

	@Override
	public boolean insert(Movies movies) {
		return moviesDao.insert(movies) == 1;

	}

	@Override
	public boolean update(Movies movies) {
		return moviesDao.update(movies) == 1;
	}

}
