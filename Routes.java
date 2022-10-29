
//Абстрактный класс Routes необходим для того, чтобы от него наследовались классы
//PassangerRoutes (пассажирские рейсы) и CargoRoutes (грузовые рейсы)

public abstract class Routes {
    protected int route_id; //номер рейса
    protected int train_id; //номер поезда
    protected int path; //путь прибытия/отбытия
    protected String depature_city; //город отбытия
    protected String arrival_city; //город прибытия

    protected int depature_time_hours; //время отбытия (часы)
    protected int depature_time_min; //время отбытия (минуты)

    protected int arrival_time_hours; //время прибытия (часы)
    protected int arrival_time_min; //время прибытия (минуты)

    protected int duration_hours; //время в пути (часы)
    protected int duration_min; //время в пути (минуты)

    public Routes(){} //конструктор без параметров

    public Routes(int route_id, int train_id, int path, String depature_city, String arrival_city, 
                    int depature_time_hours, int depature_time_min, int arrival_time_hours, int arrival_time_min,
                    int duration_hours, int duration_min) { //конструктор с параметрами
        this.route_id = route_id;
        this.train_id = train_id;
        this.path = path;
        this.depature_city = depature_city;
        this.arrival_city = arrival_city;

        this.depature_time_hours = depature_time_hours;
        this.depature_time_min = depature_time_min;

        this.arrival_time_hours = arrival_time_hours;
        this.arrival_time_min = arrival_time_min;

        this.duration_hours = duration_hours;
        this.duration_min = duration_min;
    }

    public Routes(Routes Route) { //конструктор копирования 
        this.route_id = Route.route_id;
        this.train_id = Route.train_id;
        this.path = Route.path;
        this.depature_city = Route.depature_city;
        this.arrival_city = Route.arrival_city;

        this.depature_time_hours = Route.depature_time_hours;
        this.depature_time_min = Route.depature_time_min;

        this.arrival_time_hours = Route.arrival_time_hours;
        this.arrival_time_min = Route.arrival_time_min;

        this.duration_hours = Route.duration_hours;
        this.duration_min = Route.duration_min;
    }

    //секция get/set 

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id; 
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id; 
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path; 
    }

    public String getDepature_city() {
        return depature_city;
    }

    public void setDepature_city(String depature_city) {
        this.depature_city = depature_city; 
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public int getDepature_time_hours() {
        return depature_time_hours;
    }

    public void setDepature_time_hours(int depature_time_hours) {
        this.depature_time_hours = depature_time_hours;
    }

    public int getDepature_time_min() {
        return depature_time_min;
    }

    public void setDepature_time_min(int depature_time_min) {
        this.depature_time_min = depature_time_min;
    }

    public int getArrival_time_hours() {
        return arrival_time_hours;
    }

    public void setArrival_time_hours(int arrival_time_hours) {
        this.arrival_time_hours = arrival_time_hours;
    }

    public int getArrival_time_min() {
        return arrival_time_min;
    }

    public void setArrival_time_min(int arrival_time_min) {
        this.arrival_time_min = arrival_time_min;
    }

    public int getDuration_hours() {
        return duration_hours;
    }

    public void setDuration_hours(int duration_hours) {
        this.duration_hours = duration_hours;
    }

    public int getDuration_min() {
        return duration_hours;
    }

    public void setDuration_min(int duration_min) {
        this.duration_min = duration_min;
    }
}
