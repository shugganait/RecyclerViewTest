package lib.kg.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import lib.kg.recyclerview.databinding.ItemCarListBinding

class CarAdapter : Adapter<CarAdapter.CarViewHolder>() {

    private var carList = ArrayList<Car>()

    @SuppressLint("NotifyDataSetChanged")
    fun addListModel(list: ArrayList<Car>) {
        carList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemCarListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(carList[position])
    }

    inner class CarViewHolder(val binding: ItemCarListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(car: Car) {
            with(binding) {
                Glide.with(image).load(car.image).into(image)
                tvName.text = car.name
                tvYear.text = car.year
            }
        }
    }
}