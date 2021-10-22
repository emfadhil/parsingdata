package com.digitalindo.passingdata

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    public var input1 : EditText? = null
    public var input2 : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById<EditText>(R.id.editTextNumber)
        input2 = findViewById<EditText>(R.id.editTextNumber2)

        //Untuk tambah
        val tambah = findViewById<Button>(R.id.tambah)
        tambah.setOnClickListener {
            val pindah = Intent(this, DetailResultActivity::class.java)
            val ambil1 = input1?.text.toString()
            val ambil2 = input2?.text.toString()

            val x = ambil1.toDouble()
            val y = ambil2.toDouble()

            val result2 = x.plus(y)
            pindah.putExtra("data", result2)
            //pindah.putExtra("data","Data yang mau dilempar")
            startActivity(pindah)
        }

        // Untuk kurang
        val kurang = findViewById<Button>(R.id.kurang)
        kurang.setOnClickListener {
            val pindah = Intent(this, DetailResultActivity::class.java)
            val ambil1 = input1?.text.toString()
            val ambil2 = input2?.text.toString()

            val x = ambil1.toDouble()
            val y = ambil2.toDouble()

            val result2 = x.minus(y)
            pindah.putExtra("data", result2)
            startActivity(pindah)
        }

        // Untuk bagi
        val bagi = findViewById<Button>(R.id.bagi)
        bagi.setOnClickListener {
            val pindah = Intent(this, DetailResultActivity::class.java)
            val ambil1 = input1?.text.toString()
            val ambil2 = input2?.text.toString()

            val x = ambil1.toDouble()
            val y = ambil2.toDouble()

            val result2 = x.div(y)
            pindah.putExtra("data", result2)
            startActivity(pindah)
        }

        // Untuk kali
        val kali = findViewById<Button>(R.id.kali)
        kali.setOnClickListener {
            val pindah = Intent(this, DetailResultActivity::class.java)
            val ambil1 = input1?.text.toString()
            val ambil2 = input2?.text.toString()

            val x = ambil1.toDouble()
            val y = ambil2.toDouble()

            val result2 = x.times(y)
            pindah.putExtra("data", result2)
            startActivity(pindah)
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun showAlert(result : String){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Hasil")
        alert.setMessage(result)
        alert.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, which ->

        })
        alert.show()
    }

    fun hitTambah(view: View) {

        // ambil inputan user
        val ambil1 = input1?.text.toString()
        val ambil2 = input2?.text.toString()

        val x = ambil1.toDouble()
        val y = ambil2.toDouble()

        val result2 = x.plus(y)

        // show result in alert
       // showAlert("${result2}")


    }

    fun hitKurang(view: View) {

        // ambil inputan user
        val ambil1 = input1?.text.toString()
        val ambil2 = input2?.text.toString()

        val x = ambil1.toDouble()
        val y = ambil2.toDouble()

        val result2 = x.minus(y)

        // show result in alert
        showAlert("${result2}")


    }

    fun hitBagi(view: View) {

        // ambil inputan user
        val ambil1 = input1?.text.toString()
        val ambil2 = input2?.text.toString()

        val x = ambil1.toDouble()
        val y = ambil2.toDouble()

        val result2 = x.div(y)

        // show result in alert
        showAlert("${result2}")


    }

    fun hitKali(view: View) {

        // ambil inputan user
        val ambil1 = input1?.text.toString()
        val ambil2 = input2?.text.toString()

        val x = ambil1.toDouble()
        val y = ambil2.toDouble()

        val result2 = x.times(y)

        // show result in alert
        showAlert("${result2}")


    }

    fun clearData(view: View) {

        // clear data
        val ambil1 = findViewById<EditText>(R.id.editTextNumber)
        val ambil2 = findViewById<EditText>(R.id.editTextNumber2)
        ambil1.setText("");
        ambil2.setText("");

    }

}