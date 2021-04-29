package com.xiaojian.mall.service.oms.impl;

import com.xiaojian.mall.mapper.OmsCompanyAddressMapper;
import com.xiaojian.mall.model.OmsCompanyAddress;
import com.xiaojian.mall.model.OmsCompanyAddressExample;
import com.xiaojian.mall.service.oms.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
