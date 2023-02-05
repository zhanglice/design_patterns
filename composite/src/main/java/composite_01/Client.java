package composite_01;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomeThing();

        Composite branch = new Composite();
        Leaf leaf = new Leaf();

        root.add(branch);
        branch.add(leaf);

        display(root);
    }
    //遍历
    public static void display(Composite root){
        for(Component c:root.getChildren()){
            if(c instanceof Leaf){
                c.doSomeThing();
            }else {
                display((Composite) c);
            }
        }
    }
}
