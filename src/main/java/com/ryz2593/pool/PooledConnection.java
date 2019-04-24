package com.ryz2593.pool;

import lombok.*;

import java.sql.Connection;

/**
 * @author ryz2593
 * @date 2019/4/24
 * @desc 封装连接池中带有连接状态的类
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PooledConnection {
    //连接对象
    private Connection connection;
    //连接状态
    private boolean state;

    public void releaseConnection() {
        System.out.println("连接释放。。。。");
        this.state = false;
    }

}
