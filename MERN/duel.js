class Card {
    constructor (cardName, cost) {
        this.cardName = cardName;
        this.cost = cost;
    }
}

class Unit extends Card {
    constructor(nameCard, cost, power, res) {
        super(nameCard, cost);
        this.power = power;
        this.res = res;
    }
    attack(target) {
        if(target instanceof Unit){
            target.res -= this.power;
        }
    }

    
}

class Effect extends Card {
    constructor(nameCard, cost, text, stat, mag){
        super(nameCard, cost);
        this.text = text;
        this.stat = stat;
        this.mag = mag;
    }

    play(target){
        if (target instanceof Unit){
            target[this.stat] += this.mag;
            let direction = this.mag < 0 ? "reduced" : "increased"
        }
    }

}

const redBeltNinja = new Unit("Red Belt Ninja", 3,3,4);
const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);

const hardAlgo = new Effect("Hard Algorith", 2, "Increase targets resilience by 3", "resilience", 3);
const UPR = new Effect("Unhandled Promise Rejection", 1, "Reduce Target's resilience by 2", -2);
const pairProgramming = new Effect("Pair Programming", 3, "Increase Target's power by 2", 2);

hardAlgo.play(redBeltNinja);
UPR.play(blackBeltNinja);
pairProgramming.play(redBeltNinja);
redBeltNinja.attack(blackBeltNinja);
