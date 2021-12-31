package com.designpattern.principle.dependenceinversion.dependenceinversion01;

/**
 * Created by 62691
 * on 2021/12/31 14:42
 *
 * 有一场景： 有一个人需要接收别人发过来的信息，如果此时该人收到的是电子邮件信息。
 * Person => 表示该人； Email => 表示电子邮件
 * 得到的输出内容为： "email消息已发送..."
 * 可以实现该功能，receive()方法依赖于Email类，但是如果某一天这个人需要接受的消息是 微信又或者是QQ呢？
 * 那么可能需要重新写一个方法，这样显然不符合依赖倒转原则，依赖倒转原则需要面向接口编程，细节依赖于接口或抽象
 * 改进 @{DependenceInversion.class}
 */
public class DependenceInversionTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 用来发送邮件信息
 */
class Email {
    public String send() {
        return "email消息已发送...";
    }
}


/**
 * 接收消息的人
 */
class Person {

    /**
     * 接收电子邮件消息
     * @param email 电子邮件信息
     */
    public void receive(Email email) {
        String message = email.send();
        System.out.println(message);
    }

}
