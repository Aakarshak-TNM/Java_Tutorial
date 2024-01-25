public class Java_Record {
    public static void main(String[] args) {
        Point ptr1 = new Point(1, 2);
        Point2 ptr2 = new Point2(1, 2);

        System.out.println(ptr1.equals(ptr2));// False
        System.out.println(ptr1.hashCode() == ptr2.hashCode());// True

    }
}
