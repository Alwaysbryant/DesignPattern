package com.designpattern.designpattern.behaviorpattern.command;

/**
 * Created by 62691
 * on 2022/1/26 16:43
 *
 * @author swaggyw
 * 空命令。空执行： 用来初始化每个按钮，当调用命令时，什么也不做
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
