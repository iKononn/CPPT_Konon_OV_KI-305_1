# phone_driver.py
from smart_phone import SmartPhone
from phone_menu import PhoneMenu

if __name__ == "__main__":
    my_phone = SmartPhone("Samsung", "Galaxy S21")
    my_phone.turn_on()
    my_phone.sub_battery_charge(30)
    phone_menu = PhoneMenu(my_phone)
    phone_menu.display_menu()
