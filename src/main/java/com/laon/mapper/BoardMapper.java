package com.laon.mapper;

import java.util.List;

import com.laon.model.BoardDto;

public interface BoardMapper {
	// xml 파일명과 일치해야 xml까지 연결이 된다.
	public List<BoardDto> selectBoardList();
}
