import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class RepoTest {

    private Repo repo;
    private Repo repo1;
    private Commit commit;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;

    @Before
    public void before(){
        repo = new Repo("Lab","Java arrays", RepoType.PRIVATE);
        repo1 = new Repo("HW","Ruby mvp", RepoType.PUBLIC);
        commit1 = new Commit("setup", "AB12");
        commit2 = new Commit("classes added", "BC23");
        commit3 = new Commit("setup", "DE45");

//        repo.addCommit(commit1);
//        repo.addCommit(commit2);
    }

    @Test
    public void canGetName(){
        assertEquals("Lab", repo.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Java arrays", repo.getDescription());
    }

    @Test
    public void canGetRepoType(){
        assertEquals(RepoType.PRIVATE, repo.getRepoType());
        assertEquals(RepoType.PUBLIC, repo1.getRepoType());
    }

    @Test
    public void commitsStartsAtZero(){
        assertEquals(0, repo.getCommits());
    }

    @Test
    public void addCommitToRepo(){
        repo.addCommit(commit1);
        assertEquals(1, repo.getCommits());
    }

    @Test
    public void findCommitById(){
        repo.addCommit(commit1);
        repo.addCommit(commit2);
        Commit foundCommit = repo.findCommitById("AB12");
        assertEquals(commit1,foundCommit);
    }


}
