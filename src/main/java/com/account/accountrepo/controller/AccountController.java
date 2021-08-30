package com.account.accountrepo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class AccountController {

    @GetMapping("/users")
    public List<String> getUsers() {
        System.out.println("Get USER");
        return null;
    }

    @PostMapping("/admin/update")
    @PreAuthorize("ADMIN_ROLE")
    public void updateUsers(String user) {
        System.out.println("Update Admin user");
    }
}
