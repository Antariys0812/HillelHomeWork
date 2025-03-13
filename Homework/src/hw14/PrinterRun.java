package hw14;

public class PrinterRun {

    public static void main(String[] args){
        Pprinter ii1 = new Pprinter();
        ii1.print();

        Pprinter ii2 = new Pprinter();
        ii2.msg.setSender("");
        ii2.print();

        Pprinter ii3 = new Pprinter();
        ii3.msg.setSender("jj");
        ii3.print();

        Pprinter ii4 = new Pprinter();
        ii4.msg.setText("jj");
        ii4.print();

        Pprinter ii5 = new Pprinter();
        ii5.msg.setSender("");
        ii5.msg.setText("jj");
        ii5.print();

        Pprinter ii6 = new Pprinter();
        ii6.msg.setSender("jj");
        ii6.msg.setText("jj");
        ii6.print();

    }
}
