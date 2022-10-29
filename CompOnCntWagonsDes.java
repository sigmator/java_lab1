import java.util.Comparator;

//Компаратор, сравнивающий экземпляры класса CargoRoutes в порядке убывания по значению cnt_wagons (кол-во вагонов)

public class CompOnCntWagonsDes implements Comparator<CargoRoutes> {
    @Override
    public int compare(CargoRoutes Route1, CargoRoutes Route2) {
        if(Route1.getCnt_wagons() != Route2.getCnt_wagons())
            return Route2.getCnt_wagons() - Route1.getCnt_wagons();
        else 
            return 1; 
    }
}
