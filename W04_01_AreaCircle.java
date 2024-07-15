import java.util.Scanner; // นำเข้าคลาส จาก package java.util

public class W04_01_AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กด์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีวงกลม: "); // แสดงข้อความให้ผู้ใช้
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บ

        // double radius; // ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 10; // กำหนดค่ารัศมีเป็น 10

        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI
    if(radius>0){
        area = PI*radius*radius;
        System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ = " + radius + " คือ " + area);
    } else {
        
        System.out.println("Error: รัศมีต้องมีค่ามากกว่า 0");
      }
    }
}
