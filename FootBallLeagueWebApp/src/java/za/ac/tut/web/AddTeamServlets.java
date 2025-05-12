/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.TeamFacadeLocal;
import za.ac.tut.enitities.Player;
import za.ac.tut.enitities.Team;

/**
 *
 * @author Bokamoso Tau
 */
public class AddTeamServlets extends HttpServlet {
     @EJB
     private TeamFacadeLocal tfl;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long teamID=Long.parseLong(request.getParameter("id"));
        String teamName=request.getParameter("teamName");
        String coachName=request.getParameter("coachName");
        Long playerPosition1=Long.parseLong(request.getParameter("playerPosition1"));
        String playerName1=request.getParameter("playerName1");
        Integer playeAge1=Integer.parseInt(request.getParameter("playerAge1"));
        
        Long playerPosition2=Long.parseLong(request.getParameter("playerPosition2"));
        String playerName2=request.getParameter("playerName2");
        Integer playeAge2=Integer.parseInt(request.getParameter("playerAge2"));
        
        Long playerPosition3=Long.parseLong(request.getParameter("playerPosition3"));
        String playerName3=request.getParameter("playerName3");
        Integer playeAge3=Integer.parseInt(request.getParameter("playerAge3"));
        
        Integer points=Integer.parseInt(request.getParameter("points"));
        
        Team team=createTeam(teamID,teamName,coachName,playerPosition1,playerName1,playeAge1,playerPosition2,playerName2,playeAge2,playerPosition3,playerName3,playeAge3,points);
        
        tfl.create(team);
        
        RequestDispatcher disp=request.getRequestDispatcher("add_team_outcome.jsp");
        disp.forward(request, response);
    }

    private Team createTeam(Long teamID, String teamName, String coachName, Long playerPosition1, String playerName1, Integer playeAge1, Long playerPosition2, String playerName2, Integer playeAge2, Long playerPosition3, String playerName3, Integer playeAge3,Integer points) {
        Team team=new Team();
        List<Player> players=new ArrayList<>();
        Player player1=new Player();
        Player player2=new Player();
        Player player3=new Player();
        
        player1.setId(playerPosition1);
        player1.setName(playerName1);
        player1.setAge(playeAge1);
        
        player2.setId(playerPosition2);
        player2.setName(playerName2);
        player2.setAge(playeAge2);
        
        player3.setId(playerPosition3);
        player3.setName(playerName3);
        player3.setAge(playeAge3);
        
        players.add(player1);
        players.add(player2);
        players.add(player3);
        
        team.setId(teamID);
        team.setName(teamName);
        team.setCoachName(coachName);
        team.setPlayers(players);
        team.setPoints(points);
        
        
        return team;
        
    }


   

}
