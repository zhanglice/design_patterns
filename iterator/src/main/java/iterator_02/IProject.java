package iterator_02;

public interface IProject {
    void add(String name, int num, int cost);
    String getProjectInfo();
    IProjectIterator iterator();
}
