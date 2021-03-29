
    var pizza = {

    crustType: ["deep dish", "hand tossed"],
    sauceType: ["traditional", "marinara"],
    cheeses: ["mozzarella", "feta"],
    topping: ["pepperroni", "sausage", "mushrooms", "olives", "onions"]
};

    function pizzaOven(crustType, sauceType, cheeses, toppings){
        var pizza ={};
        pizza.crustType = crustType;
        pizza.sauceType = sauceType;
        pizza.cheeses = cheeses;
        pizza.toppings = toppings;
        return pizza;
    }

var p1 = pizzaOven("deep dish", "traditional", "mozzarealla", ["pepperoni", "sausage"]);
console.log(p1)

var p2 = pizzaOven("hand tossed", "marinara", ["mozzarealla", "feta"], ["mushrooms", "olives", "onions"]);
console.log(p2)






