package io.choerodon.todo.infra.mapper;

import io.choerodon.mybatis.common.Mapper;
import io.choerodon.todo.infra.dto.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends Mapper<UserDTO> {
}
