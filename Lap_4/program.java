
/**
 *
 * @author Hang
 */
public class program {
    public static  void main(String[] args)
    {
        SanPham sp1,sp2;
        sp1 = new SanPham("Caffe Uy Tín",90000);
        sp2 = new SanPham("", 0);
        sp1.Xuat();
        sp2.Xuat();
    }
}
