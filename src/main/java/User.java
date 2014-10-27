import com.mongodb.BasicDBObject;

public class User extends BasicDBObject {
    public int getWordsCount() {
        return (int) super.get("wordsCount");
    }

    public void setWordsCount(int wordsCount) {
        super.put("wordsCount", wordsCount);
    }

    public void setWordMin(int wordMin) {
        super.put("wordsMin", wordMin);
    }

    public int getWordMax() {
        return (int) super.get("wordsMax");
    }

    public void setWordMax(int wordMax) {
        super.put("wordsMax", wordMax);
    }

    public int getSentenceMin() {
        return (int) super.get("sentenceMin");
    }

    public void setSentenceMin(int sentenceMin) {
        super.put("sentenceMin", sentenceMin);
    }

    public int getSentenceMax() {
        return (int) super.get("sentenceMax");
    }

    public void setSentenceMax(int sentenceMax) {
        super.put("sentenceMax", sentenceMax);
    }

    public int getAgeMin() {
        return (int) super.get("ageMin");
    }

    public void setAgeMin(int ageMin) {
        super.put("ageMin", ageMin);
    }

    public int getAgeMax() {
        return (int) super.get("ageMax");
    }

    public void setAgeMax(int ageMax) {
        super.put("ageMax", ageMax);
    }

    public String getLifestyle() {
        return (String) super.get("lifestyle");
    }

    public void setLifestyle(String lifestyle) {
        super.put("lifestyle", lifestyle);
    }

    public String getEnglishLevel() {
        return (String) super.get("englishLevel");
    }

    public void setEnglishLevel(String englishLevel) {
        super.put("englishLevel", englishLevel);
    }

    public String getGender() {
        return (String) super.get("gender");
    }

    public void setGender(String gender) {
        super.put("gender", gender);
    }

    public String getDepartment() {
        return (String) super.get("department");
    }

    public void setDepartment(String department) {
        super.put("department", department);
    }
}
