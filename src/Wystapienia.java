public class Wystapienia {
    int liczba;
    int wystapienie;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public Wystapienia(int liczba, int wystapienie) {
        this.liczba = liczba;
        this.wystapienie = wystapienie;
    }

    public int getWystapienie() {
        return wystapienie;
    }

    public void setWystapienie(int wystapienie) {
        this.wystapienie = wystapienie;
    }


    public Wystapienia() {
    }

    @Override
    public String toString(){

        return this.liczba+" – liczba wystąpień: "+ this.wystapienie;
    }
}
