
package frame.pkg3;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Bai1 extends Frame{
 
    public Bai1()
    {
        XulySKCuaSo  x = new XulySKCuaSo();
        addWindowListener(x);
        setTitle("Bai 1_AWT");
        setSize(300,300);
        GridLayout l = new GridLayout(4,2);
        setLayout(l);
        
        lblA =new Label("a = ");
        add(lblA); //Gắn vào Frame  
        txtA = new TextField(20);
        add(txtA);
        
        lblB = new Label("b = ");
        add(lblB);
        txtB = new TextField(20);
        add(txtB);
         
        lblRong = new Label("");
        add(lblRong);
        //Tong
        btnTong = new Button(" +");
        btnTong.addActionListener(new LangNgheCong());
       // add(btnTong);
        //Hieu
        btnHieu =  new Button("-");
        btnHieu.addActionListener(new LangNgheHieu());
    //    add(btnHieu);
        
        //Tich
        btnTich =new Button("*");
        btnTich.addActionListener(new LangNgheTich());
     //   add(btnTich);
        
        //Thương
        btnThuong =new Button("/");
        btnThuong.addActionListener(new LangNgheThuong());
     //   add(btnThuong);
        
       Panel  p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(btnTong);
        p.add(btnHieu);
        p.add(btnTich);
        p.add(btnThuong);
        add(p);
        lblKq = new Label("KQ =");
        add(lblKq);
         txtKq = new TextField(20);
         add(txtKq);
         setLocation(100, 200);
         setVisible(true);
        
    }
    public static void main(String[] args) {
        new Bai1();
    }
           
    //Bộ lắng nghe
    class LangNgheCong implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           //Lay A
           int a = Integer.parseInt(txtA.getText());
           //Lay B
            int b = Integer.parseInt(txtB.getText());
           //Tinh tong
           int Tong = a+b;
           //Xuat
           txtKq.setText(String.valueOf(Tong));
        }
       
    }
     class LangNgheHieu implements ActionListener{
            public void actionPerformed(ActionEvent e) {
           //Lay A
           int a = Integer.parseInt(txtA.getText());
           //Lay B
           int b = Integer.parseInt(txtB.getText());
           //Tinh hieu
           int Hieu = a-b;          
           //Xuat          
           txtKq.setText(String.valueOf(Hieu));           
          
        }     
}
     class LangNgheTich implements ActionListener{
            
            public void actionPerformed(ActionEvent e) {
           //Lay A
           int a = Integer.parseInt(txtA.getText());
           //Lay B
           int b = Integer.parseInt(txtB.getText());
           //Tinh tong
           int Tich = a*b;
           
           //Xuat
           txtKq.setText(String.valueOf(Tich));
          
             }
        }
            class LangNgheThuong implements ActionListener{             
                        public void actionPerformed(ActionEvent e) {
                       //Lay A
                       int a = Integer.parseInt(txtA.getText());
                       //Lay B
                       int b = Integer.parseInt(txtB.getText());
                       //Tinh tong
                       int Thuong = a/b;

                       //Xuat
                       txtKq.setText(String.valueOf(Thuong));

             }
        }
            static class XulySKCuaSo implements WindowListener{

        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
                
            }
             Label lblA, lblB, lblRong,lblKq;
             TextField txtA, txtB, txtKq;
             Button btnTong, btnHieu,btnTich,btnThuong;
}
