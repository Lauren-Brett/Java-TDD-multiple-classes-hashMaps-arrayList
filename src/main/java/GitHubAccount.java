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
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public int getNumberOfRepos() {
        return this.repositories.size();
    }

    public void addRepo(Repo repo) {
        this.repositories.put(repo.getName(), repo);
    }

    public void upgradeAccountType(){
        this.accountType = AccountType.PRO;
    }

    public void downgradeAccountType() {
        this.accountType = AccountType.FREE;
    }

    public Repo getAccountByName(String string) {
        return this.repositories.get(string);
    }

//    public boolean getAccountByName(String string) {
//        return this.repositories.containsKey(string);
//    }

}
