package cz.osu.student.R19584;

public class FilterIsHigherThan extends Filter {
    public FilterIsHigherThan(Object height) {
        super(height);

        if (!(value instanceof Integer))
            throw new IllegalArgumentException("Filter 'filterIsHigherThan' requires value to be instance of 'Integer', '" + value.getClass().getSimpleName() + "' given.");
    }

    @Override
    public boolean accepts(Player player) {
        return player.getHeight() > (int) value;
    }
}