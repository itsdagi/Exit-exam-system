
public class ListOfQuestions {
	private String Ques1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b>How many Alphabets are present in English Language?</b>  </html>";
	
	private String Ques2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b>How many Vowels are present in English Alphabets?</b>    </html>";
	
	private String Ques3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"Himanshu is bad boy.\"</i></b> "
			+ "<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;In this statement <i><b>\'Himanshu\'</b></i> is which part of speech?";
	
	private String Ques4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"Prakash is running.\"</i></b> "
			+ "<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;In this statement <i><b>\'running\'</b></i> is which part of speech?";
	private String Ques5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"Kuldeep is Student. He likes Science.\"</i>"
			+ "</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;In this statement <i><b>\'He\'</b></i> is which part of speech?";

	private String Opt1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>42</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>26</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;C. <b>32</b>"
			+ 				" <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>21</b></html>";
	private String Opt2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>5</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>8</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>14</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>10</b></html>";
	private String Opt3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>Verb</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Adjective</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;C. "
						+ "<b>Noun</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>Pronoun</b> </html>";
	private String Opt4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>Verb</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Adjective</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>Noun</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>Pronoun</b> </html>";
	private String Opt5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>Verb</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Adjective</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>Noun</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>Pronoun</b> </html>";
	private String[] Answer = {"B", "A", "C", "A", "D"};
	
	public String getQuestion(int i) {
		if(i == 0)
			return Ques1;
		else if(i == 1)
			return Ques2;
		else if(i == 2)
			return Ques3;
		else if(i == 3)
			return Ques4;
		else if(i == 4)
			return Ques5;
		
		return "";
	}
	public String getOptions(int i) {
		if(i == 0)
			return Opt1;
		else if(i == 1)
			return Opt2;
		else if(i == 2)
			return Opt3;
		else if(i == 3)
			return Opt4;
		else if(i == 4)
			return Opt5;
		
		return "";
	}
	public String[] getAnswer() {
		return Answer;
	}
}
