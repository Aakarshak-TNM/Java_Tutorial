import java.util.Scanner;

class String_tutorial {
    Scanner scan = new Scanner(System.in);

    String input() {
        String str_1 = scan.next();// Taking input from the user
        scan.close();
        return str_1;
    }

    void print(String sample) {
        System.out.printf("%s", sample);
    }
}

class String_Buffer_tutorial {
    // 2.StringBuffer-Mutable
    StringBuffer sb = new StringBuffer();

    void add(String s) {
        sb.append(s);
        // System.out.println(sb instanceof StringBuffer);
    }

    void print() {
        System.out.println(sb);
        add("->");
    }
}

class String_Builder_tutorial {
    // 3.StringBuilder
    // mainly used for single threaded program.
    StringBuilder sb = new StringBuilder();

    void add(String s) {
        sb.append(s);
    }

    void print() {
        System.out.println(sb);
        add("->");
    }
}
