package io.choerodon.todo.api.controller.v1;

import io.choerodon.base.annotation.Permission;
import io.choerodon.base.constant.PageConstant;
import io.choerodon.base.enums.ResourceType;
import io.choerodon.todo.app.service.OrganizationService;
import io.choerodon.todo.infra.dto.ProjectDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/organizations")
public class OrganizationController {
    private OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }
    @PostMapping("/{organization_id}")
    //@Permission(permissionPublic = true)
    @Permission(type = ResourceType.SITE)
    @ApiOperation(value = "插入组织详情")
    public ResponseEntity<String> insertOrganization(@PathVariable Long organization_id) {
        return new ResponseEntity<>("insert row "+organizationService.insertOrganization(organization_id), HttpStatus.OK);
    }
    @PostMapping("/{organization_id}/users/{id}")
    //@Permission(permissionPublic = true)
    @Permission(type = ResourceType.SITE)
    @ApiOperation(value = "插入用户")
    public ResponseEntity<String> insertUser(@PathVariable Long organization_id,@PathVariable Long id) {
        return new ResponseEntity<>("insert row "+organizationService.insertUser(organization_id,id), HttpStatus.OK);
    }

    @GetMapping
    //@Permission(permissionPublic = true)
    @Permission(type = ResourceType.SITE)
    @ApiOperation(value = "分页查询项目")
    public ResponseEntity<List<ProjectDTO>> getProject(@RequestParam(defaultValue = PageConstant.PAGE, required = false) final int page,
                                           @RequestParam(defaultValue = PageConstant.SIZE, required = false) final int size) {
        return new ResponseEntity<>(organizationService.getUser(page,size), HttpStatus.OK);
    }
}
