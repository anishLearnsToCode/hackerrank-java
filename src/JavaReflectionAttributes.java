// https://www.hackerrank.com/challenges/java-reflection-attributes/problem

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    private static class Student {
        public void getName() {}
        public void setName() {}
        private void setAge() {}
    }
}
