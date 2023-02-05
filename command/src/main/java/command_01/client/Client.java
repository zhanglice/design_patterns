package command_01.client;

import command_01.command.AddRequirementCommand;
import command_01.command.DeletePageCommand;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        System.out.println("======客户增加需求======");
        AddRequirementCommand arc = new AddRequirementCommand();
        invoker.setCommand(arc);
        invoker.action();

        System.out.println("======客户删除页面======");
        DeletePageCommand dpc = new DeletePageCommand();
        invoker.setCommand(dpc);
        invoker.action();
    }
}
