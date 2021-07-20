package com.winemall.mall.service.impl;

<<<<<<< HEAD
import com.winemall.mall.entity.User;
import com.winemall.mall.mapper.UserMapper;
import com.winemall.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/21
 * @Description: This is a part of the training project
 */
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public boolean register(String phone, String password) {
        try{
            mapper.insertUser(phone,password);
            mapper.insertProfile(phone);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean login(String phone, String password) {
        User user=mapper.login(phone,password);
        return user!=null;
    }

    @Override
    public User getUserInfo(String phone) {
        return mapper.getUserAll(phone);
    }

    @Override
    public boolean changeInfo(User user) {
        try{
            mapper.setProfile(user);
        }catch (Exception e){
            return false;
        }
        return true;
=======
import com.winemall.mall.mapper.TbBasicMapper;
import com.winemall.mall.mapper.TbUserMapper;
import com.winemall.mall.pojo.TbBasic;
import com.winemall.mall.pojo.TbUser;
import com.winemall.mall.pojo.TbUserExample;
import com.winemall.mall.pojo.User;
import com.winemall.mall.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    //添加mapper接口方法数据库
    @Autowired
    private TbUserMapper userMapper;
    //自动装配一个操作基本信息数据的mapper
    @Autowired
    private TbBasicMapper basicMapper;

    @Override
    public User findUserById(int id) {
        return new User("admin","admin-hello");
    }

    @Override
    public TbUser findById(String phone) {
        return userMapper.selectByPrimaryKey(phone);
    }

    @Override
    //添加事务注解
    @Transactional
    public boolean register(TbUser user) {
        //增加用户
        int insert_user = userMapper.insert(user);
        //增加基本信息
        TbBasic tbBasic = new TbBasic();
        tbBasic.setPhone(user.getPhone());
        int insert_basic = basicMapper.insert(tbBasic);
        if (insert_user == 1 && insert_basic == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean login(TbUser user) {
        //创建一个查询条件
        TbUserExample userExample = new TbUserExample();
        //通过传递过来的user对象中的数据设置查询条件
        userExample.createCriteria().
                andPhoneEqualTo(user.getPhone()).
                andPasswordEqualTo(user.getPassword());
        //通过查询条件查询数据
        List<TbUser> tbUsers = userMapper.selectByExample(userExample);
        if (tbUsers.size() == 1){
            return  true;
        }
        return false;
    }

    @Override
    public TbBasic findByPhone(String phone) {
        //调用操作基本信息的mapper接口进行数据操作: 根据手机号码查询基本信息
        TbBasic tbBasic = basicMapper.selectByPrimaryKey(phone);
        return tbBasic;
    }

    @Override
    @Transactional
    public boolean updatePassword(TbUser user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i > 0) {
            return  true;
        }
        return false;
    }

    @Override
    public boolean updateBasic(TbBasic basic) {
        int i = basicMapper.updateByPrimaryKeySelective(basic);
        if (i > 0) {
            return  true;
        }
        return false;
>>>>>>> origin/master
    }
}
