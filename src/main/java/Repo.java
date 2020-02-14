import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private String repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, String repoType, ArrayList<Commit>()){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getRepoType(){
        return this.repoType;
    }

    public ArrayList<Commit> getCommits(){
        return this.commits;
    }
}
