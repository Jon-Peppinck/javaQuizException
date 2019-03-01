/**
   The QuizScore calculates the average quiz score.
*/
public class QuizScore {
	// Fields
	int numberOfScores = 0;
	double totalScore = 0;
	double avgScore;
	/**
	* This constructor increments the numberOfScores for each array element
	* It accumulates the totalScore and calculates the avgScore.
	* @param scores - double array of test scores
	* @exception QuizScoreError when 0 < score < 100 for first array element.
	*/
	public QuizScore(double[] scores)
			throws QuizScoreError
	{
		for (int i = 0; i < scores.length; i++) {		
			if (scores[i] < 0) {
				throw new QuizScoreError(scores[i]);
			} else if (scores[i] > 100) {
				throw new QuizScoreError();
			}  else {
		    	numberOfScores++;
		        totalScore += scores[i];	
			}
		}
		// Prints the average score
		avgScore = totalScore/numberOfScores;
		System.out.println("The average of the " + numberOfScores + " scores is " +
		avgScore);
	}
}
