package hexlet.code;

import hexlet.code.games.Even;

public interface GameRound {
    String getRules();
    String getQuestion();
    String getCorrectAnswer();
    boolean isValidInput(String input);


}
