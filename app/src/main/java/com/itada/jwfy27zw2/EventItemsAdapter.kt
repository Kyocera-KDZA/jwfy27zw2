package com.itada.jwfy27zw2

import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventItemsAdapter (private val dataSet: Array<String>) : RecyclerView.Adapter<EventItemsAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val img:ImageView
        val name: TextView
        val desc: TextView

        init {
            img = itemView.findViewById(R.id.img_event)
            name = itemView.findViewById(R.id.txt_event_name)
            desc = itemView.findViewById(R.id.txt_event_desc)
        }
    }

    // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
        {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_items, parent, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        //viewHolder.img.setImageDrawable(@drawable)
        viewHolder.name.text = dataSet[position]
        viewHolder.desc.text = dataSet[position]

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}