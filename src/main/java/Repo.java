import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();

    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepoType getRepoType() {
        return repoType;
    }

    public int getCommits() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

}

//
//