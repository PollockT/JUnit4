package iloveyouboss;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void test() {
		Profile profile = new Profile("Bull Hocky, Inc.");
		Question question = new BooleanQuestion(1, "Got Bonuses?");
		Answer profileAnswer =new Answer(question, Bool.FALSE);
		profile.add(profileAnswer);
		Criteria criteria = new Criteria();
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(citeriaAnswer, Weight.MustMatch);
		criteria.add(criterion);
		
		boolean matches = profile.matches(criteria);
		assertFalse(matches);
	}
}
