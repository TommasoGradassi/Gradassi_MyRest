package com.example.myrest_gradassi
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnSearch : Button = findViewById(R.id.btnFind)
        var btnWebView : Button = findViewById(R.id.btnBrowse)
        var btnRest : Button = findViewById(R.id.btnRest)

        btnSearch.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, "Search", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        })

        btnWebView.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, "WebView", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        })

        btnRest.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, "Rest", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, RestActivity::class.java)
            startActivity(intent)
        })
    }
}
