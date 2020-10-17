package minibus;

import java.util.Scanner;

public class Minibus {

    public static void main(String[] args) {

        Minibus m = new Minibus();

        int n = 0;
         while (n == 0){
            int price = 0;
            String tour = "";
            String way = "";
            String time = "";
            String food = "";

            System.out.print("name:");
            Scanner jiw = new Scanner(System.in);
            String name = jiw.nextLine();

            System.out.print("password:");
            int pas = jiw.nextInt();
            if (name.equals("jiw") && pas == 123) { //ifelse
                m. chosemini();
                tour = chosemini(tour);
                if (tour.equals("ตั๋วธรรมดา")) {
                    price = price + 200;
                    way = m.choice(way);
                } else if (tour.equals("ตํ๋ว(VIP)")) {
                    price = price + 300;
                    way = m.choicevip(way);
                }
                time = m.Time(time);
                food = m.food(food);
                price = sum(tour, way, food);
                System.out.println("ตั๋วของคูณเป็นแบบ " + tour + " เดินทางจาก " + way);
                System.out.println("เวลา " + time + "น. อาหาร " + food);
                System.out.println("ราคาตั๋ว 1 ใบ : " + price + " บาท");

                Scanner ticket = new Scanner(System.in);
                System.out.print("คุณต้องการตั๋วกี่ใบ: ");
                int ticket1 = ticket.nextInt();

                price = price * ticket1;

                System.out.println("ตั้ว " + ticket1);
                System.out.println("ราคาทั้งหมด " + price);

                int out2 = 0;
                for(int i=0;i<=1000;i++){
                    Scanner sum = new Scanner(System.in);
                    System.out.print("เงินที่รับมา ");
                    int sum1 = sum.nextInt();

                    if (sum1 < price) {
                        System.out.println("เงินของคุณไม่เพี่ยงพอ");

                    } else if (sum1 >= price) {
                        int summ = sum1 - price;
                        System.out.println("เงินถอน " + summ + "บาท");
                        i=1001;
                    }

                } 

                n = 1;
            } else {
                System.out.println("wrong password or name");
            }

        }

    }

    public void  chosemini() {

        System.out.println("ตั๋วรถมินิบัทธรรมดา" + "            ตั๋วมินิบัท(VIP) ");
        System.out.println("จังหวัด" + "           ราคา  " + "|" + "  จังหวัด" + "           ราคา");
        System.out.println("1.กระบี่-ชุมพร         350 " + "|" + " 1.กระบี่-ชุมพร              450");
        System.out.println("2.กระบี่-ภูเก็ต          300 " + "|" + " 2.กระบี่-ภูเก็ต              400");
        System.out.println("3.กระบี่-พัทลุง          300 " + "|" + " 3.กระบี่-พัทลุง             400");
        System.out.println("4.กระบี่-พังงา          250 " + "|" + " 4.กระบี่-พังงา              350");
        System.out.println("5.กระบี่-ตรัง           300 " + "|" + " 5.กระบี่-ตรัง               400");

    }

    public static int sum(String tour, String way, String food) {
        int price = 0;
        if (tour.equals("ตั๋วธรรมดา")) {
            price = price + 200;
        } else if (tour.equals("ตํ๋ว(VIP)")) {
            price = price + 300;
        }
        if (way.equals("กระบี่-ชุมพร")) {
            price = price + 150;
        } else if (way.equals("กระบี่-ภูเก็ต")) {
            price = price + 100;
        } else if (way.equals("กระบี่-พัทลุง")) {
            price = price + 100;
        } else if (way.equals("กระบี่-พังงา")) {
            price = price + 50;
        } else if (way.equals("กระบี่-ตรัง")) {
            price = price + 100;
        }
        if (food.equals("ขนมปัง-น้ำเปล่า")) {
            price = price + 40;
        } else if (food.equals("ขนมปัง- น้ำอัดลม")) {
            price = price + 50;
        } else if (food.equals("แฮมเบอร์เกอร์-น้ำอัดลม")) {
            price = price + 80;
        }

        return price;
    }

    public static String chosemini(String tour) {

        Minibus c = new Minibus();
        int out = 0;
        do {
            Scanner chose = new Scanner(System.in);
            System.out.println("");
            System.out.println("เลือกตั๋วธรรมดากด 1       เลือกตํ๋ว(VIP)กด 2");
            int ch = chose.nextInt();

            if (ch == 1) {
                System.out.println("เลือกตั๋วธรรมดา");
                tour = "ตั๋วธรรมดา";
                out = 1;
            } else if (ch == 2) {
                System.out.println("เลือกตํ๋ว(VIP)");
                tour = "ตํ๋ว(VIP)";
                out = 1;
            } else {
                System.out.println("โปรดเลือกอีกครั้ง");
            }
        } while (out == 0);

        return tour;
    }

