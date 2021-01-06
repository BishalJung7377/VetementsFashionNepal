package com.bishaljung.vetementsfashionnepal.model

import android.os.Parcel
import android.os.Parcelable

class ItemCartModel(
        val itemId: Int? = null,
        val itemName:String? = null,
        val itemPiece: String? = null,
        val itemPrice:String? =  null,
        val itemImage:String? = null,
        ):Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readValue(Int::class.java.classLoader) as? Int,
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
                parcel.readString(),
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeValue(itemId)
                parcel.writeString(itemName)
                parcel.writeString(itemPiece)
                parcel.writeString(itemPrice)
                parcel.writeString(itemImage)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<ItemCartModel> {
                override fun createFromParcel(parcel: Parcel): ItemCartModel {
                        return ItemCartModel(parcel)
                }

                override fun newArray(size: Int): Array<ItemCartModel?> {
                        return arrayOfNulls(size)
                }
        }
}