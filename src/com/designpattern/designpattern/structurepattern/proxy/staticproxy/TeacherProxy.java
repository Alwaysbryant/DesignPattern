package com.designpattern.designpattern.structurepattern.proxy.staticproxy;

/**
 * Created by 62691
 * on 2022/1/19 16:45
 *
 * @author swaggyw
 */
public class TeacherProxy implements Teacher{
    private SickTeacher sickTeacher;

    public TeacherProxy(SickTeacher sickTeacher) {
        this.sickTeacher = sickTeacher;
    }

    @Override
    public void teach() {
        sickTeacher.teach();
    }
}
