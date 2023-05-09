interface Tourist {

    int budget = 0;

    void visit();
    
    void visit(Boracay boracay);

    void visit (Cebu cebu);

    void visit (Ilocos ilocos);

    void visit (Davao davao);

    void visit (Bicol bicol);

    void visit (Batanes batanes);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}