package com.pinyougou.sellergoods.service.impl;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import java.util.List;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BrandServiceImpl  implements BrandService {

@Autowired
private TbBrandMapper brandMapper;
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
