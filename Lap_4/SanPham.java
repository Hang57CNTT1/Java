
import java.util.Scanner;


/**
 *
 * @author Hang
 */
public class SanPham {
    //Bai1: khai bao thuoc tinh
    private String Tensp;
    private double Dongia,Giamgia;
    private double getThueNhapKhau()
    {
        return 0.1*getDongia();
    }
    //Bai3
    public  SanPham()
    {
        this.Tensp = "";
        this.Dongia = 0.0;
        this.Giamgia = 0.0;
    }
    public SanPham(String TenSP,double dongia,double giamgia)
    {
        this.Tensp = TenSP;
        this.Dongia = dongia;
        this.Giamgia = giamgia;
    }
    public SanPham(String TenSP,double  dongia)
    {
        this(TenSP,dongia,0);
    }
    public  void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên sản phẩm: ");
        setTensp(scanner.nextLine());
        System.out.println("Đơn giá: ");
        setDongia(scanner.nextDouble());
        System.out.println("Giảm giá: ");
        setGiamgia(scanner.nextDouble());
    }
    public void  Xuat(){
        System.out.println("San Pham: " +getTensp() + ", Đơn giá: " + getDongia() +", Giam gia: " +getGiamgia());
    }
     /**
     * @return the Tensp
     */
    public String getTensp() {
        return Tensp;
    }

    /**
     * @param Tensp the Tensp to set
     */
    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    /**
     * @return the Dongia
     */
    public double getDongia() {
        return Dongia;
    }

    /**
     * @param Dongia the Dongia to set
     */
    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    /**
     * @return the Giamgia
     */
    public double getGiamgia() {
        return Giamgia;
    }

    /**
     * @param Giamgia the Giamgia to set
     */
    public void setGiamgia(double Giamgia) {
        this.Giamgia = Giamgia;
    }
}
