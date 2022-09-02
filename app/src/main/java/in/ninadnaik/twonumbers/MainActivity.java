package in.ninadnaik.twonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ninad.helloworld.R;

public class MainActivity extends AppCompatActivity {
    TextView txtName;
    EditText firstNumber;
    EditText secondNumber;
    long x, y;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.textView);
        firstNumber = findViewById(R.id.enterFirstNumber);
        secondNumber = findViewById(R.id.enterSecondNumber);

    }

    public void getValue(){
        flag = false;
        if (firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            Toast.makeText(this, "No input!", Toast.LENGTH_SHORT).show();
            txtName.setText("");
            flag = true;
            return;
        }
        x = Long.parseLong(firstNumber.getText().toString());
        y = Long.parseLong(secondNumber.getText().toString());
    }
    public void add(View view){
        //if (Long.parseLong(firstNumber.getText().toString()) >= Long.MAX_VALUE/2 || Long.parseLong(secondNumber.getText().toString())>=Long.MAX_VALUE/2 || Long.parseLong(firstNumber.getText().toString())<=Long.MIN_VALUE/2 || Long.parseLong(secondNumber.getText().toString())<=Long.MIN_VALUE/2) {
        getValue();
        if (flag){
            return;
        }
        txtName.setText(new StringBuilder().append("Sum = ").append(x + y).toString());
        Toast.makeText(this, "Addition Completed!", Toast.LENGTH_SHORT).show();
    }

    public void subtract(View view){
        getValue();
        if (flag){
            return;
        }
        txtName.setText(new StringBuilder().append("Difference = ").append(x - y).toString());
        Toast.makeText(this, "Subtraction Completed!", Toast.LENGTH_SHORT).show();
    }

    public void multiply(View view){
        getValue();
        if (flag){
            return;
        }
        txtName.setText(new StringBuilder().append("Product = ").append(x * y).toString());
        Toast.makeText(this, "Multiplication Completed!", Toast.LENGTH_SHORT).show();
    }

    public void divide(View view){
        getValue();
        if (flag){
            return;
        }
        if (y == 0){
            Toast.makeText(this, "Can't divide by zero!", Toast.LENGTH_SHORT).show();
            return;
        }
        txtName.setText(new StringBuilder().append("Division = ").append(1.0*x / y).toString());
        Toast.makeText(this, "Division Completed!", Toast.LENGTH_SHORT).show();
    }
}
