package Controller;

import Entities.Cat;
import Service.CatService;
import Service.IService;

public class ControllerCat implements IController <Cat> {
    private CatService catService;

    @Override
    public void add(Cat cat) {
        catService.add(cat);
    }

    @Override
    public void delete(Cat cat){
        catService.delete(cat.getCatID());
    }
    @Override
    public void update(Cat cat){
        catService.update(cat);
    }

    @Override
    public Cat find(Cat cat) {
        return catService.getByID(cat.getCatID());
    }
}