package com.xiaojian.mall.portal;

import com.xiaojian.mall.mapper.OmsCartItemMapper;
import com.xiaojian.mall.model.OmsCartItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallPortalApplicationTests {
    @Autowired
    private OmsCartItemMapper cartItemMapper;
    @Test
    public void contextLoads() {
        OmsCartItem omsCartItem = new OmsCartItem();
        System.out.println(omsCartItem.getId());

        System.out.println(cartItemMapper.insert(omsCartItem));
        System.out.println(omsCartItem.getId());
    }

}
