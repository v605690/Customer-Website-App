package com.crus.customerWebsite.controllers;

import com.crus.customerWebsite.models.Customer;
import com.crus.customerWebsite.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/")
    public String ViewHomePage(Model model) {
        final List<Customer> customerList = customerService.getAllCustomers();

        model.addAttribute("customerList", customerList);

        return "index";
    }

}
