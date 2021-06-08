public class StringManipulator {
    public String trimAndConcat(String string1, String string2){
        String result = string1.trim() + string2.trim();
        return result;
    }
    public Integer getIndexOrNull(String string1, char char1){
        if (string1.indexOf(char1) >= 0){
            return string1.indexOf(char1);
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String s1, String s2){
        if (s1.indexOf(s2) >= 0){
            return s1.indexOf(s2);
        }
        else {
            return null;
        }
    }

    public String concatSubstring( String string1, int a, int b, String string2){
        return string1.substring(a, b).concat(string2); 
    }
}
