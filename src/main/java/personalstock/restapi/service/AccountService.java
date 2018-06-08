package personalstock.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personalstock.restapi.entity.Account;
import personalstock.restapi.repository.AccountRepository;

import java.util.Collection;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Collection<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountFullDataByLoginAndPassword(String login, String password) {
        return accountRepository.getAccountByLoginAndPassword(login, password).orElse(null);
    }

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }

}
