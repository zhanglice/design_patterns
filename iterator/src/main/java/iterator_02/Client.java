package iterator_02;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        project.add("星球大战",23,132323);
        project.add("超人制造",34,3433000);
        IProjectIterator iterator = project.iterator();
        while(iterator.hasNext()){
            IProject p = (IProject)iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
