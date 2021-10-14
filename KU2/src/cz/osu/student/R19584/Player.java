package cz.osu.student.R19584;

public class Player {
    private String name, surname, nick, email;
    private Character oneCharIcon;
    private Gender gender;
    private int height, weight, skillLevel;
    private PlayerPosition position;
    private double credit;

    public Player(String name, String surname, String nick, String email, Character oneCharIcon, Gender gender, int height, int weight, int skillLevel, PlayerPosition position, double credit) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.email = email;
        this.oneCharIcon = oneCharIcon;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.skillLevel = skillLevel;
        this.position = position;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getOneCharIcon() {
        return oneCharIcon;
    }

    public void setOneCharIcon(Character oneCharIcon) {
        this.oneCharIcon = oneCharIcon;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Player " + getName() + " '" + getNick() + "' " + getSurname() + ":\n" +
                "\tGender: " + getGender().toString() + "\n" +
                "\tIcon: " + getOneCharIcon() + "\n" +
                "\tPosition: " + getPosition() + "\n" +
                "\tHeight: " + getHeight() + "\n" +
                "\tWeight: " + getWeight() + "\n" +
                "\tSkill Level: " + getSkillLevel() + "\n" +
                "\tCredit: " + getCredit() + "\n" +
                "\tEmail: " + getEmail() + "\n";
    }
}
