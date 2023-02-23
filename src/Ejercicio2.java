public class Ejercicio2 {
    public static void main(String[] args) {
        int max = 3999;
        int min = 1;
        int al = (int) (min + (int) (Math.random() * (max + 1 - min)));
        System.out.println(al);
        if (al > 999) {
            switch (al / 1000) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("M");
                    break;
                case 2:
                    System.out.print("MM");
                    break;
                case 3:
                    System.out.print("MMM");
                    break;

            }
            switch ((al / 100) % 10) {
                case 0:
                    System.out.print("");break;
                case 1:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("CC");
                    break;
                case 3:
                    System.out.print("CCC");
                    break;
                case 4:
                    System.out.print("CD");
                    break;
                case 5:
                    System.out.print("D");
                    break;
                case 6:
                    System.out.print("DC");
                    break;
                case 7:
                    System.out.print("DCC");
                    break;
                case 8:
                    System.out.print("DCCC");
                    break;
                case 9:
                    System.out.print("CM");
                    break;
            }


            switch ((al / 10) % 10) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
            }
            switch ((al % 10)) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
            }

        }
        if (al > 99) {

            switch ((al / 100) % 10) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("CC");
                    break;
                case 3:
                    System.out.print("CCC");
                    break;
                case 4:
                    System.out.print("CD");
                    break;
                case 5:
                    System.out.print("D");
                    break;
                case 6:
                    System.out.print("DC");
                    break;
                case 7:
                    System.out.print("DCC");
                    break;
                case 8:
                    System.out.print("DCCC");
                    break;
                case 9:
                    System.out.print("CM");
                    break;
            }


            switch ((al / 10) % 10) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
            }
            switch ((al % 10)) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
            }

        }
        if (al > 9) {


            switch ((al / 10) % 10) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
            }
            switch ((al % 10)) {

                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
            }
        }
        if (al <= 9) {


            switch ((al)) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
            }
        }

        }
    }
