// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopWhile {

    public static void main(String[] args) {

// โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า
// TODO 1
        System.out.println("TODO 1 - For Loop");
        for (int i = 1; i <= 5; i++) {
            //คำสั่งที่เราต้องทำซ้ำ

            System.out.println("รอบที่ " + i);
        }
        System.out.println("-------------------------------------------------------------------------------");
// ======================== TODO 1 - End For Loop ==================================
        System.out.println("TODO 1 - While Loop");
        int n = 1;
        while (n <= 5) {
            System.out.println("รอบที่ " + n);
            n++;
        }
        System.out.println("=================================================================================");
// ======================== TODO 1 - End While Loop ==================================
//TODO2
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
        // TODO
        System.out.println("TODO 2 - For Loop");
        for (int i = 1; i <= 5; i++) {
            //คำสั่งที่เราต้องทำซ้ำ

            System.out.println("รอบที่ " + i + " Hello World");

        }
        System.out.println("-------------------------------------------------------------------------------");
// ======================== TODO 2 - End For Loop ==================================
        System.out.println("TODO 2 - While Loop");
        int l = 1;
        while (l <= 5) {
            System.out.println("รอบที่ " + l + " Hello World");
            l++;
        }

        System.out.println("=================================================================================");

// == == == == == == == == == == == == TODO 2 - End While Loop == == == == == == == == == == == == == == == ==               
//TODO3
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
// TODO
        System.out.println("TODO 3 - For Loop");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        // ======================== TODO 3 - End For Loop ==================================
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("TODO 3 - While Loop");
        int n3 = 1;
        while (n3 <= 10) {
            System.out.print(n3 + " ");
            n3++;
        }
        System.out.println("\n=================================================================================");
// == == == == == == == == == == == == TODO 3 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
        // TODO
        System.out.println("TODO 4 - For Loop");
        System.out.println();
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
            sum = sum + j; // sum += j;
        }
        System.out.println("= " + sum);
        System.out.println("\n-------------------------------------------------------------------------------");
// ======================== TODO 4 - End For Loop ==================================
        System.out.println("TODO 4 - While Loop");
        int sum1 = 0;
        int s1 = 1;
        while (s1 <= 10) {
            System.out.print(s1 + " ");
            sum1 = sum1 + s1;
            s1++;
        }
        System.out.println("= " + sum1);
        System.out.println("\n=================================================================================");
// == == == == == == == == == == == == TODO 4 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
// TODO 5
        System.out.println("TODO 5 - For Loop");
        System.out.println();
        sum = 0;

        for (int j = 1; j <= 10; j++) {
            System.out.print(j);
            if (j < 10) {
                System.out.print("+");
            }
            sum = sum + j; // sum += j;
        }
        System.out.println(" = " + sum);

        // ======================== TODO 5 - End For Loop ==================================
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("TODO 5 - While Loop");
        sum = 0;
        int o = 1;
        while (o <= 10) {
            System.out.print(o);
            if (o < 10) {
                System.out.print("+");
            }
            sum = sum + o;
            o++;
        }
        System.out.println(" = " + sum);
        System.out.println("\n=================================================================================");
        // == == == == == == == == == == == == TODO 5 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1
// TODO 6
        System.out.println();
        System.out.println("TODO 6 - For Loop");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
// ======================== TODO 6 - End For Loop ==================================
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("TODO 6 - While Loop");
        int q = 10;
        while (q >= 1) {
            System.out.print(q + " ");
            q--;
        }
        System.out.println("\n=================================================================================");
// == == == == == == == == == == == == TODO 6 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19
// TODO 7
        System.out.println("TODO 7 - For Loop");
        System.out.println();
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
// ======================== TODO 7 - End For Loop ==================================
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("TODO 7 - While Loop");
        int g = 1;
        while (g <= 19) {
            System.out.print(g + " ");
            g += 2;
        }
        System.out.println("\n=================================================================================");
// == == == == == == == == == == == == TODO 7 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20
// TODO 8
        System.out.println();
        System.out.println("TODO 8 - For Loop");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------------------------------------------------------------------");
// ======================== TODO 8 - End For Loop ==================================
        System.out.println("TODO 8 - While Loop");
        int n2 = 2;
        while (n2 <= 20) {
            System.out.print(n2 + " ");
            n2 += 2;
        }
        System.out.println("\n=================================================================================");

// ==   == == == == == == == == == == == TODO 8 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100
// TODO 9
        System.out.println();
        System.out.println("TODO 9 - For Loop");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n-------------------------------------------------------------------------------");
        // ======================== TODO 9 - End For Loop ==================================
        System.out.println("TODO 9 - While Loop");
        int w = 1;
        while (w <= 10) {
            System.out.print(w * w + " ");
            w++;
        }
        System.out.println("\n=================================================================================");
// == == == == == == == == == == == == TODO 9 - End While Loop == == == == == == == == == == == == == == == ==
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
// TODO 10
        System.out.println();
        System.out.println("TODO 10 - For Loop");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("รอบที่ " + i + "เลขคู่");
            } else {
                System.out.println("รอบที่ " + i + "เลขคี่");
            }

        }
        // ======================== TODO 10 - End For Loop ==================================
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("TODO 10 - While Loop");
        int u = 1;
        while (u <= 5) {
            u++;
            if (u % 2 == 0) {
                System.out.println("รอบที่ " + u + "เลขคู่");
            } else {
                System.out.println("รอบที่ " + u + "เลขคี่");
            }
            w++;
        }
        System.out.println("\n=================================================================================");
        // == == == == == == == == == == == == TODO 10 - End While Loop == == == == == == == == == == == == == == == ==
    }
// ======================================================================
}
