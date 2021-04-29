package com.xiaojian.mall.service.cms.impl;

import com.xiaojian.mall.mapper.CmsPrefrenceAreaMapper;
import com.xiaojian.mall.model.CmsPrefrenceArea;
import com.xiaojian.mall.model.CmsPrefrenceAreaExample;
import com.xiaojian.mall.service.cms.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
