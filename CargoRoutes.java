//CargoRoutes - грузовые рейсы 

public class CargoRoutes extends Routes {
    private int cnt_opening_roof_wagons; //кол-во вагонов с открывающиейся крышей
    private int cnt_open_wagons; //кол-во открытых вагонов
    private int cnt_covered_wagons; //кол-во закрытых вагонов 
    private int cnt_refrigerated_vans; //кол-во вагонов рефрижератор 
    private int cnt_tank_wagons; //кол-во вагонов цистрен
    private int cnt_spine_wagons; //кол-во вагонов платформ
    private int cnt_wagons; //общее кол-во вагонов

    public CargoRoutes() { //конструктор без параметров 
        super(); //инициализация элементов родительского класса 
    }

    public CargoRoutes(int route_id, int train_id, int path, String depature_city, String arrival_city, int depature_time_hours, int depature_time_min, 
                        int arrival_time_hours, int arrival_time_min, int duration_hours, int duration_min, int cnt_opening_roof_wagons, int cnt_open_wagons, 
                        int cnt_covered_wagons, int cnt_refrigerated_vans, int cnt_tank_wagons, int cnt_spine_wagons) { //конструктор с параметрами
        super(route_id, train_id, path, depature_city, arrival_city, depature_time_hours, depature_time_min, arrival_time_hours, arrival_time_min, duration_hours, duration_min);
        this.cnt_opening_roof_wagons = cnt_opening_roof_wagons;
        this.cnt_open_wagons = cnt_open_wagons;
        this.cnt_covered_wagons = cnt_covered_wagons;
        this.cnt_refrigerated_vans = cnt_refrigerated_vans;
        this.cnt_tank_wagons = cnt_tank_wagons;
        this.cnt_spine_wagons = cnt_spine_wagons;
        this.cnt_wagons = cnt_opening_roof_wagons + cnt_open_wagons + cnt_covered_wagons + cnt_refrigerated_vans + cnt_tank_wagons + cnt_spine_wagons;
    }

    public CargoRoutes(CargoRoutes Route) { //конструктор копирования
        
        super(Route.route_id, Route.train_id, Route.path, Route.depature_city, Route.arrival_city, 
                Route.depature_time_hours, Route.depature_time_min, Route.arrival_time_hours, Route.arrival_time_min, Route.duration_hours, Route.duration_min);
        this.cnt_opening_roof_wagons = Route.cnt_opening_roof_wagons;
        this.cnt_open_wagons = Route.cnt_open_wagons;
        this.cnt_covered_wagons = Route.cnt_covered_wagons;
        this.cnt_refrigerated_vans = Route.cnt_refrigerated_vans;
        this.cnt_tank_wagons = Route.cnt_tank_wagons;
        this.cnt_spine_wagons = Route.cnt_spine_wagons;
        this.cnt_wagons = Route.cnt_opening_roof_wagons + Route.cnt_open_wagons + Route.cnt_covered_wagons + Route.cnt_refrigerated_vans + Route.cnt_tank_wagons + Route.cnt_spine_wagons;
    }

    //секция set/get

    public int getCnt_opening_roof_wagons() {
        return cnt_opening_roof_wagons;
    }

    public void setCnt_opening_roof_wagons(int cnt_opening_roof_wagons) {
        this.cnt_opening_roof_wagons = cnt_opening_roof_wagons;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_open_wagons() {
        return cnt_open_wagons;
    }

    public void setCnt_open_wagons(int cnt_open_wagons) {
        this.cnt_open_wagons = cnt_open_wagons;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_covered_wagons() {
        return cnt_covered_wagons;
    }

    public void setCnt_covered_wagons(int cnt_covered_wagons) {
        this.cnt_covered_wagons = cnt_covered_wagons;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_refrigerated_vans() {
        return cnt_refrigerated_vans;
    }

    public void setCnt_refrigerated_vans(int cnt_refrigerated_vans) {
        this.cnt_refrigerated_vans = cnt_refrigerated_vans;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_tank_wagons() {
        return cnt_tank_wagons;
    }

    public void setCnt_tank_wagons(int cnt_tank_wagons) {
        this.cnt_tank_wagons = cnt_tank_wagons;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_spine_wagons() {
        return cnt_spine_wagons;
    }

    public void setCnt_spine_wagons(int cnt_spine_wagons) {
        this.cnt_spine_wagons = cnt_spine_wagons;
        this.cnt_wagons = this.cnt_opening_roof_wagons + this.cnt_open_wagons + this.cnt_covered_wagons + this.cnt_refrigerated_vans + this.cnt_tank_wagons + this.cnt_spine_wagons;
    }

    public int getCnt_wagons() {
        return cnt_wagons;
    }

    @Override
    public String toString(){
        return "CargoRoute{route_id = " + route_id +
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
                "), cnt_opening_roof_wagons = " + cnt_opening_roof_wagons + 
                ", cnt_open_wagons = " + cnt_open_wagons +
                ", cnt_covered_wagons = " + cnt_covered_wagons + 
                ", cnt_refrigerated_vans = " + cnt_refrigerated_vans +
                ", cnt_tank_wagons = " + cnt_tank_wagons + 
                ", cnt_spine_wagons = " + cnt_spine_wagons +
                ", cnt_wagons = " + cnt_wagons + "}";
    }

}
