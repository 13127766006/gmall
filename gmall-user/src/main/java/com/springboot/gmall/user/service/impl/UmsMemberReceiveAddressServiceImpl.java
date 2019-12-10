package com.springboot.gmall.user.service.impl;
import com.springboot.gmall.service.UmsMemberReceiveAddressService;
import com.springboot.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.springboot.gmall.pojo.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId) {
        //UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        //umsMemberReceiveAddress.setMemberId(memberId);
        //List<UmsMemberReceiveAddress> memberReceiveAddress;
        //memberReceiveAddress = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        //System.out.println(memberId);
        criteria.andEqualTo("memberId",Long.valueOf(1L));
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
