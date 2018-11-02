package cn.edu.retrofit.retrofit2;

/**
 * Created by nuts on 2018/11/2.
 */

public class User {
    //{"name":"kewen","age":"24","hobbit":"Doto","hobbit2":"wow"}
    private String name;
    private String age;
    private String hobbit;
    private String hobbit2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    public String getHobbit2() {
        return hobbit2;
    }

    public void setHobbit2(String hobbit2) {
        this.hobbit2 = hobbit2;
    }
}
