class Ninja {
    constructor(nameNinja, health) {
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log(Ninja.nameNinja);
    }

    showStats(){
        console.log(ninja1.speed.strength);
    }

    drinkSake(){
        this.health += 10;
    }
}

class Sensei extends Ninja {
    constructor(){
        this.health = 200; 
        this.speed = 10;
        this.strength = 10;
        this.wisdom = 10
    }

    speakWisdom(){
        super.drinkSake();
        console.log("One day young grasshopper");
    }
    
}
