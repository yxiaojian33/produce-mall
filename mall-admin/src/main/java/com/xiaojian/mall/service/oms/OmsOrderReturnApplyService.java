package com.xiaojian.mall.service.oms;

import com.xiaojian.mall.dto.OmsOrderReturnApplyResult;
import com.xiaojian.mall.dto.OmsReturnApplyQueryParam;
import com.xiaojian.mall.dto.OmsUpdateStatusParam;
import com.xiaojian.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
