package cpp.cs3560.assignment2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PositiveSysEntryVisitor implements SysEntryVisitor{
	
	private ArrayList<String> positiveWords;
	
	public PositiveSysEntryVisitor() {
		List<String> words = Arrays.asList(new String[] {
				"admire", "adore", "amazing", "amusing", "applaud", "awesome", "best", 
				"bliss", "blessed", "beautiful", "celebrate", "congrats", "congratulations",
				"cute", "cheerful", "confident", "delighted", "dope", "excited", "exciting",
				"excellent", "enjoy", "elated", "flourishing", "great", "good", "happy", 
				"heartwarming", "incredible", "inspiring", "joy", "kind", "like", "love",
				"marvelous", "motivating", "motivational", "nice", "optomistic", "pretty",
				"perfection", "paradise", "remarkable", "stunning", "sweet", "positivity",
				"thankful", "thriving", "thrive", "touched", "uplifting", "wonderful" });
		
		positiveWords = new ArrayList<String>(words);
		
	}

	@Override
	public double visit(Group group) {
		return 0;
	}

	@Override
	public double visit(User user) {
		return 0;
		
		
	}
	

}
