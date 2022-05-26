package OtusHashMap;

import java.util.Objects;

public class Account {
    String account;
    String id;

    @Override
    public String toString() {
        return "Счет клиента" + getId() + " " + '\'' + account + '\'';
    }

    public Account(String account, String id) {
        this.account = account;
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return Objects.equals(account, account1.account) && Objects.equals(id, account1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, id);
    }
}


