public class Project {
    private String name;
    private String description;
    
    public Project () {}

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getProjectName() {
        return this.name;
    }

    public String setProjectName(String name) {
        return this.name = name;
    }

    public String getProjectDescription() {
        return this.description;
    }

    public String setProjectDescription() {
        return this.description = description;
    }

    public String elevatorPitch() {
        return this.name + ": " + this.description;
    }
}