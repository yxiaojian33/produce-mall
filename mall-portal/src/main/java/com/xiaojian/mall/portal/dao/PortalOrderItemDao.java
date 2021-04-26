package com.xiaojian.mall.portal.dao;

import com.xiaojian.mall.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 * Created by xiaojian on 2018/9/3.
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
