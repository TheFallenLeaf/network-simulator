package cn.edu.cup.tanyao.networksimulator.structrue;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 邻接矩阵
 * @author tanyao
 * @date 2020/6/3
 */
public class AdjacencyMatrix<T> implements Serializable {
	private T[] vertices; //顶点集合
	private T[][] adjacencyMatrix; //邻接矩阵

	public AdjacencyMatrix() {}

	public AdjacencyMatrix(T[] vertices, T[][] adjacencyMatrix) {
		this.vertices = vertices;
		this.adjacencyMatrix = adjacencyMatrix;
	}

	public T[] getVertices() {
		return vertices;
	}

	public T[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	@Override
	public String toString() {
		return "AdjacencyMatrix{" +
				"vertices=" + Arrays.toString(vertices) +
				", adjacencyMatrix=" + Arrays.toString(adjacencyMatrix) +
				'}';
	}
}
