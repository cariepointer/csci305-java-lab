package csci305.javalab;

/**
* Class Outcome takes in two strings: the name of player one's move, and the name
* of player two's move. It compares the two moves and generates a string detailing
* which move beat the other (or tie) and generates an outcome string with "Win",
* "Lose", or "Tie" which is the outcome for player 1 (with move e1)
*/
public class Outcome {

  private String outcome_string, outcome_decision;

  public Outcome (String e1, String e2) {
    outcome_decision = "Lose"; // Default outcome to "Lose"
    if (e1 == e2) { // If strings are the same, it is a tie
      outcome_string = e1 + " equals " + e2;
      outcome_decision = "Tie";
    }
    else { //Compare moves to determine winner. outcome_decision returns outcome of Player 1
      if (e1 == "Scissors" && e2 == "Paper" || e2 == "Scissors" && e1 == "Paper") {
        outcome_string = "Scissors cuts Paper";
        if (e1 == "Scissors") outcome_decision = "Win"; // If player one has Scissors, result is "Win"
      }
      else if (e1 == "Paper" && e2 == "Rock" || e2 == "Paper" && e1 == "Rock") {
        outcome_string = "Paper covers Rock";
        if (e1 == "Paper") outcome_decision = "Win"; // If player one has Paper, result is "Win"
      }
      else if (e1 == "Rock" && e2 == "Lizard" || e2 == "Rock" && e1 == "Lizard") {
        outcome_string = "Rock crushes Lizard";
        if (e1 == "Rock") outcome_decision = "Win"; // If player one has Rock, result is "Win"
      }
      else if (e1 == "Lizard" && e2 == "Spock" || e2 == "Lizard" && e1 == "Spock") {
        outcome_string = "Lizard Poisons Spock";
        if (e1 == "Lizard") outcome_decision = "Win"; // If player one has Lizard, result is "Win"
      }
      else if (e1 == "Spock" && e2 == "Scissors" || e2 == "Spock" && e1 == "Scissors") {
        outcome_string = "Spock smashes Scissors";
        if (e1 == "Spock") outcome_decision = "Win"; // If player one has Spock, result is "Win"
      }
      else if (e1 == "Scissors" && e2 == "Lizard" || e2 == "Scissors" && e1 == "Lizard") {
        outcome_string = "Scissors decapitates Lizard";
        if (e1 == "Scissors") outcome_decision = "Win"; // If player one has Scissors, result is "Win"
      }
      else if (e1 == "Lizard" && e2 == "Paper" || e2 == "Lizard" && e1 == "Paper") {
        outcome_string = "Lizard eats Paper";
        if (e1 == "Lizard") outcome_decision = "Win"; // If player one has Lizard, result is "Win"
      }
      else if (e1 == "Paper" && e2 == "Spock" || e2 == "Paper" && e1 == "Spock") {
        outcome_string = "Paper disproves Spock";
        if (e1 == "Paper") outcome_decision = "Win"; // If player one has Paper, result is "Win"
      }
      else if (e1 == "Spock" && e2 == "Rock" || e2 == "Spock" && e1 == "Rock") {
        outcome_string = "Spock vaporizes Rock";
        if (e1 == "Spock") outcome_decision = "Win"; // If player one has Spock, result is "Win"
      }
      else if (e1 == "Rock" && e2 == "Scissors" || e2 == "Rock" && e1 == "Scissors") {
        outcome_string = "Rock crushes Scissors";
        if (e1 == "Rock") outcome_decision = "Win"; // If player one has Rock, result is "Win"
      }
      else { //Default if there is an combination missing
        outcome_string = "Null";
        outcome_decision = "Null";
      }
    }
  }

  public String getOutcomeString() {
    return outcome_string;
  }

  public String getOutcomeDecision() {
    return outcome_decision;
  }

  // Print both outcome_string and outcome_decision for debugging purposes
  public String toString() {
    return outcome_string + " -- " + outcome_decision;
  }

}
