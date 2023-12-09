# messaging.py
class Messaging:
    def __init__(self):
        self.messages = {}

    def add_message(self, phone_number, message):
        self.messages[phone_number] = message
        print("Message sent to", phone_number + ":", message)

    def display_messages(self):
        print("Messages:")
        for phone_number, message in self.messages.items():
            print("To:", phone_number + ",", "Message:", message)
