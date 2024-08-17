package com.example.coffeeshop.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coffeeshop.R
import com.example.coffeeshop.adapter.CartAdapter
import com.example.coffeeshop.databinding.ActivityCartBinding
import com.example.coffeeshop.helper.ChangeNumberItemsListener
import com.example.coffeeshop.helper.ManagmentCart

class CartActivity : BaseActivity() {

    lateinit var management: ManagmentCart
    private var tax: Double = 0.0
    private val binding: ActivityCartBinding by lazy {
        ActivityCartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        management = ManagmentCart(this)

        calculateCart()
        setVariable()
        initCartList()

    }

    private fun initCartList() {
        with(binding) {
            rvCartView.layoutManager =
                LinearLayoutManager(this@CartActivity, LinearLayoutManager.VERTICAL, false)
            rvCartView.adapter = CartAdapter(
                management.getListCart(),
                this@CartActivity,
                object : ChangeNumberItemsListener {
                    override fun onChanged() {
                        calculateCart()
                    }

                })
        }
    }

    private fun setVariable() {
        binding.ivBack.setOnClickListener { finish() }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateCart() {
        val percentTax = 0.02
        val delivery = 15.0
        tax = Math.round((management.getTotalFee() * percentTax) * 100) / 100.0
        val total = Math.round((management.getTotalFee() + tax + delivery) * 100) / 100
        val itemTotal = Math.round(management.getTotalFee() * 100) / 100

        with(binding) {
            subTotalPriceTxt.text = "$$itemTotal"
            totalTaxPriceTxt.text = "$$tax"
            deliveryPriceTxt.text = "$$delivery"
            totalPriceTxt.text = "$$total"
        }

    }
}