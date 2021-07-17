package SolucionesFactibles.ProjectSolucionesFactibles;

class MissingLetters {
	private boolean[] alphabet;

	String getMissingLetters(String sentence) {
		this.alphabet = new boolean[26];

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
				saveLetter(Character.toLowerCase(ch));
			}
		}

		StringBuilder missingLetters = new StringBuilder();

		for (int j = 0; j < 26; j++) {
			if (!this.alphabet[j]) {
				char letter = (char) (j + 'a');
				missingLetters.append(letter);
			}
		}
		return missingLetters.toString();
	}

	private void saveLetter(char ch) {
		this.alphabet[ch - 'a'] = true;
	}

	public static void main(String[] args) {
		MissingLetters so = new MissingLetters();
		String sentence = "a, b, c, d, f, z";
		String result = so.getMissingLetters(sentence);

		System.out.println("Secuencia = " + "[" + sentence + "]");
		System.out.println("Salida = " + "[" + result + "]");
	}
}