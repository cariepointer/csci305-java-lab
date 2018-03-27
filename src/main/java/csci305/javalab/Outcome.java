package csci305.javalab;

public class Outcome {

  private String outcome_string, outcome_decision;

  public Outcome (String e1, String e2) {
    outcome_decision = "Lose";
    if (e1 == e2) {
      outcome_string = e1 + " equals " + e2;
      outcome_decision = "Tie";
    }
    else {
      switch (e1) {
        case "Scissors":
            if (e2 == "Paper")
              outcome_string = "Scissors cuts Paper";
            else
              outcome_string = "Scissors decapitates " + e2;
            outcome_decision = "Win";
            break;
        case "Paper":
            if (e2 == "Rock")
              outcome_string = "Paper covers Rock";
            else
              outcome_string = "Paper disproves " + e2;
            outcome_decision = "Win";
            break;
        case "Rock":
            if (e2 == "Lizard")
              outcome_string = "Rock crushes Lizard";
            else
              outcome_string = "Rock crushes " + e2;
            outcome_decision = "Win";
            break;
        case "Lizard":
            if (e2 == "Spock")
              outcome_string = "Lizard poisons Spock";
            else
              outcome_string = "Lizard eats " + e2;
            outcome_decision = "Win";
            break;
        case "Spock":
            if (e2 == "Scissors")
              outcome_string = "Spock smashes Scissors";
            else
              outcome_string = "Spock vaporizes " + e2;
            outcome_decision = "Win";
            break;

        default: outcome_string = "null";
      }
    }
    
  }

  public String toString() {
    return outcome_string + "--" + outcome_decision;
  }

}
