import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repo> repositories;
    // String = name, Repo = object

    public GitHubAccount(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new HashMap<String, Repo>();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
