
package com.example.SmartCity;

import com.example.SmartCity.CityInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @GetMapping("/info")
    public CityInfo getCityInfo() {
        CityInfo cityInfo = new CityInfo();
        cityInfo.setName("Example City");
        cityInfo.setDescription("A wonderful city!");
        cityInfo.setPopulation(1000000);
        return cityInfo;
    }
}
