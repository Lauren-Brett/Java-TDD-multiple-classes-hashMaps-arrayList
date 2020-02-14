import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("MVP", "AB12");
    }

    @Test
    public void getNameOfCommit(){
        assertEquals("MVP", commit.getName());
    }

    @Test
    public void getUniqueIdOfCommit(){
        assertEquals("AB12", commit.getUniqueId());
    }
}
