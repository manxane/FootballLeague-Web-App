<%-- 
    Document   : get_statistics_outcome
    Created on : May 12, 2025, 10:46:44 PM
    Author     : Bokamoso Tau
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.enitities.Team"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Statistics Outcme Page</title>
    </head>
    <body>
        <h1>Get Statistics Outcome</h1>
        <p>Below is the statistics of the FootBall League:</p>
        <%
            List<Team> teams=(List<Team>)request.getAttribute("teams");
            List<Team> getTeams=(List<Team>)request.getAttribute("getTeamWhoQualifyFinals");
            Team teamWithHighestPoints=(Team)request.getAttribute("teamWithHighestPoints");
            String tHighest=teamWithHighestPoints.getName();
            Team teamWithLowestPoints=(Team)request.getAttribute("teamWithLowestPoints");
            String tLowest=teamWithLowestPoints.getName();
            
        %>
        <h4><b>All the teams in the League:</b></h4>
        <table border="1">
            <tr>
                <th>Team ID</th>
                <th>Team Name</th>
                <th>Points</th>
            </tr>
            <%
                for(int i=0;i<teams.size();i++){
                   Team t=teams.get(i);
                   Long teamId=t.getId();
                   String teamName=t.getName();
                   Integer points=t.getPoints();
                
            %>
            <tr>
                <td><%=teamId%></td>
                <td><%=teamName%></td>
                <td><%=points%></td>
            </tr>
            <%
                }
            %>
        </table>
        <h4><b>The teams that qualify to play finals with 40 points and above:</b></h4>
        <table border="1">
            <tr>
                <th>Team ID</th>
                <th>Team Name</th>
                <th>Points</th>
            </tr>
            <%
                for(int i=0;i<getTeams.size();i++){
                   Team t2=getTeams.get(i);
                   Long teamId=t2.getId();
                   String teamName=t2.getName();
                   Integer points=t2.getPoints();
                
            %>
            <tr>
                <td><%=teamId%></td>
                <td><%=teamName%></td>
                <td><%=points%></td>
            </tr>
            <%
                }
            %>
        </table>
        <p>Team with highest points:<b><%=tHighest%></b></p>
        <p>Team with lowest points:<b><%=tLowest%></b></p>
        
        <p>Please click <a href="menu.html">here</a> to go back to menu page or <a href="index.html">here</a> to go back to home page</p>
    </body>
</html>
