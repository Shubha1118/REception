package java.tata.shubham.reception;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityReg extends AppCompatActivity {
    private static final String KEY_STATUS = "status";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_Address = "address";
    private static final String KEY_Patient_Id = "Id";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_EMPTY = "confirmPassword";
    private EditText etUsername;
    private EditText etPatientId;
    private EditText etAddress;
    private EditText etPassword;
    private EditText etConfirmPassword;

    private String Id;
    private String username;
    private String password;
    private String confirmPassword;
    private String Address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_reg);
        etreceptionId=findViewById(R.id.etreceptionIdId);
        etUsername = findViewById(R.id.etusername_id);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        etAddress = findViewById(R.id.etAddress);

        Button login = findViewById(R.id.Login_btn);
        Button register = findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityReg.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
