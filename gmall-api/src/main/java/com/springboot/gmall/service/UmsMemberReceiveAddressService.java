package com.springboot.gmall.service;

import com.springboot.gmall.pojo.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(Long memberId);
}
