package com.company;

import java.util.Objects;

public final class Teacher
{
    final String name;
    final String post;

    public Teacher(String name, String post)
    {
        this.name = name;
        this.post = post;
    }
    public String getName()
    {
        return name;
    }
    public String getPost()
    {
        return post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) &&
                Objects.equals(post, teacher.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, post);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}