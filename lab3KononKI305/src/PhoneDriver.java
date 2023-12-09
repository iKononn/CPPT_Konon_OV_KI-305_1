// PhoneDriver.java
public class PhoneDriver {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung", "Galaxy S21");
        myPhone.powerOn();
        myPhone.subBatteryCharge(30);

        PhoneMenu phoneMenu = new PhoneMenu(myPhone);
        phoneMenu.displayMenu();
    }
}