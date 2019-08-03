package io.choerodon.todo.app.service;

import io.choerodon.todo.infra.dto.OrganizationDTO;
import io.choerodon.todo.infra.dto.ProjectDTO;
import io.choerodon.todo.infra.dto.UserDTO;

import java.util.List;

public interface OrganizationService {
    int insertOrganization(Long organization_id);
    int insertUser(Long organization_id,Long id);
    List<ProjectDTO> getUser(int page, int size);
}
