package com.vacuum.daggerexample.ui

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.vacuum.daggerexample.App
import com.vacuum.daggerexample.R
import com.vacuum.daggerexample.util.Object2
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var objectManager:Object2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App().getCompanion().inject(this)

        var link = objectManager.get("image")
        if (link == null){
            Toast.makeText(this,"Null Image",Toast.LENGTH_LONG).show()
            link = "https://avatars2.githubusercontent.com/u/16405013?s=460&v=4"
            objectManager.save("image",link)
        }

        Glide.with(this).load(link).into(image)

    }
}
