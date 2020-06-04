package cn.edu.cup.tanyao.networksimulator.domain;

public class Node {
    private Integer nodeId;

    private Integer projectId;

    private Double pressure;

    private Integer pressureState;

    private Double flow;

    private Integer flowState;

    private Double elevation;

    public Node(Integer nodeId, Integer projectId, Double pressure, Integer pressureState, Double flow, Integer flowState, Double elevation) {
        this.nodeId = nodeId;
        this.projectId = projectId;
        this.pressure = pressure;
        this.pressureState = pressureState;
        this.flow = flow;
        this.flowState = flowState;
        this.elevation = elevation;
    }

    public Node() {
        super();
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Integer getPressureState() {
        return pressureState;
    }

    public void setPressureState(Integer pressureState) {
        this.pressureState = pressureState;
    }

    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }

    public Integer getFlowState() {
        return flowState;
    }

    public void setFlowState(Integer flowState) {
        this.flowState = flowState;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }
}