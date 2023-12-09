# smart_phone.py
from phone import Phone
from internet_connectable import InternetConnectable
from call_history import CallHistory

class SmartPhone(Phone):


    def __init__(self, brand="Unknown", model="Unknown"):
        super().__init__(brand, model)
        self.internet_connected = False

    def connect_to_internet(self):
        if self.is_turned_on():
            print("Connecting to the Internet...")
            self.internet_connected = True
        else:
            print("Cannot connect to the Internet. Phone is powered off.")

    def make_call(self, phone_number):
        if self.internet_connected:
            super().make_call(phone_number)
        else:
            print("Cannot make a call. No Internet connection.")

    def send_message(self, phone_number, message):
        if self.internet_connected:
            super().send_message(phone_number, message)
        else:
            print("Cannot send a message. No Internet connection.")

    def supports_internet(self):
        return True