import java.awt.*;
 import java.awt.event.*;
 
 public class Listing3107
 extends Frame
 {
   public static void main(String[] args)
   {
     Listing3107 wnd = new Listing3107();
     wnd.setVisible(true);
   }
 
   public Listing3107()
   {
     super("Dialogelemente ohne Layoutmanager");
     addWindowListener(new WindowClosingAdapter(true));
     //Layout setzen und Komponenten hinzufügen
     setSize(300,250);
     setLayout(null);
     for (int i = 0; i < 5; ++i) {
       Button button = new Button("Button"+(i+1));
       button.setBounds(10+i*35,40+i*35,100,30);
       add(button);
     }
   }
 }
