package car.project.padrao_spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "carApiClient", url = "${car.api.url}")

public interface CarAPIClient {

    @GetMapping("/GetAllMakes")
    String getAllMakes(@RequestParam("format") String format);

    @GetMapping("/GetModelsForMakeId")
    String getModelsForMake(@RequestParam("makeId") int makeId, @RequestParam("format") String format);
}
