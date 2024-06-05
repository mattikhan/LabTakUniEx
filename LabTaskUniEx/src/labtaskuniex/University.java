/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtaskuniex;

/**
 *
 * @author sp21-bse-030
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class University implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
