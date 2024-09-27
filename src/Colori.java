public class Colori {
    public static final Colori ANSI_Reset = new Colori("\u001B[0m");
    public static final Colori ANSI_BLACK = new Colori("\u001B[30m");
    public static final Colori ANSI_RED = new Colori("\u001B[31m");
    public static final Colori ANSI_GREEN = new Colori("\u001B[32m");
    public static final Colori ANSI_BLUE = new Colori("\u001B[34m");
    private final String ansi_code;
    public Colori(String ansi_code){
        this.ansi_code=ansi_code;
    }

    @Override
    public String toString() {
        return ansi_code;
    }

    public String colora(String s){
        return String.format("%s%s%s",ansi_code, s, ANSI_Reset);
    }

    public void print(String s){
        System.out.print(colora(s));
    }

    public String hilight(String s,String str){
        return s.replaceAll(str,colora(str));
    }

}
