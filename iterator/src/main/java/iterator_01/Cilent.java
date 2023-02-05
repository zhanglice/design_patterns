package iterator_01;

import java.util.ArrayList;

public class Cilent {
    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<>();
        projectList.add(new Project("星球大战项目",10,100000));
        projectList.add(new Project("超人改造项目",13,500000));
        for(IProject project : projectList){  //底层便是ArrayList实现了迭代器！！！！
            System.out.println(project.getProjectInfo());
        }
    }
}
