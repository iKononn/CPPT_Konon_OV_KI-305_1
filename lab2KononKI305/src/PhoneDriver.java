import javax.management.monitor.Monitor;

// PhoneDriver.java
public class PhoneDriver {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Samsung", "Galaxy S21");
        myPhone.powerOn();
        myPhone.subBatteryCharge(30); // Віднімання заряду батареї (30%)
        PhoneMenu phoneMenu = new PhoneMenu(myPhone);
        phoneMenu.displayMenu();
        Phone phone2 = new Phone();
        phone2.inputPhoneData(); // Введення даних для другого телефону

        Phone phone3 = new Phone(); // Третій телефон через конструктор за замовчуванням

        // Виведення меню для першого телефону
        // Виведення меню для другого телефону
        PhoneMenu phoneMenu2 = new PhoneMenu(phone2);
        System.out.println("\nSecond Phone Menu:");
        phoneMenu2.displayMenu();

        // Зміна параметрів третього телефону
        phone3.displayFullInfo(); // Виведення інформації перед змінами
        phone3.powerOn(); // Увімкнення телефону
        phone3.addBatteryCharge(30); // Додавання заряду батареї (30%)
        phone3.displayFullInfo(); // Виведення інформації після змін

    }
}
