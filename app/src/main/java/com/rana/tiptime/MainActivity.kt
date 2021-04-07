package com.rana.tiptime

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rana.tiptime.R.string
import com.rana.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding.myButton.text = "Calculate Tip"

        binding.myButton.setOnClickListener { calculateTip() }
        //override
      /*  fun onCreate(savedInstanceState: Bundle?) {


            setContentView(binding.root)

            binding.myButton.setOnClickListener { calculateTip() }

            binding.costOfServiceEditText.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)
            }
        }*/


    }




///////////////////////////////////////////////////////////////////////////////////////////////////


    fun calculateTip() {

   // var cost = ٍStringInTextField.toDoubleOrNull()
        // getting the cost value from edittext
        val stringInTextField = binding.costOfServiceEditText.text.toString()
         val cost = stringInTextField.toDoubleOrNull()

        if (cost == null){
            binding.tipResult.text= " "
            return
        }
        val selectedId = binding.tipOptions.checkedRadioButtonId

        val tipPercentage = when (selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage*cost
        if (binding.roundUpSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
       binding.tipResult.text =tip.toString()
//
    }
  //======================================




   /* private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }*/





}
    /////////////////////////////////////////////////////////////////////////////////////



