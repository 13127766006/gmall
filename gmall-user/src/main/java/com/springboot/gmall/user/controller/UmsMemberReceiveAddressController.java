package com.springboot.gmall.user.controller;
import com.springboot.gmall.pojo.UmsMemberReceiveAddress;
import com.springboot.gmall.user.service.impl.UmsMemberReceiveAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class UmsMemberReceiveAddressController {
    @Autowired
    UmsMemberReceiveAddressServiceImpl umsMemberReceiveAddressService;
    @RequestMapping(value ="/hello",produces = "application/json; charset=utf-8")
    public List<UmsMemberReceiveAddress>getUmsMemberReceiveAddress(@RequestParam("memberId") Long memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = umsMemberReceiveAddressService.getUmsMemberReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }
}