    public String choice(String way) {
        Minibus c = new Minibus();
        System.out.println("1.กระบี่-ชุมพร 2.กระบี่-ภูเก็ต 3.กระบี่-พัทลุง 4.กระบี่-พังงา 5.กระบี่-ตรัง");
        
        
        int out = 1;
        do {
            
        Scanner menu = new Scanner(System.in);
        System.out.print("คุณเลือก:");
        int ch = menu.nextInt();

            switch (ch) {
                case 1:                      //switch

                    System.out.println("1.กระบี่-ชุมพร 350 บาท");
                    way = "กระบี่-ชุมพร";
                       out=2;
                    break;
                case 2:
                    out=2;
                    System.out.println("2.กระบี่-ภูเก็ต 300 บาท");
                    way = "กระบี่-ภูเก็ต";
                    break;

                case 3:
                    out=2;
                    System.out.println("3.กระบี่-พัทลุง 300 บาท");
                    way = "กระบี่-พัทลุง";
                    break;

                case 4:
                    out=2;
                    System.out.println("4.กระบี่-พังงา 250 บาท");
                    way = "กระบี่-พังงา";
                    break;

                case 5:
                    out=2;
                    System.out.println("4.กระบี่-ตรัง 300 บาท");
                    way = "กระบี่-ตรัง";
                    break;

                default:
                    System.out.println("เลือกใหม่อีกครั้งค่ะ ");

            }
        } while (out == 1);

        return way;
    }

    public String choicevip(String way) {

        System.out.println("1.กระบี่-ชุมพร 2.กระบี่-ภูเก็ต 3.กระบี่-พัทลุง 4.กระบี่-พังงา 5.กระบี่-ตรัง");

        int out1 = 1;
        do {

        Scanner menu = new Scanner(System.in);
        System.out.print("คุณเลือก:");
        int vip = menu.nextInt();
            switch (vip) {
                case 1:                      //switch

                    System.out.println("1.กระบี่-ชุมพร 450 บาท");
                    way = "กระบี่-ชุมพร";
                    out1=2;
                    break;
                case 2:

                    System.out.println("2.กระบี่-ภูเก็ต 400 บาท");
                    way = "กระบี่-ภูเก็ต";
                    out1=2;
                    break;

                case 3:

                    System.out.println("3.กระบี่-พัทลุง 400 บาท");
                    way = "กระบี่-พัทลุง";
                    out1=2;
                    break;

                case 4:
                    System.out.println("4.กระบี่-พังงา 350 บาท");
                    way = "กระบี่-พังงา";
                    out1=2;
                    break;

                case 5:
                    System.out.println("4.กระบี่-ตรัง 400 บาท");
                    way = "กระบี่-ตรัง";
                    out1=2;
                    break;

                default:
                    System.out.println("เลือกใหม่อีกครั้งค่ะ ");
            }

        } while (out1 == 1);
        return way;
    }

    public String Time(String timee) {
        int t = 1;
        do {

            System.out.println("1. 08.00 2. 10.00 3. 11.00 4. 14.00 5.16.00");

            Scanner time = new Scanner(System.in);
            System.out.print("เลือกเวลา:");
            int time1 = time.nextInt();

            switch (time1) {
                case 1:                      //switch

                    System.out.println("1. 08.00 ");
                    timee = "08.00";
                        t=2;
                    break;
                case 2:

                    System.out.println("2. 10.00 ");
                    timee = "10.00";
                     t=2;
                    break;

                case 3:

                    System.out.println("3. 11.00");
                    timee = "11.00";
                     t=2;
                    break;

                case 4:
                    System.out.println("4. 14.00");
                    timee = "14.00";
                     t=2;
                    break;

                case 5:
                    System.out.println("5. 16.00");
                    timee = "16.00";
                     t=2;
                    break;

                default:
                    System.out.println("เลือกใหม่อีกครั้งค่ะ ");

            }
            
        } while (t == 1);

        return timee;
    }

    public String food(String food) {
        int  fd =1;
do{
        System.out.println("1.ขนมปัง-น้ำเปล่า  2.ขนมปัง- น้ำอัดลม  3.แฮมเบอร์เกอร์-น้ำอัดลม");

        Scanner foo = new Scanner(System.in);
        int f = foo.nextInt();

        switch (f) {
            case 1:                      //switch

                System.out.println("1.ขนมปัง-น้ำเปล่า 40 บาท");
                food = "ขนมปัง-น้ำเปล่า";
                 fd = 2;
                break;
            case 2:

                System.out.println("2.ขนมปัง- น้ำอัดลม 50 บาท");
                food = "ขนมปัง- น้ำอัดลม";
                   fd = 2;
                break;

            case 3:

                System.out.println("3.แฮมเบอร์เกอร์-น้ำอัดลม 80 บาท");
                food = "แฮมเบอร์เกอร์-น้ำอัดลม";
                   fd = 2;
                break;

            default:
                System.out.println("เลือกใหม่อีกครั้งค่ะ ");

        }
}while(fd==1);

        return food;
    }
}

