package io.choerodon.todo.infra.feign;

import io.choerodon.todo.infra.dto.OrganizationDTO;
import io.choerodon.todo.infra.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("iam-service")
public interface OrganizationFeginClient {
    @RequestMapping(value = "/v1/organizations/{organization_id}", method = RequestMethod.GET)
    OrganizationDTO findOrganizationById(@PathVariable("organization_id") Long organization_id);
    @RequestMapping(value = "/v1/organizations/{organization_id}/users/{id}", method = RequestMethod.GET)
    UserDTO findUserById(@PathVariable("organization_id") Long organization_id, @PathVariable("id") Long id);
}
