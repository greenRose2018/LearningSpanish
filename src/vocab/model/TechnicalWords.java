package vocab.model;

public class TechnicalWords 
{
	private String englishWord;
	private String spanishWord;
	private String typeOfTech;
	
	public TechnicalWords(String englishWord, String spanishWord,String typeOfTech)
	{
		this.englishWord = englishWord;
		this.spanishWord = spanishWord;
		this.typeOfTech = typeOfTech;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public void setEnglishWord(String englishWord) {
		this.englishWord = englishWord;
	}

	public String getSpanishWord() {
		return spanishWord;
	}

	public void setSpanishWord(String spanishWord) {
		this.spanishWord = spanishWord;
	}

	public String getTypeOfTech() {
		return typeOfTech;
	}

	public void setTypeOfTech(String typeOfTech) {
		this.typeOfTech = typeOfTech;
	}
}
