public class _1295_find_numbers_with {

    public static int FindNumbers(int[] nums) {

        int bienDem=0;

        for(int a : nums){
            //kiem tra so chu so cua a
            //Neu nhu so chu so la Chan --> Tang bien dem them 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0){
                bienDem++;
            }
        }
        return bienDem;
    }
    
    private static int tinhSoChuSo(int a){
        int bienDiem = 0;
        int kq=a;
        while(kq != 0){
            kq = a / 10;
            a= kq;
            bienDiem++;
        }
        return bienDiem;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,22,3,4444};

        System.out.println(FindNumbers(nums));
    }
}
