package org.imooc.controller.ajax;

import java.util.List;

import org.imooc.dto.MoviesDto;
import org.imooc.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

	@RequestMapping("/moviesAjax")
	public String search() {
		return "/moviesAjax";
	}
}
