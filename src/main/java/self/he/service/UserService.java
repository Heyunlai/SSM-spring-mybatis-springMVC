package self.he.service;

import self.he.pojo.User;

public interface UserService {
    /**
     * 根据user去检查数据库是否存在用户
     * @param user
     * @return
     */

    User get(User user);
}
