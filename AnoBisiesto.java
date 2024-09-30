class AnoBisiesto {
    public static void main(String[] args) {
        int A;
        System.out.println("Introduce un año: ");
        A = Integer.parseInt(System.console().readLine());
        if (A % 4 == 0) {
            if (A % 100 == 0) {
                if (A % 400 == 0) {
                    System.out.println("El año " + A + " es bisiesto.");
                } else {
                    System.out.println("El año " + A + " no es bisiesto.");
                }
            } else {
                System.out.println("El año " + A + " es bisiesto.");
            }
        } else {
            System.out.println("El año " + A + " no es bisiesto.");
        }
    }
}