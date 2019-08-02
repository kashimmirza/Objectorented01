
public class Speeddown extends Speedybicycle {
          protected int decrement;
         Speeddown(String colour, int ring, int paddle,int increment ,int decrement){
        	  super(colour, ring, paddle,increment);
        	  this.decrement=decrement;
        	 
         }
         public int getdownspeed() {
        	 int speedde=0;
        	 return speedde-=decrement;
         }
}


