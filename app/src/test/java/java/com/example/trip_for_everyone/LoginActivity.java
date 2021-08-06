package java.com.example.trip_for_everyone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        //로그인 버튼 클릭 함수
    }
    /*
     public void signin(View view){
        String email = signinEmail.getText().toString();
        String password = signinPassowrd.getText().toString();
    }
     */



    //이메일 유효성 검사


    //로그인 확인








    //패스워드의 유효성 검사 메소드


        /*
    public static boolean isValidPassword(String password) {
        boolean err = false;
        String regex = "^[a-zA-Z0-9]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if(m.matches()){
        err = true;
        }

        return err;
    }

    //이메일 유효성 검사 메소드

    public static boolean isValidEmail(String id) {
        boolean err = false;
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(id);
        if(m.matches()){
            err = true;
        }
        return err;
    }
    */
}