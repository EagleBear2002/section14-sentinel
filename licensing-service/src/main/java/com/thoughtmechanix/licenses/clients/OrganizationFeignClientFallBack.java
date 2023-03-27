package com.thoughtmechanix.licenses.clients;

import com.thoughtmechanix.licenses.model.Organization;
import org.springframework.stereotype.Component;

@Component
public class OrganizationFeignClientFallBack implements OrganizationFeignClient {

    @Override
    public Organization getOrganization(String organizationId) {
        Organization organization = new Organization();
        organization.setContactEmail("taozs@163.com");
        organization.setContactName("taozhaosheng");
        organization.setContactPhone("133123476888");
        organization.setId(organizationId);
        return organization;
    }
}
