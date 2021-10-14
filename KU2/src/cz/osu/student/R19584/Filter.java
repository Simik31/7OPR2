package cz.osu.student.R19584;

public abstract class Filter {
    protected Object value;

    public Filter(Object value) {
        this.value = value;
    }

    public abstract boolean accepts(Player player);
}
