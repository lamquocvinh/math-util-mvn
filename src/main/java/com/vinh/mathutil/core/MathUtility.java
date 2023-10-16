
package com.vinh.mathutil.core;

//class này chứa các hàm static sinh ra để dùng chung cho các nơi khác 
//cái j dùng chung cho nhiều nơi, nhận in4, trả ìn4 qua hàm, mà K cần lưu trữ j hết cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS K BAO H GỌI STATIC QUA CON ĐƯỜNG NEW
public class MathUtility {
    public static final double PI= 3.14;
    
            public static long getFactorial(int n){
            if(n<0 || n>20)
                throw new IllegalArgumentException("Bố khỉ, n bậy bạ");
        if (n==0||n==1)
            return 1;
        
        return n*getFactorial(n-1);
            }
            //ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VS QUY MÔ NHỎ HƠN
            //5!=1.2.3.4.5
            //5!=      4!.5
            //4!=1.2.3.4
            //4!=     3!.4
            //3!=1.2.3
            //3!=  2!.3
            //2!=1!.2
            //N!= N X (N-1)!
            
            
        //KĨ THUẬT KIỂM THỬ HỒI QUY 
        // TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN OK K
        // TẠI SAO CẦN TEST LẠI
        //CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI VÌ AE FIX BUG NÊN SỬA CODE
        //AE TỐI ƯU CHỈNH SỬA CODE ĐỂ CODE ĐẸP HƠN CHẠY TỐT HƠN 
        //AE THÊM HÀM MỚI
        //KHI SỬA CODE, PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
        // NẾU TEST  = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SỐT 
        //NẾU CÓ TEST SRCIPT TA CHỈ VIỆC RUN VÀ NHÌN MÀU            
        //NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
        //TA TEST LẠI MA CHỈ CẦN NHÌN MÀU -> NHANH, K HAO SỨC , CHÍNH XÁC 
        //MIỄN ĐỦ 
//C#: public const double Pi=3.14 //K cần chữ static mà vẫn là static nếu có từ khóa const C# ~ final java
    // hàm tính n! =1*2*3*...
//        public static long getFactorial(int n){
//            if(n<0 || n>20)
//                throw new IllegalArgumentException("Bố khỉ, n bậy bạ");
//        if (n==0||n==1)
//            return 1;
//        long result =10;
//            for (int i = 2; i <= n; i++) {
//                result *=i;
//            }
//            return result;
//            }
        }

