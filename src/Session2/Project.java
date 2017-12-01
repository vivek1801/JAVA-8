package Session2;


public class Project {
    String projectId;
    String ProjectName;
    String director;

    @Override
    public String toString() {
        return "Session2.Project{" +
                "projectId='" + projectId + '\'' +
                ", ProjectName='" + ProjectName + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public Project(String projectId, String projectName, String director) {
        this.projectId = projectId;
        ProjectName = projectName;
        this.director = director;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
