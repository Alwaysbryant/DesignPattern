package com.designpattern.designpattern.behaviorpattern.command;

/**
 * Created by 62691
 * on 2022/1/26 16:38
 *
 * @author swaggyw
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
