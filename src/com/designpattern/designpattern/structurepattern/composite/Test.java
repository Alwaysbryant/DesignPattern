package com.designpattern.designpattern.structurepattern.composite;


/**
 * Created by 62691
 * on 2022/1/12 17:42
 *
 * @author swaggyw
 */
public class Test {
    public static void main(String[] args) {
        University university = new University("武汉大学");
        College college = new College("机械工程学院");
        College college1 = new College("计算机学院");

        university.add(college);
        university.add(college1);
        college.add(new Department("机械设计制造及其自动化"));
        college.add(new Department("包装"));
        college.add(new Department("工业工程"));
        college.add(new Department("模具"));

        college1.add(new Department("软件工程"));
        college1.add(new Department("人工智能"));
        college1.add(new Department("计算机科学与技术"));
        college1.add(new Department("网络工程"));

        university.print();

    }
}
