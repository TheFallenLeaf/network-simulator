package cn.edu.cup.tanyao.networksimulator.structrue;

import java.io.Serializable;
import java.util.Map;

/**
 * 邻接表
 * @author tanyao
 * @date 2020/6/3
 */
public class AdjacencyTable<T> implements Serializable {
	private Map<T,Map<T, T>> adjacency; //邻接表

	public AdjacencyTable() {}

	public AdjacencyTable(Map<T, Map<T, T>> adjacency) {
		this.adjacency = adjacency;
	}

	/**
	 * 增加邻接表
	 * @param vertex 增加的节点
	 * @param relation 与节点相关联的节点以及他们之间的权重
	 */
	public void add(T vertex, Map<T, T> relation) {
		//更新节点关系
		for (Map.Entry<T, T> entry : relation.entrySet()) {
			//新节点相关联的节点
			T key = entry.getKey();
			//节点间的权重
			T value = entry.getValue();
			//获取相关节点的链
			Map table = adjacency.get(key);
			//更新链
			table.put(key, value);
			//更新表
			adjacency.put(key, table);
		}
		//增加节点
		adjacency.put(vertex, relation);
	}

	public Map<T, Map<T, T>> getAdjacency() {
		return adjacency;
	}

	@Override
	public String toString() {
		return "AdjacencyTable{" +
				"adjacency=" + adjacency +
				'}';
	}


}
