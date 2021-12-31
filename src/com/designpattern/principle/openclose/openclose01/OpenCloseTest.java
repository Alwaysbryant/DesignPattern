package com.designpattern.principle.openclose.openclose01;

import java.awt.*;

/**
 * Created by 62691
 * on 2021/12/31 17:08
 *
 * 开闭原则： 对扩展开放，对修改关闭。
 * 可以对功能进行扩展，但是使用者不可以对代码进行修改
 *
 * 如下，是可以完成功能的，但是如果现在我要绘制长方形，又或者是三角形，那么所有的代码都需要修改
 * 对于图形编辑器这个类来说，作为使用者修改代码，则违背了开闭原则。
 * 改进 {@OpenClose.java}
 */
public class OpenCloseTest {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.paint(new Square());
        graphEditor.paint(new Circle());
    }
}

/**
 * 图形编辑器
 */
class GraphEditor {
    public void paint(Graph s) {
        if (s.graph_type == 1) {
            System.out.println("绘制正方形...");
        } else if (s.graph_type == 2) {
            System.out.println("绘制圆形...");
        }
    }
}

/**
 * 图形
 */
class Graph {
    int graph_type; //绘制图形的类型
}

/**
 * 绘制正方形
 */
class Square extends Graph {
    Square() {
        graph_type = 1;
    }
}

/**
 * 绘制圆形
 */
class Circle extends Graph {
    Circle() {
        graph_type = 2;
    }
}
