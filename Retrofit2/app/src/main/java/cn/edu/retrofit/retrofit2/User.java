package cn.edu.retrofit.retrofit2;

/**
 * Created by nuts on 2018/11/2.
 */

public class User {
    //{"name":"John","sex":"male","age":22,"is_student":true}
    private int errno;
    private String data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
