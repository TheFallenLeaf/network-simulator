package cn.edu.cup.tanyao.networksimulator.dao;

import cn.edu.cup.tanyao.networksimulator.domain.Gas;

public interface GasMapper {
    int deleteByPrimaryKey(Integer gasId);

    int insert(Gas record);

    int insertSelective(Gas record);

    Gas selectByPrimaryKey(Integer gasId);

    int updateByPrimaryKeySelective(Gas record);

    int updateByPrimaryKey(Gas record);
}
