package com.pk.biz;

import java.util.List;

import com.pk.dao.BoardDao;
import com.pk.dao.RecipeBoardImpl;
import com.pk.dto.RecipeBoardDto;

public class RecipeBoardBiz {

	BoardDao recipeBoardDao = new RecipeBoardImpl();

	public List<RecipeBoardDto> selectList(int offset, int noOfRecords) {
		return recipeBoardDao.selectList(offset, noOfRecords);
	};

	public List<RecipeBoardDto> searchFiled(int offset, int noOfRecords, String searchFiled, String searchValue) {

		return recipeBoardDao.searchFiled(offset, noOfRecords, searchFiled, searchValue);
	};

	public RecipeBoardDto selectOne(int no) {

		return recipeBoardDao.selectOne(no);
	};

	public int insert(RecipeBoardDto dto) {

		return recipeBoardDao.insert(dto);
	};

	public int update(RecipeBoardDto dto) {

		return recipeBoardDao.update(dto);
	};

	public int delete(int no) {

		return recipeBoardDao.delete(no);
	};

}