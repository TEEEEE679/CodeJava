public class myProfile {
    //เริ่มต้นร้าง Class ที่ชื่อเหมือนกับไฟล์//
    public static void main(String[] args) {
        // สร้างเมธอด main เพื่อทำงานโค้ดที่อยู่ใน main//
        String name = "Teeraphat";
        //ประกาศตัวแปรชื่อ name เป็น String เพื่อเก็บข้อความ ค่าเริ่มต้นตั้งเป็น Teeraphat โดยข้อความต้องอยู่ใน ""//
        int  age = 18;
        //ประกาศตัวแปรชื่อ age เป็น int กำหนัดเป็น 18//
        char gender = 'M';
        //ประกาศตัวแปรชื่อ gender เป็น char เพื่อเก็บตัวอักษร 1 ตัว ค่าเริ่มต้นตั้งเป็น M โดยต้องอยู่ใน ''//
        System.out.println("My name is " +name);
        //แสลดผลทางหน้าจอของ name //
        System.out.println("My age is " +age);
        //แสลดผลทางหน้าจอของ age //
        System.out.println("My gender is " +gender);
        //แสลดผลทางหน้าจอของ gendere //
    }
}