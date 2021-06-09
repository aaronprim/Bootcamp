public class ProjectTest {

    public static void main(Sting[] args) {
        Project project1 = new Project("Flappy Bird", "game controlling birds flight");
        System.out.println(project1.elevatorPitch());

        Project project2 = new Project();
        project2.setProjectName("Angry Birds");
        project2.setProjectDescription("Shoot angry birds at pigs");
        System.out.println(project2.elevatorPitch()); 
    }
}