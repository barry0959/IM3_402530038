/*
 * [A]98
 * [TA's Advise]
 * 1. �򥻤W�S����Ӥj���D, �ʤ֤@�Ǥp�F��Ӥw.
 * 2. ���Ǧh�l�����e���M���ܩ�v�T�����į�Ӥj, ���i�H�Q�Q�ݨ��ǬO���O�i�H���Ǥ���O?
 *    �ڷ|�g���ӬO�]���ڥh���FArray���ͪ��󪺤覡, �p�G�A�����쪺�ܸ�ڻ�.
 * 3. GradeAnalyzer��������ĳLine 43�i�H��throw���覡, �o�˴N�i�H��������Tester�̪�Catch��!
 * 4. if-else if-else, �i�H���A���{����֦h�������n�����.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		String input;
		GradeAnalyzer ga = new GradeAnalyzer();
		while (true) {
			input = JOptionPane.showInputDialog(null);
			
			//equalsIgnoreCase�O�����j�p�g���N��, �ҥH�᭱���O�h�l��.
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				ga.addGrade(Double.parseDouble(input));
			} catch (Exception e) {
				System.out.println("�Э��s��J");
			}
		}
		
		//�ʤ��ˬd�O�_�X�k���Ʀr��ӥH�W, -2
		ga.analyzeGrades();
		System.out.println(ga);
	}
}
