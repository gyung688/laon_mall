package com.laon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laon.mapper.BoardDao;
import com.laon.model.BoardDto;
import com.laon.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		return boardDao.selectBoardList();
	}

	
}
