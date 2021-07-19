package com.winemall.mall;

import com.winemall.mall.entity.Address;
import com.winemall.mall.mapper.AddressMapper;
import org.apache.commons.math3.analysis.function.Add;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 */
@SpringBootTest(classes={AddressMapperApplication.class})
@RunWith(SpringRunner.class)
public class AddressMapperTest {
    @Autowired
    private AddressMapper mapper;
    @Test
    public void test(){
        for(Address a:mapper.getAllAddress("12345678919")){
            System.out.println(a.toJson(true));
        }
        Address address=new Address(null,"JAVATEST1","TESTP","TESTC",
                "TESTS","TESTA","12345678919",0);
        mapper.insertAddress(address);
        Address address1=new Address(null,"JAVATEST2","TESTP","TESTC",
                "TESTS","TESTA","12345678919",0);
        mapper.insertAddress(address1);
        mapper.insertAddress(new Address(null,"JAVATEST3","TESTP","TESTC",
                "TESTS","TESTA","12345678919",0));
        mapper.insertAddress(new Address(null,"JAVATEST4","TESTP","TESTC",
                "TESTS","TESTA","12345678919",0));


        System.out.println(address.getAddr_id());
        mapper.delAddress(address.getAddr_id().intValue()+2);
        System.out.println("deleted:\n");
        for(Address a:mapper.getAllAddress("12345678919")){
            System.out.println(a.toJson(true));
        }
        Address address2=new Address(address.getAddr_id(),"JAVA-----TEST","TESTP","TESTC",
                "TESTS","TESTA","12345678919",0);
        mapper.updateAddress(address2);
        System.out.println("updated:\n");
        for(Address a:mapper.getAllAddress("12345678919")){
            System.out.println(a.toJson(true));
        }
        System.out.println("set default:\n");
        mapper.clearDefault(address1.getAddr_id().intValue(),address1.getPhone());
        mapper.setDefault(address1.getAddr_id().intValue(),address1.getPhone());
        for(Address a:mapper.getAllAddress("12345678919")){
            System.out.println(a.toJson(true));
        }
        System.out.println(mapper.getDefault("12345678919").toJson(true));


    }
}
