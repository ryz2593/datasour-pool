package com.ryz2593.pool;

/**
 * @author ryz2593
 * @date 2019/4/24
 * @desc
 */
public interface DataSourcePool {
    PooledConnection getDataSource();
}
