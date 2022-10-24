package com.laon.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laon.model.BoardDto;
import com.laon.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public String getBoardList(HttpServletRequest httpReq, Model model) throws Exception{
		
		try {
			List<BoardDto> list = new ArrayList<>();
			list = boardService.selectBoardList();
			
			model.addAttribute("list", list);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return "board/boardList";
	}
}
