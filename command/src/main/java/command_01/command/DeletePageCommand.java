package command_01.command;

public class DeletePageCommand extends Command{
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
