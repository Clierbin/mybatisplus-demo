package com.gpvip.mybatisplus.mybatisplusdemo.service.impl;

import com.gpvip.mybatisplus.mybatisplusdemo.bean.UserDO;
import com.gpvip.mybatisplus.mybatisplusdemo.mapper.UserMapper;
import com.gpvip.mybatisplus.mybatisplusdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangbin
 * @since 2019-09-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
