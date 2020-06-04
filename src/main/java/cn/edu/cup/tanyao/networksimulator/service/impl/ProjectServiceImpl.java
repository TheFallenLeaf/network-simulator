package cn.edu.cup.tanyao.networksimulator.service.impl;

import cn.edu.cup.tanyao.networksimulator.dao.NodeMapper;
import cn.edu.cup.tanyao.networksimulator.dao.PipeMapper;
import cn.edu.cup.tanyao.networksimulator.domain.Node;
import cn.edu.cup.tanyao.networksimulator.domain.Pipe;
import cn.edu.cup.tanyao.networksimulator.service.ProjectService;
import cn.edu.cup.tanyao.networksimulator.structrue.EdgeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanyao
 * @create 2020/06/04
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private NodeMapper nodeMapper;

	@Autowired
	private PipeMapper pipeMapper;

	/**
	 * 根据项目id查询管网数据结构
	 * @param projectId
	 * @return
	 */
	@Override
	public EdgeTable queryStructure(Integer projectId) {
		List<Pipe> pipes = pipeMapper.selectByProjectId(projectId);
		List<Node> nodes = nodeMapper.selectByProjectId(projectId);
		EdgeTable project = new EdgeTable(nodes, pipes);
		return project;
	}
}
