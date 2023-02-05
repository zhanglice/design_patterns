package strategy_01;

public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太放行！");
    }
}
