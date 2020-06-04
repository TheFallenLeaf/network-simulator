package cn.edu.cup.tanyao.networksimulator.dao;

import cn.edu.cup.tanyao.networksimulator.domain.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}
