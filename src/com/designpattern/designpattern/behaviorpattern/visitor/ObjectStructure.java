package com.designpattern.designpattern.behaviorpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 62691
 * on 2022/1/28 20:58
 *
 * @author swaggyw
 * 数据结构
 * 数据集
 */
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void show(Action action) {
        for (Person person:
             persons) {
            person.accept(action);
        }
    }
}
