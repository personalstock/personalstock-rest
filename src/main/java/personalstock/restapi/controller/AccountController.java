package personalstock.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personalstock.restapi.entity.Account;
import personalstock.restapi.service.AccountService;

import java.util.Collection;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/api/account")
    public Collection<Account> addAccount() {
        return accountService.getAllAccounts();
    }

    @PostMapping("/api/account")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @PutMapping("/api/account")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/api/account")
    public void deleteAccount(@RequestBody Account account) {
        accountService.deleteAccount(account);
    }

    @PostMapping("/api/account/login")
    public Account login(@RequestParam("login") String login, @RequestParam("password") String password) {
        return accountService.getAccountFullDataByLoginAndPassword(login, password);
    }

}
