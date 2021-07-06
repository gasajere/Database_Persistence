package com.terence.database_persistence
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.terence.database_persistence.databinding.ShoppingItemBinding

class TodoAdapter(var ListItem:List<ShoppingModel>):RecyclerView.Adapter<TodoAdapter.Viewholder>() {
    class Viewholder(var binding:ShoppingItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bindData(singleItem:ShoppingModel){
            binding.lblText.text = singleItem.category
            binding.lblDesc.text = singleItem.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        var bind:ShoppingItemBinding = ShoppingItemBinding.inflate(LayoutInflater.from(parent.context))
        return Viewholder(bind)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        var singleItem  = ListItem.get(position)
        holder.bindData(singleItem)
    }

    override fun getItemCount(): Int {
        return ListItem.size
    }
}