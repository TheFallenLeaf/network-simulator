package cn.edu.cup.tanyao.networksimulator.dao;

import cn.edu.cup.tanyao.networksimulator.domain.Pipe;

public interface PipeMapper {
    int deleteByPrimaryKey(Integer pipeId);

    int insert(Pipe record);

    int insertSelective(Pipe record);

    Pipe selectByPrimaryKey(Integer pipeId);

    int updateByPrimaryKeySelective(Pipe record);

    int updateByPrimaryKey(Pipe record);
}