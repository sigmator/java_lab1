import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Создадим экземпляры класса PassengerRoutes
        System.out.println("\n" + "PassengerRoutes");
        //Проверка конструктора с параметрами
        System.out.println("\n" + "Конструктор с параметом");
        PassengerRoutes Route1 = new PassengerRoutes(1, 1, 1, "Yaroslavl", "Moscow", 12, 30, 15, 40, 3, 10, 300, 10); 
        System.out.println("\n" + Route1);
        //Проверка конструктора копирования
        System.out.println("\n" + "Конструктор копирования");
        PassengerRoutes Route2 = new PassengerRoutes(Route1);
        System.out.println("\n" + Route2);
        //Проверка set
        System.out.println("\n" + "Проверка set");
        Route2.setRoute_id(2);
        Route2.setPath(2);
        Route2.setArrival_city("Saint-Petersburg");
        Route2.setTrain_id(2);
        Route2.setArrival_time_hours(20);
        Route2.setArrival_time_min(30);
        Route2.setDuration_hours(8);
        Route2.setDuration_min(0);
        System.out.println("\n" + Route2);
        //Проверка get
        System.out.println("\n" + "Проверка get");
        System.out.println("\n" + "Route2 Arrival City: " + Route2.getArrival_city());
        System.out.println("\n" + "Route2 Passengers: " + Route2.getPassengers());
        //Создадим экземляры класса CargoRoutes
        System.out.println("\n" + "CargoRoutes");
        //Проверка конструктора с параметрами
        System.out.println("\n" + "Конструктор с параметром");
        CargoRoutes Route3 = new CargoRoutes(3, 3, 3, "Yaroslavl", "Tver", 10, 00, 14, 00, 4, 0, 2, 3, 4, 5, 6, 7);
        CargoRoutes Route5 = new CargoRoutes(5, 5, 6, "Yaroslavl", "Tver", 10, 00, 14, 00, 4, 0, 23, 3, 4, 5, 6, 7);
        CargoRoutes Route6 = new CargoRoutes(6, 6, 6, "Yaroslavl", "Tver", 10, 00, 14, 00, 4, 0, 20, 3, 4, 5, 6, 7);
        System.out.println("\n" + Route3);
        //Проверка конструктора копирования
        System.out.println("\n" + "Конструктор копирования");
        CargoRoutes Route4 = new CargoRoutes(Route3);
        System.out.println("\n" + Route4);
        //Проверка set
        System.out.println("\n" + "Проверка set");
        Route4.setRoute_id(4);
        Route4.setPath(4);
        Route4.setArrival_city("Saint-Petersburg");
        Route4.setTrain_id(4);
        Route4.setArrival_time_hours(20);
        Route4.setArrival_time_min(30);
        Route4.setDuration_hours(10);
        Route4.setDuration_min(0);
        System.out.println("\n" + Route4);
        //При изменении кол-во вагонов происходит пересчет общего кол-ва вагонов
        System.out.println("\n" + "Проверка пересчета cnt_wagons");
        Route4.setCnt_open_wagons(0);
        Route4.setCnt_tank_wagons(0);
        System.out.println("\n" + Route4);
        //Проверка get
        System.out.println("\n" + "Проверка get");
        System.out.println("\n" + "Route4 Depature City: " + Route4.getArrival_city());
        System.out.println("\n" + "Route4 CNT Wagons: " + Route4.getCnt_wagons());

        //Проверка компаратора

        System.out.println("\n" + "TreeSet и компаратор" + "\n");

        System.out.println("TreeSet по убыванию" + "\n");
        CompOnCntWagonsDes compOnCntWagons = new CompOnCntWagonsDes(); //Создаем экземпляр компаратора 
        TreeSet<CargoRoutes> cargoRoutes = new TreeSet<>(compOnCntWagons); //Создаем TreeSet с экземпляром компоратора 
        //Добавляем элементы в TreeSet
        cargoRoutes.add(Route3);
        cargoRoutes.add(Route4);
        cargoRoutes.add(Route5);
        cargoRoutes.add(Route6);
        //Вывод
        for(CargoRoutes route : cargoRoutes) {
            System.out.println(route + "\n");
        }

        System.out.println("TreeSet по возрастанию" + "\n");
        CompOnCntWagonsAsc compOnCntWagonsAsc = new CompOnCntWagonsAsc(); //Создаем экземпляр компаратора 
        TreeSet<CargoRoutes> cargoRoutes2 = new TreeSet<>(compOnCntWagonsAsc); //Создаем TreeSet с экземпляром компоратора 
        //Добавляем элементы в TreeSet
        cargoRoutes2.add(Route3);
        cargoRoutes2.add(Route4);
        cargoRoutes2.add(Route5);
        cargoRoutes2.add(Route6);
        //Вывод
        for(CargoRoutes route : cargoRoutes2) {
            System.out.println(route + "\n");
        }
    }
}