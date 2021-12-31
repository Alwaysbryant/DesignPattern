package com.designpattern.principle.demeter.demeter01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 62691
 * on 2021/12/31 18:09
 *
 * 迪米特原则： 即只和直接朋友通信，一个类会和其他类发生耦合，当这两个类为直接朋友则遵循迪米特原则
 * 直接朋友： 即这个被依赖类出现在类中的成员变量，方法参数，方法返回值时，即为直接朋友
 * 并且，一个类的依赖关系不应该向外暴露，遵循最少知道原则、
 * 场景： 学校管理部门需要输出学院员工和学校总部员工的信息，PS:以id来代替
 * 根据输出结果来看，功能已经实现，但是CollegeEmp作为局部变量出现在方法体内，违背了迪米特原则。
 * 因此需要改进， {@Demeter.java}
 */
public class DemeterTest {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();

        schoolManager.printEmps(new CollegeManager());
    }
}

//学院员工类
class CollegeEmp {
    private int id;

    public CollegeEmp(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

//学校总部员工类
class SchoolEmp {
    private int id;

    public SchoolEmp(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

//学院管理类
class CollegeManager {

    public List<CollegeEmp> getCollegeEmps() {
        ArrayList<CollegeEmp> emps = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            emps.add(new CollegeEmp(i));
        }
        return emps;
    }
}

//学校总部管理类
class SchoolManager {

    public List<SchoolEmp> getSchoolEmps() {
        ArrayList<SchoolEmp> schoolEmps = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            schoolEmps.add(new SchoolEmp(i));
        }
        return schoolEmps;
    }

    //输出学院员工和学校总部员工
    public void printEmps(CollegeManager collegeManager) {
        //得到学院员工
        List<CollegeEmp> collegeEmps = collegeManager.getCollegeEmps();
        //遍历学院员工
        for (CollegeEmp emp: collegeEmps) {
            System.out.println("学院员工: " + emp.getId());
        }

        //得到学校员工
        List<SchoolEmp> schoolEmps = this.getSchoolEmps();
        for (SchoolEmp emp: schoolEmps) {
            System.out.println("学校员工: " + emp.getId());
        }
    }
}
