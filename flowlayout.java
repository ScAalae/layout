import java.awt.*;
004 import java.awt.event.*;
005 
006 public class Listing3102
007 extends Frame
008 {
009   public static void main(String[] args)
010   {
011     Listing3102 wnd = new Listing3102();
012     wnd.setVisible(true);
013   }
014 
015   public Listing3102()
016   {
017     super("Test FlowLayout");
018     addWindowListener(new WindowClosingAdapter(true));
019     //Layout setzen und Komponenten hinzufügen
020     setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
021     add(new Button("Button 1"));
022     add(new Button("Button 2"));
023     add(new Button("Button 3"));
024     add(new Button("Button 4"));
025     add(new Button("Button 5"));
026     pack();
027   }
028 }
