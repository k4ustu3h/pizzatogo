package k4ustu3h.pizzatogo.data

import k4ustu3h.pizzatogo.R
import k4ustu3h.pizzatogo.model.Pizza

object PizzaData {
    val pizzas = listOf(
        Pizza(
            "Classic Pepperoni",
            "A timeless favorite with spicy pepperoni, rich tomato sauce, and gooey mozzarella cheese.",
            399.00,
            R.mipmap.pizza,
            false,
            listOf("pepperoni", "mozzarella", "tomato sauce")
        ), Pizza(
            "Margherita Delight",
            "Simple yet elegant, featuring fresh mozzarella, ripe tomatoes, and fragrant basil on a thin crust.",
            325.00,
            R.mipmap.pizza,
            true,
            listOf("fresh mozzarella", "tomatoes", "basil", "tomato sauce")
        ), Pizza(
            "BBQ Chicken Feast",
            "Smoky BBQ chicken, red onions, and cilantro, all on a tangy BBQ sauce base.",
            475.00,
            R.mipmap.pizza,
            false,
            listOf("BBQ chicken", "red onions", "cilantro", "BBQ sauce", "mozzarella")
        ), Pizza(
            "Mushroom Truffle",
            "Earthy mushrooms, a hint of truffle oil, and creamy white sauce for a gourmet experience.",
            549.00,
            R.mipmap.pizza,
            true,
            listOf("mushrooms", "truffle oil", "white sauce", "mozzarella")
        ), Pizza(
            "Veggie Supreme",
            "A garden of fresh vegetables including bell peppers, olives, onions, and mushrooms.",
            379.00,
            R.mipmap.pizza,
            true,
            listOf(
                "bell peppers", "black olives", "red onions", "mushrooms", "spinach", "tomato sauce"
            )
        ), Pizza(
            "Meat Lover's Delight",
            "Packed with pepperoni, sausage, ham, and bacon for the ultimate meat experience.",
            599.00,
            R.mipmap.pizza,
            false,
            listOf("pepperoni", "sausage", "ham", "bacon", "mozzarella", "tomato sauce")
        ), Pizza(
            "Pineapple Ham",
            "A controversial classic, sweet pineapple and savory ham on a tomato base.",
            415.00,
            R.mipmap.pizza,
            false,
            listOf("pineapple", "ham", "mozzarella", "tomato sauce")
        ), Pizza(
            "Four Cheese",
            "A delightful blend of mozzarella, cheddar, parmesan, and provolone cheeses.",
            340.00,
            R.mipmap.pizza,
            true,
            listOf("mozzarella", "cheddar", "parmesan", "provolone", "white sauce")
        ), Pizza(
            "Spicy Arrabbiata",
            "For those who like it hot! Spicy arrabbiata sauce with chili flakes and roasted red peppers.",
            410.00,
            R.mipmap.pizza,
            true,
            listOf(
                "arrabbiata sauce", "chili flakes", "roasted red peppers", "onions", "mozzarella"
            )
        ), Pizza(
            "Chicken Tikka",
            "Indian inspired pizza with marinated chicken tikka, onions, and bell peppers.",
            499.00,
            R.mipmap.pizza,
            false,
            listOf(
                "chicken tikka", "onions", "bell peppers", "coriander", "spicy sauce", "mozzarella"
            )
        ), Pizza(
            "Supreme",
            "The classic supreme with a mix of pepperoni, sausage, bell peppers, onions, and mushrooms.",
            480.00,
            R.mipmap.pizza,
            false,
            listOf(
                "pepperoni",
                "sausage",
                "bell peppers",
                "onions",
                "mushrooms",
                "mozzarella",
                "tomato sauce"
            )
        ), Pizza(
            "Pesto Veggie",
            "A vibrant pizza with a fresh basil pesto base, spinach, cherry tomatoes, and feta cheese.",
            430.00,
            R.mipmap.pizza,
            true,
            listOf("pesto sauce", "spinach", "cherry tomatoes", "feta cheese", "olives")
        ), Pizza(
            "Buffalo Chicken",
            "Spicy buffalo chicken, creamy ranch drizzle, and red onions. A fan favorite.",
            460.00,
            R.mipmap.pizza,
            false,
            listOf("buffalo chicken", "ranch drizzle", "red onions", "mozzarella")
        ), Pizza(
            "Hawaiian",
            "Sweet pineapple and savory Canadian bacon make for a perfect blend of flavors.",
            400.00,
            R.mipmap.pizza,
            false,
            listOf("Canadian bacon", "pineapple", "mozzarella", "tomato sauce")
        ), Pizza(
            "White Garlic Pizza",
            "A classic without tomato sauce, featuring roasted garlic, ricotta, mozzarella, and parmesan.",
            385.00,
            R.mipmap.pizza,
            true,
            listOf("roasted garlic", "ricotta cheese", "mozzarella", "parmesan")
        )
    )
}
