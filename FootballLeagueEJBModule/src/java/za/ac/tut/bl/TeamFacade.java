/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.enitities.Team;

/**
 *
 * @author Bokamoso Tau
 */
@Stateless
public class TeamFacade extends AbstractFacade<Team> implements TeamFacadeLocal {

    @PersistenceContext(unitName = "FootballLeagueEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeamFacade() {
        super(Team.class);
    }
    @Override
    public List<Team> getTeamsThatQualifyToPlayAtFinals() {
        Query query=em.createQuery("SELECT t FROM Team t WHERE t.points >=40");
        List<Team> teams=query.getResultList();
        return teams;
    }

    @Override
    public Team getTeamWithHighestPoints() {
        Query query=em.createQuery("SELECT t FROM Team t WHERE t.points=(SELECT MAX(t2.points) FROM Team t2)");
        Team team=(Team)query.getSingleResult();
        return team;
    }

    @Override
    public Team getTeamWithLowestPoints() {
        Query query=em.createQuery("SELECT t FROM Team t WHERE t.points=(SELECT MIN(t2.points) FROM Team t2)");
        Team team=(Team)query.getSingleResult();
        return team;
    }
    
}
