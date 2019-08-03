package io.choerodon.todo.infra.mapper;

import io.choerodon.mybatis.common.Mapper;
import io.choerodon.todo.infra.dto.ProjectDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMapper extends Mapper<ProjectDTO> {
}
