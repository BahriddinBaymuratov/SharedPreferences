package com.example.noteappsharedpref.helper

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.*
import androidx.recyclerview.widget.RecyclerView
import com.example.noteappsharedpref.adapter.NoteAdapter


val itemTouchHelper by lazy {
    val itemTouchCallBack = object : ItemTouchHelper.SimpleCallback(
    UP or DOWN or START or
            END,0
    ){
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            val noteAdapter = recyclerView.adapter as NoteAdapter
            val from = viewHolder.adapterPosition
            val to = target.adapterPosition
            noteAdapter.moveItem(from,to)
            noteAdapter.notifyItemMoved(from,to)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {}

        override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
            super.onSelectedChanged(viewHolder, actionState)
            if (actionState == ACTION_STATE_DRAG){
                viewHolder?.itemView?.alpha = 0.5f
            }
        }

        override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
            super.clearView(recyclerView, viewHolder)
            viewHolder.itemView.alpha = 1.0f
        }
    }
    ItemTouchHelper(itemTouchCallBack)
}














