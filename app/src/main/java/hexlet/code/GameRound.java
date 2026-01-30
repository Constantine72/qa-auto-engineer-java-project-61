package hexlet.code;

public interface GameRound {
    String getRules();
    String getQuestion();
    String getCorrectAnswer();
    boolean isValidInput(String input);


}
