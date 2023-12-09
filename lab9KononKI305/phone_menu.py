# phone_menu.py
class PhoneMenu:
    def __init__(self, phone):
        self.phone = phone

    def display_menu(self):
        choice = 0

        while choice != 6:
            print("\nMenu:")
            print("1. Make a call")
            print("2. Send a message")
            print("3. Display call history")
            print("4. Display messages")
            print("5. Display full phone information")
            print("6. Power off")

            try:
                choice = int(input("Enter your choice (1-6): "))
                if choice == 1:
                    self.phone.make_call_user_input()
                elif choice == 2:
                    self.phone.send_message_user_input()
                elif choice == 3:
                    self.phone.display_call_history()
                elif choice == 4:
                    self.phone.display_messages()
                elif choice == 5:
                    self.phone.display_full_info()
                elif choice == 6:
                    self.phone.power_off()
                else:
                    print("Invalid choice. Please enter a number between 1 and 6.")
            except ValueError:
                print("Invalid input. Please enter a valid number.")
