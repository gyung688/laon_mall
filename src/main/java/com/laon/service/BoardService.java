package com.laon.service;

import java.util.List;

import com.laon.model.BoardDto;

public interface BoardService {

	public List<BoardDto> selectBoardList() throws Exception;
}
