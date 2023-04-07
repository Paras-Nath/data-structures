public class wrapperClasses {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = ++i;
        System.out.println("i " + i);       
        System.out.println("j " + j);       
        System.out.println(i == j);       
        System.out.println(i.equals(j));       

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return false;
    }

    public static void mod(Integer i) {
        ++i;
        System.out.println(i);
    }
}
