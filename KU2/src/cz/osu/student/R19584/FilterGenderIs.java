package cz.osu.student.R19584;

public class FilterGenderIs extends Filter {
    public FilterGenderIs(Object gender) {
        super(gender);

        if (!(value instanceof Gender))
            throw new IllegalArgumentException("Filter 'filterGenderIs' requires value to be instance of 'Gender', '" + value.getClass().getSimpleName() + "' given.");
    }

    @Override
    public boolean accepts(Player player) {
        return player.getGender() == value;
    }
}