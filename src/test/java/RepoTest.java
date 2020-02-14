import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class RepoTest {

    private Repo repo;
    private Commit commit;
    private Commit commit1;
    private Commit commit2;
    private Commit commit3;

    @Before
    public void before(){
        repo = new Repo("Lab","Java arrays", "private");
        commit1 = new Commit("setup", "AB12");
        commit2 = new Commit("classes added", "BC23");
        commit3 = new Commit("setup", "DE45");
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
        assertEquals("private", repo.getRepoType());
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
    public void getCommitById(){
        repo.getCommitById(commit1);
        assertEquals("AB12", );
    }





}
