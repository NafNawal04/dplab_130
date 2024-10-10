public class Main {
    public static void main(String[] args){
        IProduct laptop = new SimpleProduct("Laptop","It's a laptop.",100);
        IProduct mobile = new SimpleProduct("Mobile","It's a mobile.",150);
        IProduct pc = new SimpleProduct("PC","It's a pc.",250);

        laptop.display();
        System.out.println();

        Bundle techStuffs = new Bundle("TechStuffs","It's a bundle of happiness.",5);
        techStuffs.addProduct(laptop);
        techStuffs.addProduct(mobile);

        techStuffs.display();
        System.out.println();

        Bundle techBundle = new Bundle("TechBundle","It's a bundle of extra happiness.",10);
        techBundle.addProduct(techStuffs);
        techBundle.addProduct(pc);

        techBundle.display();
        System.out.println();
    }
}
