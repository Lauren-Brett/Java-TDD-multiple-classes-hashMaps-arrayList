public class Commit {

    private String name;
    private String uniqueId;

    public Commit(String name, String uniqueId){
        this.name = name;
        this.uniqueId = uniqueId;
    }

    public String getName(){
        return this.name;
    }

    public String getUniqueId(){
        return this.uniqueId;
    }
}
