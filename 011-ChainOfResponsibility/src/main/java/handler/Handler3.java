package handler;

import request.Request;

/**
 * Created by STZHANGJK on 2016/9/5.
 */
public class Handler3 extends Handler{

    public Handler3() {
        super(3);
    }

    @Override
    public void response(Request request) {
        System.out.println(request.getLevel() + " " + request.getMessage());
    }
}
