public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
//        return number*number; //todo đánh dấu phương thức chưa hoàn thiện
        if(number < 0)
            return -number;
        return number;
    }
}
