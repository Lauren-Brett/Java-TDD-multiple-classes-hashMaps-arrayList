import com.sun.org.apache.regexp.internal.RE;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;
    private GitHubAccount gitHubAccount1;
    private GitHubAccount gitHubAccount2;
    private GitHubAccount gitHubAccount3;
    private Repo repo1;
    private Repo repo2;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("lcb", "Lauren", AccountType.FREE);
        gitHubAccount1 = new GitHubAccount("csb", "Chloe", AccountType.PRO);
        gitHubAccount2 = new GitHubAccount("snb", "Sophie", AccountType.PRO);
        gitHubAccount3 = new GitHubAccount("pld", "Polly", AccountType.PRO);
        repo1 = new Repo("Java", "Wk11", RepoType.PRIVATE);
        repo2 = new Repo("JS", "Wk6", RepoType.PUBLIC);
        gitHubAccount.addRepo(repo1);
        gitHubAccount.addRepo(repo2);


    }


    @Test
    public void getGitHubUsername(){
    Assert.assertEquals("lcb", gitHubAccount.getUsername());
    }

    @Test
    public void canGetGitHubName(){
        assertSame("Lauren", gitHubAccount.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canAddToRepositories(){
        gitHubAccount.addRepo(repo1);
        assertEquals(1, gitHubAccount.getNumberOfRepos());
    }

    @Test
    public void canUpgradeAccountType(){
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
        gitHubAccount.addRepo(repo1);
        gitHubAccount.addRepo(repo2);
        assertEquals(repo1, gitHubAccount.getAccountByName("Java"));
//        assertEquals(true, gitHubAccount.getAccountByName("Java"));
    }

}
