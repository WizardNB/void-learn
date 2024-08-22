package InputManage;

import java.util.InputMismatchException;
import java.util.function.Supplier;

public class InputManage {
    public static Object input(Supplier scantype){
        Object num=null;
        while (true) {
            try {
                num = scantype.get();       /*new Scanner(System.in).nextInt()*/
                break;
            } catch (InputMismatchException exception) {
                if(exception.getMessage()==null) System.out.println("error:" + exception);
                else System.out.println("error:范围错误");
            }
        }
        return num;
    }
}
