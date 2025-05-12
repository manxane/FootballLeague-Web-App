/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.enitities.Player;

/**
 *
 * @author Bokamoso Tau
 */
@Local
public interface PlayerFacadeLocal {

    void create(Player player);

    void edit(Player player);

    void remove(Player player);

    Player find(Object id);

    List<Player> findAll();

    List<Player> findRange(int[] range);

    int count();
    
}
