package cn.edu.cup.tanyao.networksimulator.dao;

import cn.edu.cup.tanyao.networksimulator.domain.Pipe;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface PipeMapper {
    int deleteByPrimaryKey(Integer pipeId);

    int insert(Pipe record);

    int insertSelective(Pipe record);

    Pipe selectByPrimaryKey(Integer pipeId);

    int updateByPrimaryKeySelective(Pipe record);

    int updateByPrimaryKey(Pipe record);

    List<Pipe> selectByProjectId(@Param("projectId") Integer projectId);

    Set<Pipe> selectByNodeId(@Param("nodeId") Integer nodeId, @Param("projectId") Integer projectId);
}
