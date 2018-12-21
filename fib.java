import java.util.ArrayList;

class Main {

     
    public static void main(String[] args) {
        System.out.println("Sequencia de Fibonacci!");
        System.out.println(Fibonnaci());
        System.out.println(isFibonnaci(8));
        System.out.println(isFibonnaci(4)); 
    }
    
    public static ArrayList<Integer> Fibonnaci() {
      ArrayList<Integer> seqFib = new ArrayList<Integer>();
      int primeiro = 0;
      int segundo = 1;

      for (int i = 0; i <= 350; i++){
         if(i== (primeiro + segundo)) {        
            primeiro = segundo;
            segundo = i;
            seqFib.add(i);
         }
      }
        return seqFib;
    }
        public static boolean isFibonnaci(int candidato) {
         if(Fibonnaci().contains(candidato)) {        
           System.out.println("É da sequência de Fibonacci : " + candidato);
           return true;
         }
         else{
           System.out.println("Nao é da sequência de Fibonacci : " + candidato);
           return false;
         }
         
    }

}

