package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Othermain {
    public static void main(String[] args) {
        Custom1 custom = new Custom1();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Custom1> list = new ArrayList<>();

        while (true){
        System.out.println("Vui lòng lựa chọn phương án đăng ký");
        System.out.println("==================================================================================================================================================");
        System.out.println("1. Thêm mới bài viết.");
        System.out.println("2. Hiển thị danh sách bài vừa nhập.");
        System.out.println("3. Thoát chương trình.");
        System.out.println("==================================================================================================================================================");
        System.out.print("Vui lòng nhập lựa chọn của bạn : ");
        int nhap = scanner.nextInt();
        switch (nhap) {
            case 1:
                System.out.println("==================================================================================================================================================");
                System.out.printf("Mời bạn nhập mã SKD         : ");
                custom.setSkd(scanner.nextInt());
                scanner.nextLine();
                System.out.printf("Mời nhập tiêu đề bài viết   : ");
                custom.setTitle(scanner.nextLine());
                System.out.printf("Mời bạn nhập phần mô tả     : ");
                custom.setDescribe(scanner.nextLine());
                System.out.printf("Mời bạn nhập ảnh đại diện   : ");
                custom.setAvatar(scanner.nextLine());
                System.out.printf("Mời bạn nhập nội dung chính : ");
                custom.setMainContent(scanner.nextLine());
                System.out.printf("Mời bạn nhập tên tác giả    : ");
                custom.setAuthor(scanner.nextLine());
                System.out.printf("Mời bạn nhập ngày viết      : ");
                custom.setDate(scanner.nextInt());
                scanner.nextLine();
                list.add(custom);
                System.out.println("==================================================================================================================================================");
                break;
            case 2:
                if (list.size() == 0) {
                    System.out.println("Vui lòng nhập dữ liệu để hiển thị !!!");
                }else {
                    System.out.println("==================================================================================================================================================");
                    System.out.println("Số lần thêm mới là " + list.size());
                        System.out.println("==================================================================================================================================================");
                        System.out.println("Mã bài viết      : " + custom.getSkd());
                        System.out.println("Tiêu đề bài viết : " + custom.getTitle());
                        System.out.println("Mô tả            : " + custom.getDescribe());
                        System.out.println("Ảnh đại diện     : " + custom.getAvatar());
                        System.out.println("Nội dung chính   : " + custom.getMainContent());
                        System.out.println("Tên tác giả      : " + custom.getAuthor());
                        System.out.println("Ngày viết        : " + custom.getDate());
                        System.out.println("==================================================================================================================================================");
                    }
                break;
            case 3:
                System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                System.exit(0); // thoát chương trình
                break;
            default:
                System.out.println("Không tồn tại vui lòng nhập lại !!!");
        }
    }
    }
}
