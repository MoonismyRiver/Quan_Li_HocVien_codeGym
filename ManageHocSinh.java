package QuanLiHocVienCodeGym;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManageHocSinh {


        Scanner scanner = new Scanner(System.in);

        public void menu() {
            System.out.println("----MENU----");
            System.out.println("1. Thêm học viên.");
            System.out.println("2. Hiển thị học viên.");
            System.out.println("3. Hiển thị học viên theo lớp. (Nhập tên lớp : ");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("---chọn lớp---");
                    System.out.println("");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }


