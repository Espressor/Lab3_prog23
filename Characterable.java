public interface Characterable {
    void setGender(Gender gender);
    Gender getGender();

    enum Gender {
        NONE,
        MALE,
        FEMALE,
        THEY
    }
}
