public class MyLambda implements WordCount {
	public int count(String str) {
		return str.split(" ").length;
	}
}