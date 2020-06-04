package cn.edu.cup.tanyao.networksimulator.dao;

import cn.edu.cup.tanyao.networksimulator.domain.Node;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NodeMapper {
    int deleteByPrimaryKey(Integer nodeId);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(Integer nodeId);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);

    List<Node> selectByProjectId(@Param("projectId") Integer projectId);
}
