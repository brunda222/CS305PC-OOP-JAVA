class AnnoP{
          @Deprecated
          public void depM(){
               System.out.println("Deprecated Method...");
          }
          public void ovR(){
               System.out.println("Annop");
           }
 }
 @MyAnno("My ANNO DEF")
 class AnnoC extends AnnoP{
           @Override
           public void ovR(){
                 System.out.println("AnnoC");
              }
 }
 
 public class AnnoDemo{
            @SuppressWarnings("deprecation")
            public static void main(String...args){
            Class<?> ct = AnnoP.class;
            AnnoC ac = new AnnoC();
            ac.ovR();
            ac.depM();
           MyAnno ma= MyAnno.class(); 
            System.out.println(ct.isAnnotationPresent(MyAnno.class)); 
            System.out.println((MyAnno.usage));  
     }          
}             
