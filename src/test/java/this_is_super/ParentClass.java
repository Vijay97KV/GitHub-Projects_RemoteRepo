package this_is_super;

public class ParentClass {
	int ScoredMarks;

	public ParentClass(int score) {
		this.ScoredMarks = score;
	}

	public void calculateSSLCPercent() {
		int totalScore = 625;

		System.out.println("ScoredMarks: "+ScoredMarks + " : " +"totalScore: "+ totalScore);
	
if(ScoredMarks>0) {
			
		}
		System.out.println(ScoredMarks/totalScore);
		float percentage = (float)((ScoredMarks*100)/totalScore);

		System.out.println("percentageOfUrs :" + percentage+" %");
		
	}

}
