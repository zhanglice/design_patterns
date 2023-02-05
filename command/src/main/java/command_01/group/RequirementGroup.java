package command_01.group;

public class RequirementGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到需求组！");
    }

    @Override
    public void add() {
        System.out.println("增加一项需求！");
    }

    @Override
    public void delete() {
        System.out.println("删除一项需求！");
    }

    @Override
    public void change() {
        System.out.println("修改需求!");
    }

    @Override
    public void plan() {
        System.out.println("需求变更计划");
    }
}
