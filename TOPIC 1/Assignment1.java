class Assignment1 { 
  
    static int noOfObjects = 0;  
    { 
        noOfObjects += 1; 
}
    public Assignment1() 
    { 
    } 
    public Assignment1(int n) 
    { 
    } 
    public Assignment1(String s) 
    { 
    } 
  
    public static void main(String args[]) 
    { 
        Assignment1 t1 = new Assignment1(); 
        Assignment1 t2 = new Assignment1(50); 
        Assignment1 t3 = new Assignment1("G0t0"); 
        System.out.println(Assignment1.noOfObjects); 
    } 
} 