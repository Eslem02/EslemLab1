public class VariableTest{
   //First Question
    static int counter=0;

    public void incremnetsCounter(){
        counter++;
        System.out.println("Counter: "+counter);
    }
    public static void main(String[]args){
         VariableTest obj1= new VariableTest();
        obj1.incremnetsCounter();
         VariableTest obj2=new VariableTest();
        obj2.incremnetsCounter();
}}
 //Second Question
       /* public class Variable{
            public static void main (String[]args){
                int outerX=5;
                System.out.println("Before block: outerX= "+outerX);
                if (outerX>0) {
                    int innerY=15;
                    System.out.println("İnside block: outerX= "+outerX);
                    System.out.println("İnside block innerY= "+innerY);
                }
              System.out.println("After block: outerX= "+outerX);

            }
        }*/











