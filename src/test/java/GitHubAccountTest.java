import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;
    private GitHubAccount gitHubAccount1;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Lauren", "week 11", AccountType.FREE);
//        gitHubAccount1 = new GitHubAccount();
    }

    @Test
    public void getGitHubUsername(){
    Assert.assertEquals("Lauren", gitHubAccount.getUsername());
    }

    @Test
    public void getGitHubName(){
        assertSame("week 11", gitHubAccount.getName());
    }

    @Test
    public void getAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    
}
