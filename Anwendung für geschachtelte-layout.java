Anwendung für geschachtelte Layoutmanager
import java.awt.*;
004 import java.awt.event.*;
005 
006 public class Listing3109
007 extends Frame
008 {
009   public static void main(String[] args)
010   {
011     Listing3109 wnd = new Listing3109();
012     wnd.setVisible(true);
013   }
014 
015   public Listing3109()
016   {
017     super("Geschachtelte Layoutmanager, Teil II");
018     addWindowListener(new WindowClosingAdapter(true));
019     //Layout setzen und Komponenten hinzufügen
020     setSize(300,200);
021     //Panel 1
022     Panel panel1 = new Panel();
023     panel1.setLayout(new GridLayout(3,2));
024     panel1.add(new Button("Button1"));
025     panel1.add(new Button("Button2"));
026     panel1.add(new Button("Button3"));
027     panel1.add(new Button("Button4"));
028     panel1.add(new Button("Button5"));
029     panel1.add(new Button("Button6"));
030     //Panel 2
031     Panel panel2 = new Panel();
032     panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
033     panel2.add(new Button("Abbruch"));
034     panel2.add(new Button("OK"));
035     //Hauptfenster
036     setLayout(new BorderLayout());
037     add(panel1, BorderLayout.CENTER);
038     add(panel2, BorderLayout.SOUTH);
039   }
040 }
