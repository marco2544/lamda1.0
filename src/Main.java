
public class Main {
    public static void main(String[] args) {
        //printTable();
        //Colori.ANSI_GREEN.print("questo testo è verde");
       // Colori o=new Colori(Colori.ANSI_GREEN.toString());
        //System.out.print(o.hilight("\nquesto testo è verde","verde\n"));
        FileUtil.print("src/FileUtil.java",(s,i)->{
            String row_id=String.format("%4d",i);
            if(i%2==0){
                s=Colori.ANSI_BLUE.colora(s);
            }else {
                s=Colori.ANSI_RED.colora(s);
            }
            s=Colori.ANSI_GREEN.highligh(s,"print");
            System.out.printf("%s...%s\n",Colori.ANSI_GREEN.colora(row_id),s);
        });
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