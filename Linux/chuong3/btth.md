## BÀI TẬP THỰC HÀNH MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 3: QUẢN LÝ TIẾN TRÌNH
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---

## Bài TH 1: Cơ chế chuyển hướng.
Tạo 2 files : __output.txt__ và __error.txt__
Thực hiện lệnh sau :
ls –l /bin /hehe
Hãy dùng cơ chế chuyển hướng để đưa nội dung liệt kê của thư mục /bin vào
output.txt, và đưa thông báo lỗi vào error.txt.
Trả lời: Các lệnh em đã dùng là:
```console
alex@alex-MS-7972:~$ touch output.txt error.txt
alex@alex-MS-7972:~$ ls -l /bin /hehe > output.txt 2> error.txt
```
## Bài TH2: Cơ chế đường ống (pipeline)
Trong tệp list.txt có lưu danh sách các nhân viên của một công ty (file có thể tải
cùng thư mục). Các trường lần lượt được ngăn cách nhau bởi dấu “:”
Hãy dùng cơ chế đường ống để làm những việc sau đây :
- Tìm ra tất cả những người sống ở Hà Nội và sắp xếp họ theo năm sinh
- Tìm tất cả những người họ Trần và sắp xếp theo giới tính.
- Tìm tất cả những người họ Nguyễn, sắp xếp theo năm sinh và chỉ liệt kê ra
3 người lớn tuổi nhất, lưu thông tin của họ vào file “output.txt”
Trả lời: Các lệnh em đã dùng là:


```console
alex@alex-MS-7972:~$ cat list.txt

Nguyễn Công Anh:1996:Hà Nội:Nam
Lê Thị Kim Cúc:1995:Hà Nam:Nữ
Nguyễn Bá Cương:1995: Hà Tây:Nam
Dương Hùng Cường:1993:Hà Nội:Nam
Phạm Văn Duẩn:1991:Thái Bình:Nam
Đõ Hoàng Dương:1993:Hà Nội:Nam
Lê Chu Hoàng Đại:1995:Hải Phòng:Nam
Đỗ Trường Giang:1992:Nam Định:Nam
Đặng Xuân Hải:1995:Quảng Ninh:Nam
Lê Minh Hoàng:1996:Thanh Hóa:Nam
Lê Thị Hồng:1996:Bắc Ninh:Nữ
Phạm Thị Hồng:1996:Hải Dương:Nữ
Trương Quang:1994:Huân Ninh Bình:Nam
Trần Quốc Hưng:1994:Hà Nội:Nam
Nguyễn Chính Lý:1998:Đăk Lăk:Nam
Phạm Văn Phong:1994:Hưng Yên:Nam
Đặng Ngọc Phú:1991:Nghệ Tĩnh:Nam
Huỳnh Văn Phúc:1995:Quảng Nam:Nam
Phạm Anh Phương:1994:Hải Phòng:Nam
Đặng Xuân Quyết:1994:Thanh Hóa:Nam
Lê Anh Sinh:1993:Hà Nội:Nam
Nguyễn Văn Sơn:1995:Hà Tây:Nam
Phạm Tất Thành:1997:Sơn La:Nam
Nguyễn Đình Thái:1996:Hà Tây:Nam
Nguyễn Thị Phương Thảo:1993: Bắc Ninh:Nữ
Phạm Hồng Thắng:1995:Thanh Hóa:Nam
Đỗ Trọng Thắng:1995:Bắc Ninh:Nam
Nguyễn Việt Thắng:1993:Hà Tây:Nam
Nguyễn Phương Thùy:1995:Hà Tây:Nữ
Nguyễn Văn Tính:1997:Hưng Yên:Nam
Phạm Văn Tuyền:1988:Nam Định:Nam
Phạm Thành Vân:1984:Hà Nội:Nam
Lê Thị Hoàng Yến:1998:Hưng Yên:Nữ
Đặng Ngọc Khuê:1997:Hà Nội:Nam
Lê Thành Minh:1996:Thanh Hóa:Nam

alex@alex-MS-7972:~$ grep -i "Hà Nội" list.txt | sort -t ":" -nk2

Phạm Thành Vân:1984:Hà Nội:Nam
Đõ Hoàng Dương:1993:Hà Nội:Nam
Dương Hùng Cường:1993:Hà Nội:Nam
Lê Anh Sinh:1993:Hà Nội:Nam
Trần Quốc Hưng:1994:Hà Nội:Nam
Nguyễn Công Anh:1996:Hà Nội:Nam
Đặng Ngọc Khuê:1997:Hà Nội:Nam

alex@alex-MS-7972:~$ grep -i "Trần" list.txt | sort -t ":" -k4

Trần Quốc Hưng:1994:Hà Nội:Nam

alex@alex-MS-7972:~$ grep -i "Nguyễn" list.txt | sort -t ":" -nk2 | head -3 > output.txt

alex@alex-MS-7972:~$ cat output.txt 

Nguyễn Thị Phương Thảo:1993: Bắc Ninh:Nữ
Nguyễn Việt Thắng:1993:Hà Tây:Nam
Nguyễn Bá Cương:1995: Hà Tây:Nam
```

Liệt kê tất cả các tiến trình đang chạy và sắp xếp PID giảm dần.
Liệt kê các tiến trình của root, sắp xếp theo % sử dụng CPU.
Trả lời: Các lệnh em đã dùng là:

```console
ps aux --sort=-pid
ps aux --sort=-pcpu | grep "^root"
```