public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        maci.nevbeallit("László a medve");
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
        Macska macska = new Macska();
        macska.nevbeallit("Mici");
        macska.hangotad("meow");
        macska.dorombol();
        Cibbany cibbany = new Cibbany();
        cibbany.nevbeallit("Kolompár Armando");
        cibbany.hangotad("szoszi tesó van egy cigid ?");
        cibbany.narkozik();
        Jarokelo jarokelo = new Jarokelo();
        jarokelo.penztarca(250);
        cibbany.tarhal(jarokelo.penztarcaTartalom());
    }
}
