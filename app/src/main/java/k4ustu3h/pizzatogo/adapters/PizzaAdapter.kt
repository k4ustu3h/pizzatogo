package k4ustu3h.pizzatogo.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import k4ustu3h.pizzatogo.model.Pizza
import k4ustu3h.pizzatogo.databinding.ItemPizzaGridCardBinding
import java.text.NumberFormat
import java.util.Locale

class PizzaAdapter : ListAdapter<Pizza, PizzaAdapter.PizzaViewHolder>(PizzaDiffCallback()) {

    class PizzaViewHolder(private val binding: ItemPizzaGridCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
            binding.pizzaName.text = pizza.name
            binding.pizzaDescription.text = pizza.description

            binding.pizzaImage.setImageResource(pizza.imageUrl)

            val indianLocale = Locale.Builder().setLanguage("en").setRegion("IN").build()
            val priceFormat = NumberFormat.getCurrencyInstance(indianLocale)
            binding.pizzaPrice.text = priceFormat.format(pizza.price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val binding =
            ItemPizzaGridCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PizzaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val pizza = getItem(position)
        holder.bind(pizza)
    }

    private class PizzaDiffCallback : DiffUtil.ItemCallback<Pizza>() {
        override fun areItemsTheSame(oldItem: Pizza, newItem: Pizza): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Pizza, newItem: Pizza): Boolean {
            return oldItem == newItem
        }
    }
}
