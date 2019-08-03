package io.choerodon.todo.infra.mapper;

import io.choerodon.mybatis.common.Mapper;
import io.choerodon.todo.infra.dto.OrganizationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationMapper extends Mapper<OrganizationDTO> {
}
