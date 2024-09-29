package ositranoffice365.ositran_office365_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class User {

    @GetMapping("list")
    public String list() {  return "Lista de usuarios"; }
}
