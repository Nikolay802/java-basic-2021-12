package OtusHashMap;

import java.util.HashMap;
import java.util.List;

public class Bank {
    HashMap<String, Client> clientHashMap = new HashMap<>();
    HashMap<String, List<Account>> accountHashMap = new HashMap<>();

    public void bank() {
        Client client1 = new Client("Михаил", "42", "1");
        Client client2 = new Client("Евгений", "50", "2");
        Client client3 = new Client("Олег", "24", "3");

        Account account1 = new Account("111", "1");
        Account account2 = new Account("222", "1");
        Account account3 = new Account("444", "1");
        Account account4 = new Account("777", "2");
        Account account5 = new Account("123", "3");

        List<Account> accountList = List.of(account1, account2, account3);
        List<Account> accountList1 = List.of(account4);
        List<Account> accountList2 = List.of(account5);

        clientHashMap.put(account1.getId(), client1);
        clientHashMap.put(account4.getId(), client2);
        clientHashMap.put(account5.getId(), client3);

        accountHashMap.put(client1.getId(), accountList);
        accountHashMap.put(client2.getId(), accountList1);
        accountHashMap.put(client3.getId(), accountList2);

    }

    public void findClient(String account) {
        System.out.println(clientHashMap.get(account));
    }

    public void findAccount(String client) {
        System.out.println(accountHashMap.get(client));

    }
}



