package com.netcracker.zoo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zoo {
    List<InterfaceAnimal> animals;
    Map <InterfaceAnimal,String> nutrition;
    Set<InterfaceAnimal> kind;

    public Zoo() {

    }

    public Zoo(List<InterfaceAnimal> animals, Map<InterfaceAnimal, String> nutrition, Set<InterfaceAnimal> kind) {
        this.animals = animals;
        this.nutrition = nutrition;
        this.kind = kind;
    }

    public List<InterfaceAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<InterfaceAnimal> animals) {
        this.animals = animals;
    }

    public Map<InterfaceAnimal, String> getNutrition() {
        return nutrition;
    }

    public void setNutrition(Map<InterfaceAnimal, String> nutrition) {
        this.nutrition = nutrition;
    }

    public Set<InterfaceAnimal> getKind() {
        return kind;
    }

    public void setKind(Set<InterfaceAnimal> kind) {
        this.kind = kind;
    }


}


