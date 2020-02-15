
import java.util.ArrayList;

public class GitHub {

    private ArrayList<GitHubAccount> gitHubs;


    public GitHub(){
        this.gitHubs = new ArrayList<GitHubAccount>();
    }

    public int getGitHubs(){
       return this.gitHubs.size();
    }


    public void addGitHubAccount(GitHubAccount gitHubAccount) {
        this.gitHubs.add(gitHubAccount);
    }
}

