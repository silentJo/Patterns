public class ConcreteObserverNbrMots implements Observer{

    @Override
    public void analyserLigne(String ligne) {
        Observer.super.analyserLigne(ligne);
    }

    public void compterMots(String ligne) {
        int nbMots = ligne.split(" ").length;
    }

}
