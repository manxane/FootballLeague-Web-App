package za.ac.tut.enitities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.enitities.Player;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T21:02:13")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, String> coachName;
    public static volatile ListAttribute<Team, Player> players;
    public static volatile SingularAttribute<Team, String> name;
    public static volatile SingularAttribute<Team, Long> id;
    public static volatile SingularAttribute<Team, Integer> points;

}