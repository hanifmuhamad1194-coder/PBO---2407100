public class BangunDatar {
    // Atribut dengan encapsulation (private)
    private double varA;
    private double varB;
    
    // Constructor 1: 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }
    
    // Constructor 2: 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0; // default value
    }
    
    // Getter dan Setter
    public double getVarA() {
        return varA;
    }
    
    public void setVarA(double varA) {
        this.varA = varA;
    }
    
    public double getVarB() {
        return varB;
    }
    
    public void setVarB(double varB) {
        this.varB = varB;
    }
    
    // Method hitungLuas dengan nilai default 0
    public double hitungLuas() {
        return 0;
    }
    
    // Method tampilkan
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("======================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("======================");
    }
}