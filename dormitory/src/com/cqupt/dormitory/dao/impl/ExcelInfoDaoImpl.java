package com.cqupt.dormitory.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cqupt.dormitory.dao.ExcelInfoDao;
import com.cqupt.dormitory.model.ExcelInfo;

@Repository
public class ExcelInfoDaoImpl extends BaseDaoSupport implements ExcelInfoDao {

	@Override
	public boolean addExcel(ExcelInfo excelInfo) {
		int result = -1;
		try {
			result = getSqlSession().insert("addExcel", excelInfo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(result > 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteExcelById(List<Integer> ids) {
		int result = -1;
		try {
			result = getSqlSession().delete("deleteExcelById", ids);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(result > 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<ExcelInfo> findAllExcel() {
		List<ExcelInfo> infos = null;
		try{
			infos = getSqlSession().selectList("findAllExcel");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return infos;
	}

	@Override
	public List<ExcelInfo> findExcelByTecNum(String tecNum) {
		List<ExcelInfo> infos = null;
		try{
			infos = getSqlSession().selectList("findExcelByTecNum", tecNum);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return infos;
	}

}
