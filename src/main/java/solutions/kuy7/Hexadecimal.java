package solutions.kuy7;

public class Hexadecimal {
    public static String convertToHex(int a) {
        StringBuilder result = new StringBuilder();

        while (a > 0) {
            if (a % 16 > 9) {
                switch (a % 16) {
                    case 10:
                        result.append("A");
                        break;
                    case 11:
                        result.append("B");
                        break;
                    case 12:
                        result.append("C");
                        break;
                    case 13:
                        result.append("D");
                        break;
                    case 14:
                        result.append("E");
                        break;
                    case 15:
                        result.append("F");
                        break;
                }
            } else {
                result.append(a % 16);
            }
            a /= 16;
        }
        return "0x" + result.reverse().toString();
    }
}
