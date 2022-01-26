package com.designpattern.designpattern.behaviorpattern.command;

import com.designpattern.principle.interfacesegregation.gregation01.C;

/**
 * Created by 62691
 * on 2022/1/26 16:53
 *
 * @author swaggyw
 * 命令发起者，即遥控器
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    /**
     * 初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置你的命令
     * @param no 命令在数组中的下标
     * @param onCommand 开命令
     * @param offCommand 关命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 发起开启命令
     * @param no
     */
    public void sendOnCommand(int no) {
        onCommands[no].execute();
        //并记录这一次操作
        undoCommand = onCommands[no];
    }

    public void sendOffCommand(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    /**
     * 撤销命令
     * @param no
     */
    public void sendUndoCommand(int no) {
        undoCommand.undo();
    }
}
