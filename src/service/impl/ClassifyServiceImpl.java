package service.impl;

import Constants.ClassifyContants;
import model.Car;
import service.ClassifyService;

public class ClassifyServiceImpl implements ClassifyService {
    @Override
    public String classifyCar(Car car) {
        if (car.getEngine().getProductCode().toLowerCase().contains("high-")) {
            return ClassifyContants.CAO_CAP;
        }else if (car.getEngine().getProductCode().toLowerCase().contains("medium-")){
            return ClassifyContants.TRUNG_CAP;
        }else if (car.getEngine().getProductCode().toLowerCase().contains("low-")){
            return ClassifyContants.GIA_RE;
        }else return ClassifyContants.CHUA_XAC_DINH;
    }
}
