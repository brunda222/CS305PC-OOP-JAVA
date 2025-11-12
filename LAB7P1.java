import java.awt.event.*;
import java.awt.*;


class LAB7P1{
        public static void main(String...args){
        final int []a={1};
        Frame f=new Frame();
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        TextFiled tf = new TextFiled(20);
        Button b=new Button("Click");
        b.setSize(20,40);
        Label l = new Label();
        l.setPreferredSize( new Dimension(100,100));         
        f.setVisible(true);
        f.add(tf);
        f.add(b);
        f.add(l);
        b.addActionListener(
             new ActionListener(){
                   public void actionPerformed(ActionEvent ae){
                     System.out.println("Hello");
                     l.setText(tf.getText()+"-"+a[0]);
                     a[0]++;
                     }               
                 }
             );
             f.addWindowListener(
                 new WindowAdapter(){
                         public void windowClosing(WindowEvent we){
                          f.dispose();
                     }
                 }
            );
       }
}





































































