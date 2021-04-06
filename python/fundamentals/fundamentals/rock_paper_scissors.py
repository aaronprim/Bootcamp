import random
game = (input("3..2..1..Shoot!(rock, paper, or scissors): "))
possible_choices = ["rock", "paper", "scissors"]
computer_choice = random.choice(possible_choices)
print(f"\nYou chose {game}, computer chose {computer_choice}.\n")

if game == computer_choice:
    print(f"Both players selected {game}. It's a tie!")
elif game == "rock":
    if computer_choice == "scissors":
        print("Rock smashes scissors! You win!")
    else:
        print("Paper covers rock! You lose.")
elif game == "paper":
    if computer_choice == "rock":
        print("Paper covers rock! You win!")
    else:
        print("Scissors cuts paper! You lose.")
elif game == "scissors":
    if computer_choice == "paper":
        print("Scissors cuts paper! You win!")
    else:
        print("Rock smashes scissors! You lose.")