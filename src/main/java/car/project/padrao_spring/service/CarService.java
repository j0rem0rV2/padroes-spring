package car.project.padrao_spring.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarAPIClient carAPIClient;

    //@Autowired
    public CarService(CarAPIClient carAPIClient) {
        this.carAPIClient = carAPIClient;
    }

    public String getAllCarMakes() {
        return carAPIClient.getAllMakes("json");
    }

    public String getModelsForMake(int makeId) {
        return carAPIClient.getModelsForMake(makeId, "json");
    }
}
