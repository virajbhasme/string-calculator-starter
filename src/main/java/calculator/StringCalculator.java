package calculator;

class StringCalculator {
    
    public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			String delimiter = ",";
			if(text.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
			}
			
			String numList[] = splitNumbers(text, delimiter + "|\n");
			return sum(numList);
		}
	}
    
    private static int toInt(String number){
		return Integer.parseInt(number);
	}
    
    private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

}