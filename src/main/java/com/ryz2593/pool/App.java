package com.ryz2593.pool;

import java.util.concurrent.TimeUnit;

/**
 * @author ryz2593
 * @date 2019/4/24
 * @desc
 */
public class App {
    public static void main(String[] args) {
        //创建连接池
        DataSourcePool dataSourcePool = new DataSourcePoolImpl();

        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    PooledConnection dataSource = dataSourcePool.getDataSource();
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dataSource.releaseConnection();
                }
            }.start();
        }
    }
}
