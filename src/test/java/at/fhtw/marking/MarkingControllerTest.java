package at.fhtw.marking;



public class MarkingControllerTest {


    public void passtest(){
        try {
            PasswordController pc = new PasswordController();
            pc.getPassword(3);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
