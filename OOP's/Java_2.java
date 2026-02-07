public class Java_2 {
    public static void main(String[] args) {
        bankAcc myAcc = new bankAcc();
        myAcc.username = "Niraj";
        // myAcc.password = "anskdnda";        this will show error.
        myAcc.setPassword("anskdnda");
    }
}

class bankAcc {
    public String username;
    private String password;        // cant be accessed outside this class.
    public void setPassword(String pwd) {
        password = pwd;
    }
}