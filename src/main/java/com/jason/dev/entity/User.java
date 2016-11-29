package com.jason.dev.entity;

/**
 * Created by Jason.yu on 2016/11/28.
 */
public class User
{
    private int user_id;

    private String user_name;

    private int user_age;

    private int create_time;

    public int getUser_id()
    {
        return user_id;
    }

    public void setUser_id(int user_id)
    {
        this.user_id = user_id;
    }

    public String getUser_name()
    {
        return user_name;
    }

    public void setUser_name(String user_name)
    {
        this.user_name = user_name;
    }

    public int getUser_age()
    {
        return user_age;
    }

    public void setUser_age(int user_age)
    {
        this.user_age = user_age;
    }

    public int getCreate_time()
    {
        return create_time;
    }

    public void setCreate_time(int create_time)
    {
        this.create_time = create_time;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_age=" + user_age +
                ", create_time=" + create_time +
                '}';
    }
}
