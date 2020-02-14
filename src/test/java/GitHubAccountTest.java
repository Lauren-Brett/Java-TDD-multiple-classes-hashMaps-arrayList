import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;
    private GitHubAccount gitHubAccount1;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Lauren", "week 11", AccountType.FREE);
        gitHubAccount1 = new GitHubAccount("Chloe", "week 3", AccountType.PRO);
    }

    @Test
    public void getGitHubUsername(){
    Assert.assertEquals("Lauren", gitHubAccount.getUsername());
    }

    @Test
    public void canGetGitHubName(){
        assertSame("week 11", gitHubAccount.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canAddToRepositories(){
        Repo repo = new Repo("Lauren","java", RepoType.PUBLIC);
        gitHubAccount.addRepo(repo);
        assertEquals(1, gitHubAccount.getNumberOfRepos());
    }

    @Test
    public void canUpgradeAccpuntType(){
        gitHubAccount.upgradeAccountType();
        assertEquals(AccountType.PRO, gitHubAccount.getAccountType());
    }

    @Test
    public void canDownGradeAccountType(){
        gitHubAccount.downgradeAccountType();
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canGetReposByName(){
        Repo repo = new Repo("Lauren","java", RepoType.PUBLIC);
        Repo repo2 = new Repo("Polly","java", RepoType.PRIVATE);
        gitHubAccount.addRepo(repo);
        gitHubAccount.addRepo(repo2);
        assertEquals(repo2, gitHubAccount.getAccountByName("Polly"));
    }




}
