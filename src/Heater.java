import java.util.Scanner;

class Heater {
    Scanner sc = new Scanner(System.in);
    private int tempActu;
    private int tempTarg;

    public int getTempActu() {
        return tempActu;
    }

    public int getTempTarg() {
        return tempTarg;
    }

    public void setTempActu(int tempActu) {
        this.tempActu = tempActu;
    }

    public void setTempTarg(int tempTarg) {
        this.tempTarg = tempTarg;
    }

    public Heater() {
        System.out.println("Podaj temp aktualna: ");
        setTempActu(sc.nextInt());
        System.out.println("Podaj temp docelowa: ");
        setTempTarg(sc.nextInt());
    }
}
