package com.xiaojian.mall.service;

import com.xiaojian.mall.model.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
