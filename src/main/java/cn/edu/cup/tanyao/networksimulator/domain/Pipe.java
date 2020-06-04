package cn.edu.cup.tanyao.networksimulator.domain;

import java.io.Serializable;

public class Pipe implements Serializable {
    private Integer pipeId;

    private Integer projectId;

    private Integer startNode;

    private Integer endNode;

    private Double diameter;

    private Double roughness;

    private Double length;

    public Pipe(Integer pipeId, Integer projectId, Integer startNode, Integer endNode, Double diameter, Double roughness, Double length) {
        this.pipeId = pipeId;
        this.projectId = projectId;
        this.startNode = startNode;
        this.endNode = endNode;
        this.diameter = diameter;
        this.roughness = roughness;
        this.length = length;
    }

    public Pipe() {
        super();
    }

    public Integer getPipeId() {
        return pipeId;
    }

    public void setPipeId(Integer pipeId) {
        this.pipeId = pipeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getStartNode() {
        return startNode;
    }

    public void setStartNode(Integer startNode) {
        this.startNode = startNode;
    }

    public Integer getEndNode() {
        return endNode;
    }

    public void setEndNode(Integer endNode) {
        this.endNode = endNode;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getRoughness() {
        return roughness;
    }

    public void setRoughness(Double roughness) {
        this.roughness = roughness;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "pipeId=" + pipeId +
                ", projectId=" + projectId +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                ", diameter=" + diameter +
                ", roughness=" + roughness +
                ", length=" + length +
                '}';
    }
}
