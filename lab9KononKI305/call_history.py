# call_history.py
class CallHistory:
    def __init__(self):
        self.call_history = []

    def add_call(self, phone_number):
        self.call_history.append(phone_number)
        print("Call added to history:", phone_number)

    def display_call_history(self):
        print("Call History:")
        for call in self.call_history:
            print(call)
