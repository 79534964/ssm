package org.imooc.controller.jsp;

import java.util.ArrayList;
import java.util.List;

import org.imooc.dto.MoviesDto;
import org.imooc.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

	@Autowired
	private MoviesService moviesService;

	@RequestMapping("/moviesJsp")
	public String search(Model model) {
		List<MoviesDto> moviesList = moviesService.getMovies();
		//List<MoviesDto> moviesList = new ArrayList<MoviesDto>();
		model.addAttribute("moviesList", moviesList);
		return "/movies";
	}
}
