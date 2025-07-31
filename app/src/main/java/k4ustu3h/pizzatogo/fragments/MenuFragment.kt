package k4ustu3h.pizzatogo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import k4ustu3h.pizzatogo.R
import k4ustu3h.pizzatogo.adapters.PizzaAdapter
import k4ustu3h.pizzatogo.data.PizzaData
import k4ustu3h.pizzatogo.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    private lateinit var pizzaAdapter: PizzaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pizzaAdapter = PizzaAdapter()

        binding.pizzaRecyclerView.apply {
            adapter = pizzaAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
        }

        pizzaAdapter.submitList(PizzaData.pizzas)

        binding.chipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            val selectedChipId = checkedIds.firstOrNull()
            filterPizzas(selectedChipId)
        }
    }

    private fun filterPizzas(chipId: Int?) {
        val filteredList = when (chipId) {
            R.id.chip_veg -> PizzaData.pizzas.filter { it.isVegetarian }
            R.id.chip_non_veg -> PizzaData.pizzas.filter { !it.isVegetarian }
            R.id.chip_all -> PizzaData.pizzas
            else -> PizzaData.pizzas
        }
        pizzaAdapter.submitList(filteredList)
    }
}