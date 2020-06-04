package cn.edu.cup.tanyao.networksimulator.structrue;

import java.io.Serializable;
import java.util.List;

/**
 * 边表
 * @author tanyao
 * @date 2020/6/3
 */
public class EdgeTable<T> implements Serializable {

    private Integer vertexCount; //顶点个数
    private Integer edgeCount; //边个数
    private List<T> vertices; //描述顶点的属性
    private List<T> edges; //描述边的属性

    /**
     * 图的初始化
     */
    public EdgeTable() {}

    /**
     * 图的初始化
     * @param vertices 顶点集
     * @param edges 边集
     */
    public EdgeTable(List<T> vertices, List<T> edges) {
        this.vertices = vertices;
        this.edges = edges;
        this.vertexCount = vertices.size();
        this.edgeCount = edges.size();
    }

    /**
     * 加顶点
     * @param vertex 顶点
     */
    public void addVertex(T vertex) {
        this.vertices.add(vertex);
        this.vertexCount ++;
    }

    /**
     * 加边
     * @param edge 边
     */
    public void addEdge(T edge) {
        this.edges.add(edge);
    }

    /**
     * 删除顶点
     * @param vertex 顶点
     * @return
     */
    public boolean removeVertex(T vertex) {
        if (this.vertices.contains(vertex)) {
            this.vertices.remove(vertex);
            this.vertexCount --;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除边
     * @param edge 边
     * @return
     */
    public boolean removeEdge(T edge) {
        if (this.edges.contains(edge)) {
            this.edges.remove(edge);
            this.edgeCount --;
            return true;
        } else {
            return false;
        }
    }

    public Integer getVertexCount() {
        return vertexCount;
    }

    public Integer getEdgeCount() {
        return edgeCount;
    }

    public List<T> getVertices() {
        return vertices;
    }

    public List<T> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "EdgeTable{" +
                "vertices=" + vertices +
                ", edges=" + edges +
                '}';
    }
}
