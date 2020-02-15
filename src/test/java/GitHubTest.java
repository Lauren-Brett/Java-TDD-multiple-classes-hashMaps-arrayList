import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubTest {

    private GitHub gitHubs;
    private GitHubAccount gitHubAccount;
    private GitHubAccount gitHubAccount1;
    private GitHubAccount gitHubAccount2;
    private GitHubAccount gitHubAccount3;

    @Before
    public void before(){
        gitHubs = new GitHub();
        gitHubs.addGitHubAccount(gitHubAccount);
        gitHubAccount = new GitHubAccount("lcb", "Lauren", AccountType.FREE);
        gitHubAccount1 = new GitHubAccount("csb", "Chloe", AccountType.PRO);
        gitHubAccount2 = new GitHubAccount("snb", "Sophie", AccountType.PRO);
        gitHubAccount3 = new GitHubAccount("pld", "Polly", AccountType.PRO);
    }

    @Test
    public void canGetAmountOfGitHubs(){
        assertEquals(1, gitHubs.getGitHubs());
    }






}



//            Arrange: [commit1, commit2, commit3]
//            Act: repo.revert(commit2uniqueId)
//            Assert: Expected = [commit1, commit2]