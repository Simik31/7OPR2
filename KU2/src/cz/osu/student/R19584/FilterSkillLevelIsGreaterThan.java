package cz.osu.student.R19584;

public class FilterSkillLevelIsGreaterThan extends Filter {
    public FilterSkillLevelIsGreaterThan(Object skillLevel) {
        super(skillLevel);

        if (!(value instanceof Double))
            throw new IllegalArgumentException("Filter 'filterSkillLevelIsGreaterThan' requires value to be instance of 'Double', '" + value.getClass().getSimpleName() + "' given.");
    }

    @Override
    public boolean accepts(Player player) {
        return player.getSkillLevel() > (double) value;
    }
}