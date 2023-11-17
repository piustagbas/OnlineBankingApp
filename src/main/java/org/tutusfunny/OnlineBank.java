package org.tutusfunny;


import java.util.HashMap;
import java.util.Map;

public class OnlineBank {
    private Map<String, BankAccount> accounts;

    public OnlineBank() {
        this.accounts = new HashMap<>();
    }

    public boolean createAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new BankAccount(accountNumber));
            return true;
        } else {
            return false;
        }
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
