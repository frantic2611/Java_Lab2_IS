package Controller;

import Entities.Cat;
import Entities.Human;
import Service.CatService;
import Service.HumanService;

public class ControllerHuman implements IController<Human> {
    private HumanService humanService;
    @Override
    public void add(Human human) {
        humanService.add(human);
    }

    @Override
    public void delete(Human human){
        humanService.delete(human.getHumanId());
    }
    @Override
    public void update(Human human){
        humanService.update(human);
    }

    @Override
    public Human find(Human human) {
        return humanService.getByID(human.getHumanId());
    }
}
