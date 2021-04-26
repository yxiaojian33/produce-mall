package com.xiaojian.mall.portal.service;

import com.xiaojian.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by xiaojian on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
