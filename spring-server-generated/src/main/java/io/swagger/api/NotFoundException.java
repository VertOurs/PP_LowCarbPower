package io.swagger.api;

import javax.annotation.Generated;

@Generated(
        value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-16T12:39:15.018Z[GMT]")
public class NotFoundException extends ApiException {

    private int code;

    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
