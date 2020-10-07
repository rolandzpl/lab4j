package useCases;

import com.lithium.demo.services.Cat;
import com.lithium.demo.services.CatService;

public class EnlistCats {

    private CatService catService;

    public EnlistCats(CatService catService) {
        this.catService = catService;
    }

    public Cat[] getCats() {
        return catService.getCats();
    }
}
