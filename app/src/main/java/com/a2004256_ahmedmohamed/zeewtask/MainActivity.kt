package com.a2004256_ahmedmohamed.zeewtask

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var menuRecyclerView: RecyclerView
    private lateinit var viewCartButton: Button
    private lateinit var tabLayout: TabLayout
    private lateinit var backIcon: ImageView
    private lateinit var storeTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backIcon = findViewById(R.id.backIcon)
        storeTitle = findViewById(R.id.storeTitle)
        tabLayout = findViewById(R.id.tabLayout)
        menuRecyclerView = findViewById(R.id.menuRecyclerView)
        viewCartButton = findViewById(R.id.viewCartButton)

        val menuItems = listOf(
            MenuItem("Vegan Burger", "Organic, gluten-free, and plant-based", R.drawable.burger),
            MenuItem("Truffle Fries", "Crispy fries with truffle oil and parmesan", R.drawable.fries),
            MenuItem("Matcha Latte", "Served hot or cold, with your choice of milk", R.drawable.matcha)
        )

        menuRecyclerView.layoutManager = LinearLayoutManager(this)
        menuRecyclerView.adapter = MenuAdapter(menuItems)

        tabLayout.addTab(tabLayout.newTab().setText("Burgers"))
        tabLayout.addTab(tabLayout.newTab().setText("Drinks"))
        tabLayout.addTab(tabLayout.newTab().setText("Desserts"))
    }
}