package k4ustu3h.pizzatogo.model

data class Pizza(
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: Int,
    val isVegetarian: Boolean,
    val toppings: List<String>
)