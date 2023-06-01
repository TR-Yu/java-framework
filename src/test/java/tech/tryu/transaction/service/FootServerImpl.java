package tech.tryu.transaction.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class FootServerImpl implements IFootServer{
    /**
     * 在同一个事务中执行以下两个操作：
     * 1. 先查询出fooName为fooName的记录
     * 2. 然后更新barName为barName
     */
    @Override
    @Transactional(rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void handleFoot() {

    }
}
