package com.example.noteappsharedpref.util

import com.example.noteappsharedpref.model.Note

object ObkectList {
    fun noteList(): MutableList<Note>{
        return mutableListOf(
            Note(
                "7:25",
                "Android"
            ),
            Note(
                "8:25",
                "Android"
            ),
            Note(
                "2:33",
                "IOS"
            ),
            Note(
                "9:22",
                "Android"
            ),
            Note(
                "7:50",
                "C++"
            ),
            Note(
                "7:26",
                "TURSUNBOY"
            ),
            Note(
                "7:25",
                "Java"
            ),
            Note(
                "7:25",
                "Android"
            ),

        )
    }
}