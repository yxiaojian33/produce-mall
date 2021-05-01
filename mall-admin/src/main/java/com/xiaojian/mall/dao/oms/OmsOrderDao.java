package com.xiaojian.mall.dao.oms;

import com.xiaojian.mall.dto.oms.OmsOrderDeliveryParam;
import com.xiaojian.mall.dto.oms.OmsOrderDetail;
import com.xiaojian.mall.dto.oms.OmsOrderQueryParam;
import com.xiaojian.mall.dto.oms.OrderDateRecord;
import com.xiaojian.mall.model.OmsOrder;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 订单自定义查询Dao
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);

    List<OrderDateRecord> getRecordBetweenDate(@Param("start")Date start , @Param("end") Date end);
}
