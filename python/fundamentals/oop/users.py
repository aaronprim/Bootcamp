class User:
    def __init__(self, name, email_address):
        self.name = name
        self.email = email_address
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount

    def make_withdrawl(self, amount):
        self.account_balance -= amount

    def display_user_balance(self):
        print(f"User: {self.name} Balance: {self.account_balance}")
        

    def transfer_money(self, other_user, amount):
        self.account_balance -= amount
        
guido = User("Guido van Rossum", "quido@python.com")
monty = User("Monty Python", "monty@python.com")
aaron= User("Aaron Prim", "aaron@python.com")

guido.make_deposit(100)
guido.make_deposit(100)
guido.make_deposit(100)
guido.make_withdrawl(50)
guido.display_user_balance()

monty.make_deposit(500)
monty.make_deposit(500)
monty.make_withdrawl(100)
monty.make_withdrawl(100)
monty.display_user_balance()

aaron.make_deposit(100)
aaron.make_withdrawl(10)
aaron.make_withdrawl(100)
aaron.make_withdrawl(10)
aaron.display_user_balance()


# print(aaron.name)
# print(guido.name)
# print(monty.name)

# print(guido.name, guido.account_balance)
# print(monty.name, monty.account_balance) 
# print(aaron.name, aaron.account_balance)