public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare){
            System.out.println("Wala na me budget");
         } else {
                System.out.println("enjoying the summer here in Boracay!!!");
                budget = budget - boracay.airFare;
            }
            checkBudget();
    }

    public void visit(Cebu cebu) { 
            if (budget < cebu.airFare){
                System.out.println("Wala na me budget");
             } else {
                    System.out.println("Enjoying the cold weather here in Baguio!!!");
                    budget = budget - cebu.airFare;
                }
                checkBudget();
    }
    
    public void visit(Ilocos ilocos) {
            if (budget < ilocos.airFare){
                System.out.println("Wala na me budget");
             } else {
                  System.out.println("Enjoying my stay here in Ilocos!!!");
                  budget = budget - ilocos.airFare;
                }
                checkBudget();
    }

    public void visit(Davao davao) {
            if (budget < davao.airFare){
                System.out.println("Wala na me budget");
             } else {
                    System.out.println("Enjoying the Food here in Davao!!!");
                    budget = budget - davao.airFare;
                }
                checkBudget();
    }

    public void visit(Bicol bicol) {
            if (budget < bicol.airFare){
                System.out.println("Wala na me budget");
             } else {
                System.out.println("Enjoying the chocolate hills here in bicol!!!");
                    budget = budget - bicol.airFare;
                }
                checkBudget();
    }

    public void visit(Batanes batanes) {
            if  (budget < batanes.airFare){
                System.out.println("Wala na me budget");
             } else {
                    System.out.println("Enjoying the fresh air here in Batanes!!!");
                    budget = budget - batanes.airFare;
                }
                
                checkBudget();
    } 

  public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}