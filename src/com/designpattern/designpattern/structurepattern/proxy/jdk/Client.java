package com.designpattern.designpattern.structurepattern.proxy.jdk;


/**
 * Created by 62691
 * on 2022/1/19 17:08
 *
 * @author swaggyw
 */
public class Client {
    public static void main(String[] args) {
        SickTeacher sickTeacher = new SickTeacher();
        Teacher instance = (Teacher) new TeacherProxy().getInstance(sickTeacher);
        instance.teach();
    }
}
