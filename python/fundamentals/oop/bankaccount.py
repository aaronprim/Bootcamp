class BankAccount:
    def __init__ (self, int_rate, balance):
        self.int_rate =  int_rate
        self.balance = balance
        
        

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        self.balance -= amount
        return self

    def yield_interest(self):
        self.balance += self.balance * self.int_rate
        return self

    def display_accout_info(self):
        print(f"Balance: {self.balance}, Rate: {self.int_rate}")

        

account1 = BankAccount(0.03,500)
account2 = BankAccount(0.01,0)

account1.deposit(200).deposit(200).deposit(200).withdraw(100).yield_interest().display_accout_info()

account2.deposit(500).deposit(200).withdraw(50).withdraw(25).withdraw(50).withdraw(50).yield_interest().display_accout_info()
