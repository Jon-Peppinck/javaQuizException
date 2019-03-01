/**
   QuizScoreError exceptions are thrown by the
   QuizScore class when a negative score, or a score greater than 100 is
   passed to the constructor.
*/
public class QuizScoreError
	extends Exception
{
   /**
	* This constructor outputs an error message in the event the score > 100.
	*/
   public QuizScoreError()
   {
      super("Error: Please enter a valid score not greater than 100.");
   }
   /**
	* This constructor outputs an error message in the event the score < 0. 
	* @param - The first negative score from the array.
	*/
   public QuizScoreError(double s)
   {
      super("Error: " + s + " is a negative score.");
   }
}
