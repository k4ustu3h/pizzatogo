package k4ustu3h.pizzatogo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import k4ustu3h.pizzatogo.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left + 32,
                systemBars.top + 32,
                systemBars.right + 32,
                systemBars.bottom + 32
            )
            insets
        }

        auth = FirebaseAuth.getInstance()

        binding.signupButton.setOnClickListener {
            signupNewUser()
        }

        binding.loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun signupNewUser() {

        val email = binding.emailTextInput.text.toString()
        val password = binding.passwordTextInput.text.toString()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "please enter credentials", Toast.LENGTH_LONG).show()
        } else {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Registration successful!", Toast.LENGTH_LONG).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                } else {
                    Toast.makeText(
                        this, "Registration failed!!" + " Please try again later", Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}