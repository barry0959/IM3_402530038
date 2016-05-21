/*
 * [A]98
 * [TA's Advise]
 * 1. 基本上沒什麼太大問題, 缺少一些小東西而已.
 * 2. 有些多餘的內容雖然不至於影響到整體效能太大, 但可以想想看那些是不是可以做些什麼呢?
 *    我會寫那個是因為我去實踐了Array產生物件的方式, 如果你有興趣的話跟我說.
 * 3. GradeAnalyzer的部分建議Line 43可以用throw的方式, 這樣就可以直接跳到Tester裡的Catch喔!
 * 4. if-else if-else, 可以讓你的程式減少多次不必要的比對.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		String input;
		GradeAnalyzer ga = new GradeAnalyzer();
		while (true) {
			input = JOptionPane.showInputDialog(null);
			
			//equalsIgnoreCase是不分大小寫的意思, 所以後面其實是多餘的.
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				ga.addGrade(Double.parseDouble(input));
			} catch (Exception e) {
				System.out.println("請重新輸入");
			}
		}
		
		//缺少檢查是否合法的數字兩個以上, -2
		ga.analyzeGrades();
		System.out.println(ga);
	}
}
