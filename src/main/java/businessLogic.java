//class is a group of objects and methods 
public class businessLogic {

        public Boolean validate(final Integer primeNumber) {
            for (int i = 2; i < (primeNumber / 2); i++) {
                if (primeNumber % i == 0) {
                    return false;
                }//from   w w  w .ja v a 2  s.  c  o  m
            }
            return true;
        }
    }

