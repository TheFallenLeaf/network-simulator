package cn.edu.cup.tanyao.networksimulator.service.impl;

import cn.edu.cup.tanyao.networksimulator.dao.NodeMapper;
import cn.edu.cup.tanyao.networksimulator.dao.PipeMapper;
import cn.edu.cup.tanyao.networksimulator.domain.Node;
import cn.edu.cup.tanyao.networksimulator.domain.Pipe;
import cn.edu.cup.tanyao.networksimulator.service.ProjectService;
import cn.edu.cup.tanyao.networksimulator.structrue.AdjacencyTable;
import cn.edu.cup.tanyao.networksimulator.structrue.EdgeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	public EdgeTable queryEdgeTable(Integer projectId) {
		List<Pipe> pipes = pipeMapper.selectByProjectId(projectId);
		List<Node> nodes = nodeMapper.selectByProjectId(projectId);
		EdgeTable project = new EdgeTable(nodes, pipes);
		return project;
	}

	@Override
	public AdjacencyTable queryAdjacencyTable(Integer projectId) {
		List<Node> nodes = nodeMapper.selectByProjectId(projectId);
		Map<Node, Map<Node, Pipe>> data = new HashMap<>();
		//通过node_id和project_id查询相连的节点和管段
		Map relation = null;
		for (Node node : nodes) {
			//node_id
			Integer node_id = node.getNodeId();
			//所有与该节点相关联的管段
			Set<Pipe> pipes = pipeMapper.selectByNodeId(node_id, projectId);
			//邻接表
			Map<Node, Pipe> table = new HashMap<>();
			for (Pipe pipe : pipes) {
				//获取另一个节点id
				Integer otherId = (pipe.getStartNode() == node_id ? pipe.getEndNode() : pipe.getStartNode());
				//获取节点
				Node other = nodeMapper.selectByPrimaryKey(otherId);
				table.put(other, pipe);
			}
			data.put(node, new HashMap<Node, Pipe>(table));
			table.clear();
		}
		return new AdjacencyTable(data);
	}
}
