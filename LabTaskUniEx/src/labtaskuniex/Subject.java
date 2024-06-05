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

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(String message);
}


