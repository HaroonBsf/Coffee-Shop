package com.example.coffeeshop.model

import android.os.Parcel
import android.os.Parcelable

data class ItemsModel(
    var title: String="",
    var description:String,
    var picUrl:ArrayList<String> = ArrayList(),
    var price:Double= 0.0,
    var rating:Double= 0.0,
    var numberInCart: Int= 0,
    var extra: String= ""
) : Parcelable {

    constructor() : this("", "", ArrayList(), 0.0, 0.0, 0, "")

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.createStringArrayList() as ArrayList<String>,
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeStringList(picUrl)
        parcel.writeDouble(price)
        parcel.writeDouble(rating)
        parcel.writeInt(numberInCart)
        parcel.writeString(extra)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemsModel> {
        override fun createFromParcel(parcel: Parcel): ItemsModel {
            return ItemsModel(parcel)
        }

        override fun newArray(size: Int): Array<ItemsModel?> {
            return arrayOfNulls(size)
        }
    }
}
