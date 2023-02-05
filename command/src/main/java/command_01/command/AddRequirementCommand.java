package command_01.command;

public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.rq.find();
        super.rq.add();
        super.rq.plan();
    }
}
