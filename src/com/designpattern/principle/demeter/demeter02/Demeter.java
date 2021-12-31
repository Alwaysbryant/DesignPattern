package com.designpattern.principle.demeter.demeter02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 62691
 * on 2021/12/31 18:48
 * 为了让类与类的依赖变成直接朋友，
 * 以及一个类对自己的依赖关系知道的越少越好，
 * 所以在获取学院员工的时候，
 * 应该直接调用学院管理者的方法，
 * 而不是将业务逻辑直接暴露在依赖的类的方法中
 */
public class Demeter {
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

    //输出学院员工信息
    public void printCollegeEmps() {
        List<CollegeEmp> collegeEmps = this.getCollegeEmps();
        for(CollegeEmp emp: collegeEmps) {
            System.out.println("学院员工: " + emp.getId());
        }
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
        collegeManager.printCollegeEmps();

        //得到学校员工
        List<SchoolEmp> schoolEmps = this.getSchoolEmps();
        for (SchoolEmp emp: schoolEmps) {
            System.out.println("学校员工: " + emp.getId());
        }
    }
}
