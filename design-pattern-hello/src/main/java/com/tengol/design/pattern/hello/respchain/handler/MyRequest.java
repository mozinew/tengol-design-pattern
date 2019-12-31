package com.tengol.design.pattern.hello.respchain.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 要处理的请求
 *
 * @author dongrui
 * @date 2019/12/31 12:57
 */
@Setter
@Getter
@AllArgsConstructor
public class MyRequest {
    private String name;
    private int type;
}
