package cz.osu.student.R19584;

public class Main {

    public static void main(String[] args) {


        Player[] players = new Player[3];
        players[0] = new Player("Martin", "Šimara", "Simik31", "r19584@student.osu.cz", 'S', Gender.MALE, 200, 120, -1, PlayerPosition.SUPPORT, 0.2);
        players[1] = new Player("Tomáš", "Petráček", "Tarc", "tarc@gmai.com", 'T', Gender.MALE, 180, 85, 50, PlayerPosition.ATTACKER, 12.0);
        players[2] = new Player("Michaela", "Fuceková", "Babka", "email@example.com", 'B', Gender.FEMALE, 160, 70, 3, PlayerPosition.DEFENDER, 2.7);

        System.out.println(" --- ALL PLAYERS --- ");

        for(Player p : players)
            System.out.println(p.toString());

        System.out.println(" --- NAME_CONTAINS 'M' FILTER --- ");

        Player[] ret = FilteringManager.applyFilter(players, FilterType.NAME_CONTAINS, "M");

        for(Player p : ret)
            System.out.println(p.toString());

        System.out.println(" --- GENDER_IS 'MALE' FILTER --- ");

        ret = FilteringManager.applyFilter(players, FilterType.GENDER_IS, Gender.MALE);

        for(Player p : ret)
            System.out.println(p.toString());

        System.out.println(" --- POSITION_IS 'ATTACKER' FILTER --- ");

        ret = FilteringManager.applyFilter(players, FilterType.POSITION_IS, PlayerPosition.ATTACKER);

        for(Player p : ret)
            System.out.println(p.toString());

        System.out.println(" --- IS_HIGHER_THAN '170' FILTER --- ");

        ret = FilteringManager.applyFilter(players, FilterType.IS_HIGHER_THAN, 170);

        for(Player p : ret)
            System.out.println(p.toString());

        System.out.println(" --- SKILL_LEVEL_IS_GREATER_THAN '5.0' FILTER --- ");

        ret = FilteringManager.applyFilter(players, FilterType.SKILL_LEVEL_IS_GREATER_THAN, 5.0);

        for(Player p : ret)
            System.out.println(p.toString());
    }
}
