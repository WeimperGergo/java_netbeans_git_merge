package pkg0930gitbranch;

public class GitBranch {

    
    public static void main(String[] args) {
        GitBranch obj = new GitBranch();
        int i = obj.fv();
    }

    private int fv() {
        System.out.println("Nem statikus");
        return 0;
    }
    
    public void eljaras(){
        
    }
}
