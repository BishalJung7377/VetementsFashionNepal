package com.bishaljung.vetementsfashionnepal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bishaljung.vetementsfashionnepal.Fragments.CartFragments
import com.bishaljung.vetementsfashionnepal.R
import com.bishaljung.vetementsfashionnepal.model.ItemCartModel
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class ItemCartAdapter(

        val cartItemlist: ArrayList<ItemCartModel>,
        val context: CartFragments
        ): RecyclerView.Adapter<ItemCartAdapter.ItemCartViewHolder>(){
                class ItemCartViewHolder(view: View): RecyclerView.ViewHolder(view){
                        val imgitemimage: ImageView
                        val tvitempiece: TextView
                        val tvitemname: TextView
                        val tvitemprice: TextView
                        init {
                                imgitemimage = view.findViewById(R.id.imgitemimage)
                                tvitempiece = view.findViewById(R.id.tvitempiece)
                                tvitemname = view.findViewById(R.id.tvitemname)
                                tvitemprice = view.findViewById(R.id.tvitemprice)
                        }
                }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCartViewHolder {

                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.activity_fragment_cart, parent,  false)

                return ItemCartViewHolder(view)

        }

        override fun onBindViewHolder(holder: ItemCartViewHolder, position: Int) {


                val selecteditems = cartItemlist[position]
                Glide.with(context).load(selecteditems.itemImage)
                        .into(holder.imgitemimage)
                holder.tvitemname.text = selecteditems.itemName
                holder.tvitemprice.text = selecteditems.itemPrice
                holder.tvitempiece.text = selecteditems.itemPiece
        }

        override fun getItemCount(): Int {
                return  cartItemlist.size
        }
}