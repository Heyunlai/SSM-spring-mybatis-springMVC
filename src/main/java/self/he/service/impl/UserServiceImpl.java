package self.he.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import self.he.mapper.UserMapper;
import self.he.pojo.User;
import self.he.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    //注入Mapper
    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(User user) {
        return userMapper.select(user);
    }
}
