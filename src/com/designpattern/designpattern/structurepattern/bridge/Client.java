package com.designpattern.designpattern.structurepattern.bridge;

/**
 * Created by 62691
 * on 2022/1/9 15:48
 *
 * @author swaggyw
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Apple());
        foldedPhone.call();
    }
}
