package ElectoralSystem;

public class PasswordChecker {
    public boolean checkPasswordForLength(String password){
        boolean isGreaterThanSix = false;
        if(password.length()>=6) {
            isGreaterThanSix = true;
        }
        return isGreaterThanSix;
    }

    public int getNumberOfLowerCase(String password) {
        int numberOfLowerCase = 0;
        for(int count = 0; count < password.length(); count++) {
            if(password.charAt(count) >= 'a' && password.charAt(count) <= 'z') {
                numberOfLowerCase++;
            }
        }
        return numberOfLowerCase;
    }

    public int getNumberOfUpperCase(String password) {
        int numberOfUpperCase = 0;
        for(int count = 0; count < password.length(); count++) {
            if(password.charAt(count) >= 'A' && password.charAt(count) <= 'Z'){
                numberOfUpperCase++;
            }
        }
        return numberOfUpperCase;
    }

    public  int getNumberOfDigit(String password) {
        int  numberOfDigit = 0;
        for(int count = 0; count < password.length(); count++) {
            if(password.charAt(count) >= '0' && password.charAt(count) <= '9') {
                numberOfDigit++;
            }
        }
        return numberOfDigit;
    }

    public int getNumberOfSymbol(String password) {
        char[] symbols = {'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','[',']','{','}','\\','|',':',';','"','\'','<',',','>','.','?','/'};
        int numberOfSymbol = 0;
        for(int count = 0; count < password.length(); count++) {
            for(int index = 0; index < symbols.length; index++) {
                if(password.charAt(count) == symbols[index]) {
                    numberOfSymbol++;
                }
            }
        }
        return numberOfSymbol;
    }

    public   boolean isStrong(String password) {
        return checkPasswordForLength(password) && getNumberOfUpperCase(password) >= 1 && getNumberOfLowerCase(password) >= 1 && getNumberOfDigit(password) >= 1 && getNumberOfSymbol(password) >= 1;
    }
}
