package com.cqupt.dormitory.dao.impl;

import java.util.List;

import com.cqupt.dormitory.dao.FloorDao;
import com.cqupt.dormitory.model.Floor;

public class FloorDaoImpl extends BaseDaoSupport implements FloorDao {
	@Override
	public List<Floor> findFloorByBuildingNum(String buildingNum) {
		return getSqlSession().selectList(Floor.class.getName()+".find_floor_by_buildingnum",buildingNum);
	}

}
