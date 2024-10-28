public class Lab4Task10 {

        public static char getRandomCharacter(char ch1,char ch2){
            return (char)(ch1 + Math.random()*(ch2 - ch1 +1));
        }

        public static char getRandomLowerCaseletter(){
            return getRandomCharacter('a','z');
        }
        public static char getRandomUpperCaseletter(){
            return getRandomCharacter('A','Z');
        }


}
