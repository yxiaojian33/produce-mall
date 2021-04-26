package com.xiaojian.mall.portal.service;

import com.xiaojian.mall.common.api.CommonPage;
import com.xiaojian.mall.model.PmsBrand;
import com.xiaojian.mall.model.PmsProduct;

import java.util.List;

/**
 * 前台品牌管理Service
 * Created by xiaojian on 2020/5/15.
 */
public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
