/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.TeamFacadeLocal;
import za.ac.tut.enitities.Team;

/**
 *
 * @author Bokamoso Tau
 */
public class RemoveTeamServlet extends HttpServlet {
     @EJB
     private TeamFacadeLocal tfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long teamId=Long.parseLong(request.getParameter("teamID"));
        Team team=tfl.find(teamId);
        tfl.remove(team);
        RequestDispatcher disp=request.getRequestDispatcher("remove_team_outcome.jsp");
        disp.forward(request, response);
        
    }

    
}
