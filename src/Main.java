public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1 ===");
        boolean clientOS = true;   // Input, true = Android, false = iOS;

        if (clientOS) {
            System.out.println("Определена операционная система на базе Android");
        } else {
            System.out.println("Определена операционная система iOS");
        }

        System.out.println("=== Task 2 ===");
        short clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            if (clientOS) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установка доступна. Нажмите кнопку чтобы загрузить приложение");
        }

        System.out.println("=== Task 3 ===");
        short year = 2021;

        if (year < 1584) {                                    // Checking for the leap-year introduction date.

            System.out.println("Год не является високосным");   // Not passed

        } else if (year % 4 != 0) {                           // Checking for being a multiple of 4.

            System.out.println("Год не является високосным");   // Not passed

        } else if (year % 100 == 0 && year % 400 != 0) {       // Excluding multiples of 100, except for every 400th.

            System.out.println("Год не является високосным");

        } else {

            System.out.println("Год является високосным");      // Passed all checks.
        }

        System.out.println("=== Task 4 ===");
        short deliveryDistance = 195;

        if (deliveryDistance > 100) {
            System.out.println("Доставка на расстояние свыше 100км недоступна");
        } else {

            byte deliveryDuration = 1;
            if (deliveryDistance > 20) {

                deliveryDuration++;
                if (deliveryDistance > 60) {

                    deliveryDuration++;
                }

            }
            System.out.println("Потребуется дней: " + deliveryDuration);
        }

        System.out.println("=== Task 5 ===");

        byte monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Введеный номер не соответствует номеру месяца");
        } else {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - первый месяц года, считается месяцем зимы");
                    break;
                case 2:
                    System.out.println("Февраль - второй месяц года, считается месяцем зимы");
                    break;
                case 3:
                    System.out.println("Март - третий месяц года, считается месяцем весны");
                    break;
                case 4:
                    System.out.println("Апрель - четвертый месяц года, считается месяцем весны");
                    break;
                case 5:
                    System.out.println("Май - пятый месяц года, считается месяцем весны");
                    break;
                case 6:
                    System.out.println("Июнь - шестой месяц года, считается месяцем лета");
                    break;
                case 7:
                    System.out.println("Июль - седьмой месяц года, считается месяцем лета");
                    break;
                case 8:
                    System.out.println("Август - восьмой месяц года, считается месяцем лета");
                    break;
                case 9:
                    System.out.println("Сентябрь - девятый месяц года, считается месяцем осени");
                    break;
                case 10:
                    System.out.println("Октябрь - десятый месяц года, считается месяцем осени");
                    break;
                case 11:
                    System.out.println("Ноябрь - одинадцатый месяц года, считается месяцем осени");
                    break;
                case 12:
                    System.out.println("Декабрь - двенадцатый месяц года, считается месяцем зимы");
                    break;
            }
        }
    }
}