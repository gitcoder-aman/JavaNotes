package com.Java_Collection;

import java.util.Objects;

// create custom class
public class _7PartStudent {
    String name;
    int rollNo;

    public _7PartStudent(String name, int rollNo){
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
        _7PartStudent that = (_7PartStudent) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
