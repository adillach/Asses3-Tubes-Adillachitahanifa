package com.example.xedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xedu.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    private lateinit var binding : ActivityContactBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i

        )

        val name = arrayOf(

            "leli",
            "loka",
            "sarkul",
            "joner",
            "manto",
            "sola",
            "lateng",
            "gokgok",
            "papah"
        )

        val lastmisscall = arrayOf(

            "7 missed call","Incoming call","Ponsel","Whatsapp Audio","Line call","Spamcall",
            "Whatsapp Audio","Line call","Ponsel"
        )

        val misstime = arrayOf(

            "7:00 am","8:00 am","9:00 am","10:50 am","11:12 am","12:30 pm","13:20 pm","14:15 pm","20:38 pm"
        )

        val phoneNo = arrayOf(

            "085255467896","085233456357","085245327456","085245332578","085155467769","085267445378",
            "085245367789","085233456645","0411045678"
        )

        val country = arrayOf(

            "Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia"
        )

        userArrayList = ArrayList()

        for (i in name.indices){

            val user = User(name[i],lastmisscall[i],misstime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener {parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }
    }
}