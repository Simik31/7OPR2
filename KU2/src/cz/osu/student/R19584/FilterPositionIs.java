package cz.osu.student.R19584;

public class FilterPositionIs extends Filter {
    public FilterPositionIs(Object position) {
        super(position);

        if (!(value instanceof PlayerPosition))
            throw new IllegalArgumentException("Filter 'filterPositionIs' requires value to be instance of 'PlayerPosition', '" + value.getClass().getSimpleName() + "' given.");
    }

    @Override
    public boolean accepts(Player player) {
        return player.getPosition() == value;
    }
}
