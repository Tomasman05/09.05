// asd
public class Cibbany extends Allat{
    String weapon = "kés";
    public void narkozik(){
        System.out.println(nevLekeres()+": "+"Kristály minden van nálam");
    }
    public void tarhal(int apro){
        System.out.println("Szoszi teso van egy kis apród ?");
        ennyimvan(apro);
        tarhalas(apro);
    }
    public void tarhalas(int apro){
        if (apro < 500){
            System.out.println("Az kevés !?!?! Behelyezem a "+weapon+"t a hasadba csoro. Haresz muro kare.");
        }
        else{
            System.out.println("Köszi tesomsz, Devla áldjon meg.");
        }
    }
}
