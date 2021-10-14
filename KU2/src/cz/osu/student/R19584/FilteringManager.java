package cz.osu.student.R19584;

import java.util.ArrayList;

public class FilteringManager {
    public static Player[] applyFilter(Player[] players, FilterType filterType, Object value) {
        if (players == null || players.length == 0)
            throw new IllegalArgumentException("Players shall not be empty!");

        if (filterType == null)
            throw new IllegalArgumentException("Filter shall not be empty!");

        if (value == null)
            throw new IllegalArgumentException("Value shall not be empty!");

        ArrayList<Player> ret = new ArrayList<>();
        Filter filter = filterSwitcher(filterType, value);

        for (Player player : players)
            if (filter.accepts(player))
                ret.add(player);

        return ret.toArray(new Player[0]);
    }

    private static Filter filterSwitcher(FilterType filterType, Object value) {
        return switch (filterType) {
            case GENDER_IS -> new FilterGenderIs(value);
            case NAME_CONTAINS -> new FilterNameContains(value);
            case IS_HIGHER_THAN -> new FilterIsHigherThan(value);
            case SKILL_LEVEL_IS_GREATER_THAN -> new FilterSkillLevelIsGreaterThan(value);
            case POSITION_IS -> new FilterPositionIs(value);
            default -> throw new IllegalArgumentException("Filter '" + filterType.toString() + "' doesn't exist or is not yet implemented");
        };
    }
}
