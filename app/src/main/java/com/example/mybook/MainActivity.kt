package com.example.mybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class MainActivity : AppCompatActivity() {
    lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pdfView = findViewById(R.id.idPDFView)

        pdfView.fromAsset("halallyk_kyssalary.pdf")
            .scrollHandle(DefaultScrollHandle(this))
            .load()
    }
}