
package com.vinh.mathutil.core;

//class này chứa các hàm static sinh ra để dùng chung cho các nơi khác 
//cái j dùng chung cho nhiều nơi, nhận in4, trả ìn4 qua hàm, mà K cần lưu trữ j hết cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS K BAO H GỌI STATIC QUA CON ĐƯỜNG NEW
public class MathUtility {
    public static final double PI= 3.14;
    //C#: public const double Pi=3.14 //K cần chữ static mà vẫn là static nếu có từ khóa const C# ~ final java
    // hàm tính n! =1*2*3*...
        public static long getFactorial(int n){
            if(n<0 || n>20)
                throw new IllegalArgumentException("Bố khỉ, n bậy bạ");
        if (n==0||n==1)
            return 1;
        long result =10;
            for (int i = 2; i <= n; i++) {
                result *=i;
            }
            return result;
            }
        }

