public class App {
    public static void main(String[] args) throws Exception {

    Boracay boracay = new Boracay();
    Cebu cebu = new Cebu();
    Ilocos ilocos = new Ilocos();
    Davao davao = new Davao();
    Bicol bicol = new Bicol();
    Batanes batanes = new Batanes();
    
    Me tourist = new Me();
        
    boracay.accept(tourist);
       System.out.println();
    cebu.accept(tourist);
       System.out.println();
    ilocos.accept(tourist);
       System.out.println();
    davao.accept(tourist);
       System.out.println();
    bicol.accept(tourist);
       System.out.println();
    batanes.accept(tourist);

    }
}