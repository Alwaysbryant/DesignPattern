package com.designpattern.principle.openclose.openclose02;

import java.awt.*;

/**
 * Created by 62691
 * on 2021/12/31 17:23
 *
 * 将Graph作为一个抽象类，并定义抽象方法，由各个图形类来实现即可
 */
public class OpenClose {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.paint(new Square());
        graphEditor.paint(new Circle());
        graphEditor.paint(new Triangle());
    }
}

class GraphEditor {
    public void paint(Graph s) {
        s.paint();
    }
}

abstract class Graph {
    public abstract void paint();
}

class Square extends Graph {

    @Override
    public void paint() {
        System.out.println("绘制正方形...");
    }
}

class Circle extends Graph {

    @Override
    public void paint() {
        System.out.println("绘制圆形...");
    }
}

class Triangle extends Graph {

    @Override
    public void paint() {
        System.out.println("绘制三角形...");
    }
}
