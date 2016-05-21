import java.util.ArrayList;

public class GradeAnalyzer {

	int count = 0;
	ArrayList<Double> grade = new ArrayList<Double>();
	double average;
	double sum = 0;
	double sd;
	double sum2 = 0;
	int a = 0;

	// �o11�ӼƦr���S����k����n���x�s�覡�O?
	int score1 = 0;
	int score2 = 0;
	int score3 = 0;
	int score4 = 0;
	int score5 = 0;
	int score6 = 0;
	int score7 = 0;
	int score8 = 0;
	int score9 = 0;
	int score10 = 0;
	int score11 = 0;

	// �ݰ_�ӬO�h�l��, �Y�L�O�Ĥ@���i�h�A�u�O��o�ӥ[�J�F�@��NOT���\�ΦӤw.
	boolean first = true;

	public boolean isValidGrade(double aGrade) {
		if (aGrade >= 0 && aGrade <= 110) {
			return true;
		} else {
			return false;
		}
	}

	public void addGrade(double aGrade) {
		if (first) {
			first = false;
		}
		if (!isValidGrade(aGrade)) {
			// ��ĳ�o��i�H�ϥ�throw Exception, �p�G�A���ҥ~�B�z���[������.
			return;
		}
		grade.add(aGrade);
		count++;
		sum = sum + aGrade;

		// �q�`�ڧP�_���|��ĳ��if-else if-else���覡�h�g, �קK���򤣥��n���P�_.
		if (aGrade <= 110 && aGrade >= 98) {
			score1++;
		}
		if (aGrade < 98 && aGrade >= 92) {
			score2++;
		}
		if (aGrade < 92 && aGrade >= 90) {
			score3++;
		}
		if (aGrade < 90 && aGrade >= 88) {
			score4++;
		}
		if (aGrade < 88 && aGrade >= 82) {
			score5++;
		}
		if (aGrade < 82 && aGrade >= 80) {
			score6++;
		}
		if (aGrade < 80 && aGrade >= 78) {
			score7++;
		}
		if (aGrade < 78 && aGrade >= 72) {
			score8++;
		}
		if (aGrade < 72 && aGrade >= 70) {
			score9++;
		}
		if (aGrade < 70 && aGrade >= 60) {
			score10++;
		}
		if (aGrade < 60) {
			score11++;
		}
	}

	public void analyzeGrades() {
		average = sum / count;
		for (int i = 0; i < grade.size(); i++) {
			sum2 = sum2 + Math.pow(average - grade.get(i), 2);
			sd = Math.sqrt(sum2 / count);
		}
	}

	public String toString() {
		return "You entered " + count + " valid grades from 0 to 110. Invalid grades are ignored!\r\n\r\nThe average ="
				+ average + " with a standard deviation = " + sd + "\r\n\r\nThe grade distribution is:\r\n\r\nA+ ="
				+ score1 + "\r\nA =" + score2 + "\r\nA- =" + score3 + "\r\nB+ =" + score4 + "\r\nB =" + score5
				+ "\r\nB- =" + score6 + "\r\nC+ =" + score7 + "\r\nC =" + score8 + "\r\nC- =" + score9 + "\r\nD ="
				+ score10 + "\r\nF=" + score11;
	}
}
