import java.io.PrintStream;
import java.io.PrintWriter;

public class ExpException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("lỗi rồi con đĩ mẹ mày");
    }
}
