public class ListOfQuestions {
	private String Ques1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;What's the best way to implement a linked list in Java?</html>";

	private String Ques2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;How many cups of coffee does it take to write a Java program?</html>";

	private String Ques3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;Why did the Java program go to therapy? <i></i></html>";

	private String Ques4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;Why do Java developers wear glasses? </html>";

	private String Ques5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;What's a Java programmer's favorite candy? <i></i></html>";

	private String Opt1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. With a stack <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. With an array <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. With a hashmap <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. With a linked list</html>";

	private String Opt2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. Just one, but it has to be really, really good <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. None, real programmers don't run on caffeine "
			+ "<br/>&nbsp;&nbsp;&nbsp;&nbsp;C. Three: one to write the code, one to debug it, and one to fix it after <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. "
			+ "As many as it takes to get it right</html>";

	private String Opt3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. It was feeling <i>boxed in</i> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. To address its <i>stack overflow</i> "
			+ "<br/>&nbsp;&nbsp;&nbsp;&nbsp;C. It had a <i>NullPointerException</i> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. It needed to <i>inherit</i> some peace of mind</html>";

	private String Opt4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. Because they can't<i> see sharp</i> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. To get a <i>clear view</i> of the code "
			+ "<br/>&nbsp;&nbsp;&nbsp;&nbsp;C. To help them <i>focus</i> on their work <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. They don't wear glasses, they use <i>lenses</i></html>";

	private String Opt5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <i>Javabear</i>s <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <i>Javamints</i> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <i>Javaroos</i> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <i>Javabean</i>s</html>";

	private String[] Answer = {"D", "B", "C", "A", "D"};

	public String getQuestion(int i) {
		if (i == 0){
			return Ques1;}
		else if (i == 1){
			return Ques2;}
		else if (i == 2){
			return Ques3;}
		else if (i == 3){
			return Ques4;}
		else if (i == 4){
			return Ques5;
		}

		return "";
	}

	public String getOptions(int i) {
		if (i == 0)
			return Opt1;
		else if (i == 1)
			return Opt2;
		else if (i == 2)
			return Opt3;
		else if (i == 3)
			return Opt4;
		else if (i == 4)
			return Opt5;

		return "";
	}

	public String[] getAnswer() {
		return Answer;
	}
}
