package cn.edu.cup.tanyao.networksimulator.service;

import cn.edu.cup.tanyao.networksimulator.structrue.EdgeTable;

/**
 * @author tanyao
 * @create 2020/06/04
 */
public interface ProjectService {

	/**
	 * 根据项目id查询管网结构
	 * @param projectId
	 * @return
	 */
	EdgeTable queryStructure(Integer projectId);
}
