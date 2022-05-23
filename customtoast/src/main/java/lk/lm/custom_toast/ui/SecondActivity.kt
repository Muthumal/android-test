package lk.lm.custom_toast.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import lk.lm.custom_toast.databinding.ActivityTestBinding

class SecondActivity:AppCompatActivity() {

    lateinit var binding:ActivityTestBinding
    val viewModel: TestViewModel =ViewModelProvider(this).get(TestViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.putExtra("name", viewModel.name.get())
            setResult(RESULT_OK, sendIntent)
            finish()
        }

    }

}