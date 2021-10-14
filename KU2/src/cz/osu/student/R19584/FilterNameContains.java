package cz.osu.student.R19584;

public class FilterNameContains extends Filter {
    public FilterNameContains(Object name_segment) {
        super(name_segment);

        if (!(name_segment instanceof String))
            throw new IllegalArgumentException("Filter 'FilterNameContains' requires value to be instance of 'String', '" + name_segment.getClass().getSimpleName() + "' given.");
    }

    @Override
    public boolean accepts(Player player) {
        return player.getName().contains((String) value);
    }
}