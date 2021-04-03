package solutions.kuy7;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        StringBuilder builder = new StringBuilder();
        for (String arg : dna.split("")) {
            if (arg.equals("T")) {
                builder.append("A");
                continue;
            }
            if (arg.equals("A")) {
                builder.append("T");
                continue;
            }
            if (arg.equals("C")) {
                builder.append("G");
                continue;
            }

            if (arg.equals("G")) {
                builder.append("C");
                continue;
            }
            builder.append(arg);
        }
        return builder.toString();
    }
}
