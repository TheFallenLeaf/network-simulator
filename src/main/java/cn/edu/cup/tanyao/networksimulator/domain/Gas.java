package cn.edu.cup.tanyao.networksimulator.domain;

public class Gas {
    private Integer gasId;

    private Integer projectId;

    private Double relativeDensity;

    public Gas(Integer gasId, Integer projectId, Double relativeDensity) {
        this.gasId = gasId;
        this.projectId = projectId;
        this.relativeDensity = relativeDensity;
    }

    public Gas() {
        super();
    }

    public Integer getGasId() {
        return gasId;
    }

    public void setGasId(Integer gasId) {
        this.gasId = gasId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Double getRelativeDensity() {
        return relativeDensity;
    }

    public void setRelativeDensity(Double relativeDensity) {
        this.relativeDensity = relativeDensity;
    }
}