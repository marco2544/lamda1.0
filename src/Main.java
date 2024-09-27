
public class Main {
    public static void main(String[] args) {
        //printTable();
        Colori.ANSI_GREEN.print("questo testo è verde");
        Colori o=new Colori(Colori.ANSI_GREEN.toString());
        System.out.print(o.hilight("\nquesto testo è verde","verde"));
    }

    public static void printTable(){

        for (int i = 0; i < 127; i++) {
            if (i%16==0){

                System.out.printf("\n%04x\t",i);
            }
            System.out.printf("%c",i);
        }
    }
}