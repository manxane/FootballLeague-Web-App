<%-- 
    Document   : add_team_details
    Created on : May 12, 2025, 8:49:17 PM
    Author     : Bokamoso Tau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Team Details Page</title>
    </head>
    <body>
        <h1>Add Team Details</h1>
        <p>Please add Team details below:</p>
        <form action="AddTeamServlets.do" method="POST">
            <table>
                <tr>
                    <td>Enter a team id:</td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                <tr>
                    <td>Team name:</td>
                    <td><input type="text" name="teamName" required=""></td>
                </tr>
                <tr>
                    <td>Coach name:</td>
                    <td><input type="text" name="coachName" required=""></td>
                </tr>
                <tr>
                    <td>Enter team points:</td>
                    <td><input type="text" name="points" required=""></td>
                </tr>
                <tr>
                    <td><b>Enter details of top</b></td>
                    <td><b> three players below:</b></td>
                </tr>
                
                <tr>
                    <td>Player1 ID:</td>
                    <td><input type="text" name="playerPosition1" required=""></td>
                </tr>
                <tr>
                    <td>Player1 fullname:</td>
                    <td><input type="text" name="playerName1" required=""></td>
                </tr>
                <tr>
                    <td>Player1 age:</td>
                    <td><input type="text" name="playerAge1" required=""></td>
                </tr>
                <tr>
                    <td>Player2 ID:</td>
                    <td><input type="text" name="playerPosition2" required=""></td>
                </tr>
                <tr>
                    <td>Player2 fullname:</td>
                    <td><input type="text" name="playerName2" required=""></td>
                </tr>
                <tr>
                    <td>Player2 age:</td>
                    <td><input type="text" name="playerAge2" required=""></td>
                </tr>
                <tr>
                    <td>Player3 ID:</td>
                    <td><input type="text" name="playerPosition3" required=""></td>
                </tr>
                <tr>
                    <td>Player3 fullname:</td>
                    <td><input type="text" name="playerName3" required=""></td>
                </tr>
                <tr>
                    <td>Player3 age:</td>
                    <td><input type="text" name="playerAge3" required=""></td>
                </tr>
                             
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD TEAM"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
