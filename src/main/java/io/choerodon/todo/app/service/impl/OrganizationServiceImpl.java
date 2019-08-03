package io.choerodon.todo.app.service.impl;

import com.github.pagehelper.PageHelper;
import io.choerodon.todo.app.service.OrganizationService;
import io.choerodon.todo.infra.dto.OrganizationDTO;
import io.choerodon.todo.infra.dto.ProjectDTO;
import io.choerodon.todo.infra.dto.UserDTO;
import io.choerodon.todo.infra.feign.OrganizationFeginClient;
import io.choerodon.todo.infra.mapper.OrganizationMapper;
import io.choerodon.todo.infra.mapper.ProjectMapper;
import io.choerodon.todo.infra.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private OrganizationFeginClient organizationFeginClient;
    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertOrganization(Long organization_id) {
        OrganizationDTO organizationDTO = organizationFeginClient.findOrganizationById(organization_id);
        List<ProjectDTO> lists = organizationDTO.getProjects();
        if(lists.size()!=0){
            for(ProjectDTO projectDTO:lists){
                projectMapper.insert(projectDTO);
            }
        }
        return organizationMapper.insert(organizationDTO);
    }

    @Override
    public int insertUser(Long organization_id,Long id) {
        return userMapper.insert(organizationFeginClient.findUserById(organization_id,id));
    }

    @Override
    public List<ProjectDTO> getUser(int page, int size) {
        PageHelper.startPage(page,size);
        return projectMapper.selectAll();
    }
}
