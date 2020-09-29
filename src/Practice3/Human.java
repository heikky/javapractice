package Practice3;

public class Human {
   static class Head{
       String hairColour;
       String eyeColour;

       public void setEyeColour(String eyeColour) {this.eyeColour = eyeColour;}
       public void setHairColour(String hairColour) {this.hairColour = hairColour;}

       public String getEyeColour() {return eyeColour;}
       public String getHairColour() {return hairColour;}
   }
   static class Hand{
       int palmSize;

       public void setPalmSize(int palmSize){this.palmSize = palmSize;}

       public int getPalmSize(){return palmSize;}
   }
   static class Leg{
       int footSize;

       public void setFootSize(int footSize){this.footSize = footSize;}

       public int getFootSize(){return footSize;}
   }
}
