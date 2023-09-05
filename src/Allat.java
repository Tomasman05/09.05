// asd
public class Allat {
    private String nev;
    int apro;
    public void nevbeallit(String nev){
        
        if (nev.isEmpty()){
            System.out.println("Hiba, nem adott meg nevet.");
            System.exit(1);
        }
        this.nev = nev;
    }
    public String nevLekeres(){
        return this.nev;
    }
    public void hangotad(String hang){
        System.out.println(nevLekeres()+": "+hang);
    }
    public void ennyimvan(int penz){
        System.out.println(penz+"-Ft van nálam, te kormos szar.");
    }
}
