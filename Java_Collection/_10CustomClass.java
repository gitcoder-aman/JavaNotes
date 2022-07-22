package com.Java_Collection;

import java.util.Objects;

public class _10CustomClass implements Comparable<_10CustomClass> {

    String name;
    int rollNo;

    public _10CustomClass(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override  // alt + insert
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _10CustomClass that = (_10CustomClass) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(_10CustomClass that) {
        return this.rollNo - that.rollNo;
      //  return this.name.compareTo((that.name));
    }
}