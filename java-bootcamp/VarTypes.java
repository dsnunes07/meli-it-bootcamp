class VarTypes {
    public static void main(String [] args) {
        int a = 20;
        int b = 6;
        int resultInt = a/b;
        System.out.println(resultInt);

        float resultFloat = a/b;
        System.out.println(resultFloat);

        float resultAllFloat = (float)a/b;
        System.out.println(resultAllFloat);

        Double d = 3.5;
        d.isInfinite();
        String f = "Daniel";
        String g = "Daniel";
        System.out.println(f.hashCode());
        System.out.println(g.hashCode());
    }
}