//PassengerRoutes - пассажирские рейсы

public class PassengerRoutes extends Routes {
    private int passengers; //кол-во пассажиров
    private int cnt_wagons; //кол-во вагонов

    public PassengerRoutes() { //конструктор без параметров 
        super(); //инициализация элементов родительского класса 
    }

    public PassengerRoutes(int route_id, int train_id, int path, String depature_city, String arrival_city, int depature_time_hours, int depature_time_min,
                            int arrival_time_hours, int arrival_time_min, int duration_hours, int duration_min, int passengers, int cnt_wagons) { //конструктор c параметрами
        super(route_id, train_id, path, depature_city, arrival_city, depature_time_hours, depature_time_min, arrival_time_hours, arrival_time_min, duration_hours, duration_min); //инициализация элементов родительского класса
        this.passengers = passengers;
        this.cnt_wagons = cnt_wagons;
    }

    public PassengerRoutes(PassengerRoutes Route) { //конструктор копирования
        super(Route.route_id, Route.train_id, Route.path, Route.depature_city, Route.arrival_city, Route.depature_time_hours, Route.depature_time_min,
                Route.arrival_time_hours, Route.arrival_time_min, Route.duration_hours, Route.duration_min); //инициализация элементов родительского класса
        this.passengers = Route.passengers;
        this.cnt_wagons = Route.cnt_wagons;
    }

    //секция get/set

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCnt_wagons() {
        return passengers;
    }

    public void setCnt_wagons(int cnt_wagons) {
        this.cnt_wagons = cnt_wagons;
    }

    @Override
    public String toString(){
        return "PassengerRoute{route_id = " + route_id +
                ", train_id = " + train_id +
                ", path = " + path + 
                ", depature_city = " + depature_city + 
                ", arrival_city = " + arrival_city + 
                ", depature_time = (Hours = " + depature_time_hours +
                ", Minutes = " + depature_time_min +
                "), arrival_time = (Hours = " + arrival_time_hours +
                ", Minutes = " + arrival_time_min +
                "), duration = (Hours = " + duration_hours + 
                ", Minutes = " + duration_min + 
                "), passengers = " + passengers +
                ", cnt_wagons = " + cnt_wagons + "}";
    }

}
