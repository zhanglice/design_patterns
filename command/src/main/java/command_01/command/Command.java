package command_01.command;

import command_01.group.CodeGroup;
import command_01.group.PageGroup;
import command_01.group.RequirementGroup;

public abstract class Command {
    protected RequirementGroup rq = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
