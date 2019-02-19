package self.he.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import self.he.pojo.User;

public interface UserMapper {

    User select(User user);
}

