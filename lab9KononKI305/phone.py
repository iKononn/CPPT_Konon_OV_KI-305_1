# phone.py
from call_history import CallHistory
from messaging import Messaging

class Phone:
    def __init__(self, brand="Unknown", model="Unknown"):
        self.brand = brand
        self.model = model
        self.battery_level = 50
        self.is_turned_on = False
        self.call_history = CallHistory()
        self.messaging = Messaging()

    def display_full_info(self):
        print("Phone Information:")
        print("Brand:", self.brand)
        print("Model:", self.model)
        print("Battery Level:", self.battery_level, "%")
        print("Power On:", "Yes" if self.is_turned_on else "No")

    def input_phone_data(self):
        self.brand = input("Enter brand: ")
        self.model = input("Enter model: ")

    def add_battery_charge(self, charge):
        if self.is_turned_on:
            self.battery_level = min(100, self.battery_level + charge)
            print("Battery charged. Current battery level:", self.battery_level, "%")
        else:
            print("Cannot charge the battery. Phone is turned off.")

    def sub_battery_charge(self, charge):
        if self.is_turned_on:
            self.battery_level = max(0, self.battery_level - charge)
            print("Battery uncharged. Current battery level:", self.battery_level, "%")
        else:
            print("Cannot uncharge the battery. Phone is turned off.")

    def turn_on(self):
        print(self.brand, self.model, "is powering on.")
        self.is_turned_on = True

    def power_off(self):
        print(self.brand, self.model, "is powering off.")
        self.is_turned_on = False

    def is_turned_on(self):
        return self.is_turned_on

    def make_call(self, phone_number):
        if self.is_turned_on:
            print("Calling", phone_number, "...")
            self.call_history.add_call(phone_number)
            self.decrease_battery_level()
        else:
            print("Phone is powered off. Cannot make a call.")

    def receive_call(self, phone_number):
        if self.is_turned_on:
            print("Incoming call from", phone_number)
            self.call_history.add_call(phone_number)
            self.decrease_battery_level()
        else:
            print("Phone is powered off. Cannot receive a call.")

    def send_message(self, phone_number, message):
        if self.is_turned_on:
            print("Sending message to", phone_number + ":", message)
            self.messaging.add_message(phone_number, message)
            self.decrease_battery_level()
        else:
            print("Phone is powered off. Cannot send a message.")

    def check_battery_level(self):
        return self.battery_level

    def decrease_battery_level(self):
        self.battery_level = max(0, self.battery_level - 5)
        print("Battery level:", self.battery_level, "%")

    def display_call_history(self):
        self.call_history.display_call_history()

    def display_messages(self):
        self.messaging.display_messages()

    def make_call_user_input(self):
        if self.is_turned_on:
            phone_number = input("Enter phone number to call: ")
            print("Calling", phone_number, "...")
            self.call_history.add_call(phone_number)
            self.decrease_battery_level()
        else:
            print("Phone is powered off. Cannot make a call.")

    def send_message_user_input(self):
        if self.is_turned_on:
            phone_number = input("Enter phone number to send a message: ")
            message = input("Enter message: ")
            print("Sending message to", phone_number + ":", message)
            self.messaging.add_message(phone_number, message)
            self.decrease_battery_level()
        else:
            print("Phone is powered off. Cannot send a message.")

    def supports_internet(self):
        raise NotImplementedError("Subclasses must implement this method")
