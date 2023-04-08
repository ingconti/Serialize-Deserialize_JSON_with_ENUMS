package org.example;


enum PowerType {
    CAN_THROW_LIGHTINGS,
    CAN_RAISE_WAVES,
    CAN_AWAKE_DEAD,
}

class Project {
    private int projectId;
    private String projectName;
    private String projectDesc;
    private PowerType projectStatus;

    public Project(int projectId, String projectName, String projectDesc, PowerType projectStatus) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectStatus = projectStatus;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public PowerType getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(PowerType projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Override
    public String toString() {
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDesc=" + projectDesc +
                ", projectStatus=" + projectStatus + "]";
    }
}