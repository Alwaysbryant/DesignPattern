package com.designpattern.principle.dependenceinversion.dependenceinversion02;

/**
 * Created by 62691
 * on 2021/12/31 14:50
 *
 * 假设现在该人需要接收微信消息，而不是电子邮件，
 * 那么如何改进，根据依赖倒转原则，通过一个接口来实现规范，
 * receive() 方法来依赖于这个接口，而不是类，这样，我们只需要实现微信消息这个类，并实现该接口
 * 这样就可以做到符合依赖倒置原则，并且保证功能实现。
 */
public class DependenceInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeChat());
    }
}

interface IReceiver {

    /**
     * 发送消息
     * @return 发送的消息
     */
    String send();
}

class WeChat implements IReceiver {

    @Override
    public String send() {
        return "WeChat消息已发送....";
    }
}

class Person {
    public void receive(IReceiver message) {
        String info = message.send();
        System.out.println(info);
    }
}