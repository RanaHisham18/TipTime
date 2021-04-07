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
    }

    @SuppressLint("StringFormatInvalid", "LocalSuppress")
    fun calculateTip() {

///////////////////////////////////////////////////////////////////////////////////////////////////
    @SuppressLint("StringFormatInvalid")

    fun calculateTip() {
        // TODO("Not yet implemented")
    var cost = stringInTextField.toDoubleOrNull()
        val stringInTextField = binding.costOfService.text.toString()
        //cost = stringInTextField.toDoubleOrNull()
        if (cost == null){
            binding.tipResult.text= " "
            return
        } }
        val selectedId = binding.tipOptions.checkedRadioButtonId

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage*cost
        if (binding.roundUpSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    binding.tipResult.text = getString(string.tip_amount, formattedTip)





}
    /////////////////////////////////////////////////////////////////////////////////////
}


