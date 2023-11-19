public enum Emotion {
    NONE,
    EMOTIONLESS,
    SERIOUS,
    JOKING,
    SAD,
    HAPPY,
    TIRED,
    BORED,
    INTERESTED,
    THOUGHTFUL,
    FRIGHTENED;

    public static String getString(Emotion emotion) {
        String result = "";
        switch (emotion) {
            case NONE -> result = "";
            case EMOTIONLESS -> result = " emotionless";
            case SERIOUS -> result = " seriously";
            case JOKING -> result = " joking";
            case SAD -> result = " sadly";
            case HAPPY -> result = " happily";
            case TIRED -> result = " tired";
            case BORED -> result = " bored";
            case INTERESTED -> result = " interested";
            case THOUGHTFUL -> result = " thoughtfully";
            case FRIGHTENED -> result = " frightened";
        }
        return result;
    }
}
