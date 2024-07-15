public class W03_01_NetPrice {
    public static void main(String[] args) {
        //สร้างตัวแปรเพื่อเก็บค่าของแต่ละอย่าง
        short price = 350;
        byte quantity = 10;
        byte percenDiscount = 5;

        int totalPrice = price * quantity;
        int discount = totalPrice * percenDiscount / 100;
        int netPrice = totalPrice - discount;

    System.out.println("ราคารวม = " + totalPrice +   " บาท");
    System.out.println("ส่วนลด = " + discount +   " บาท");
    System.out.println("ราคาสุทธิ = " + netPrice +   " บาท");
    }
}
