package com.abadock.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.abadock.myapplication.databinding.ActivityShowCharactersBinding

class ShowCharacters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityShowCharactersBinding = DataBindingUtil.setContentView(this, R.layout.activity_show_characters)

        binding.characterRecycle.layoutManager = GridLayoutManager(this, 4)
    }
}