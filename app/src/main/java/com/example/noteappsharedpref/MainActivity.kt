package com.example.noteappsharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteappsharedpref.adapter.NoteAdapter
import com.example.noteappsharedpref.databinding.ActivityMainBinding
import com.example.noteappsharedpref.helper.itemTouchHelper
import com.example.noteappsharedpref.util.ObkectList

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var noteAdapter: NoteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        noteAdapter = NoteAdapter()
        noteAdapter.differ.submitList(ObkectList.noteList())
        itemTouchHelper.attachToRecyclerView(binding.rv)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = noteAdapter

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}