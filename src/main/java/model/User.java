package main.java.model;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/7/28 22:40
 **/
public class User {
    public long id;
    public String name;
    public School school;

    public User(long id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }
}
