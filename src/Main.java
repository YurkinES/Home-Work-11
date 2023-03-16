import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 3824;
        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        int deliveryDistance = 56;
        leapYearVerification(year);
        osUpdate(clientOS, clientDeviceYear);
        cardDelivery(deliveryDistance);
        int cardDeliveryDays = cardDelivery(deliveryDistance);
        System.out.println("Требуется " + cardDeliveryDays + " дня(ень) доставки");
    }

    public static void leapYearVerification(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0) {
            System.out.println("Год " + leapYear + " является високосным");
        } else if (leapYear % 400 == 0) {
            System.out.println("Год " + leapYear + " является високосным");
        } else {
            System.out.println("Год " + leapYear + " не является високосным");
        }
    }

    public static void osUpdate(int clientOS, int clientDeviceYear) {
        int iOS = 0;
        int androidOS = 1;
        if (clientOS == iOS && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == androidOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == androidOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int cardDelivery(int Distance) {
        int daysDelivery = 0;
        if (Distance < 20) {
            daysDelivery = daysDelivery + 1;
        } else if (Distance >= 20 && Distance < 60){
            daysDelivery = daysDelivery + 2;
        } else if (Distance >= 60 && Distance <= 100) {
            daysDelivery = daysDelivery + 3;
        } else {
            throw new RuntimeException("Свыше 100 км доставка не производится");
        }
        return daysDelivery;
    }
}
