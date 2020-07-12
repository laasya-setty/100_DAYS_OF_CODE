
enum Laasya{
    LASSI(10),
    SETTY(9),
    LIKI(6);

private int value;
 private Laasya(int value){
     this.value=value;
 }

    public static void main(String args[]){
        for(Laasya l:Laasya.values())
        System.out.println(l+" "+l.value);
    }
    
}
