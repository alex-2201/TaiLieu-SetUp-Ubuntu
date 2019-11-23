## BÀI TẬP THỰC HÀNH MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 4: LẬP TRÌNH SHELL
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---
**Bài tập 1:**
Viết chương trình cho biết tên năm âm lịch của một năm dương lịch cho trước.
Yêu cầu chương trình nhận năm dương lịch tại dòng lệnh.

Trả lời:

file `lunar_yearh.sh`
```sh
#!/bin/bash
function lunar_year() { 
    y1=$(($1 % 10))
    y2=$(($1 % 12))
    case $y1 in
        0) Can="Canh" ;;
        1) Can="Tan" ;;
        2) Can="Nham" ;;
        3) Can="Quy" ;;
        4) Can="Giap" ;;
        5) Can="At" ;;
        6) Can="Binh" ;;
        7) Can="Dinh" ;;
        8) Can="Mau" ;;
        9) Can="Ky" ;;
    esac
    case $y2 in
        0) Chi="Than" ;;
        1) Chi="Dau" ;;
        2) Chi="Tuat" ;;
        3) Chi="Hoi" ;;
        4) Chi="Ty" ;;
        5) Chi="Suu" ;;
        6) Chi="Dan" ;;
        7) Chi="Meo" ;;
        8) Chi="Thin" ;;
        9) Chi="Ty." ;;
        10) Chi="Ngo"  ;;
        11) Chi="Mui" ;;
    esac
    echo "$Can $Chi"
}
```
**Bài tập 2:**

Viết một chương trình thực hiện chức năng của lệnh ls, tuy thế lệnh mới sẽ liệt
kê các thư mục con trước rồi mới đến các tệp.

file `bai2.sh`
```sh
#!/bin/sh
ls -l | sort
```

Viết chương trình gọi chương trình lunar_year và in ra bảng các năm dương lịch
từ 1990 đến 2020 và tên năm âm lịch của chúng.

file `bai2b.sh`
```sh
source ./lunar_year.sh 
for year in {1990..2020}
do
    amLich=$(lunar_year "$year")
    echo "$year : $amLich"
done
```
**Bài tập 3:**

Tạo chương trình nộp bài “nop_bai” hoạt động như sau
– Khi người dùng đăng nhập vào hệ thống với tên người dùng, ví dụ là tuananh,
chương trình cho phép:
- Nếu người dùng chạy
    - $nop_bai tep1 tep2
    - Chương trình copy các tệp vào thư mục:
/home/baitaplinux/tuananh.
- Người dùng này không sửa được bài của người dùng kia.
- Bản thân người chủ tệp cũng không vào sửa bản nộp trực tiếp được
- Người dùng có thể nộp lại bản mới (xóa bản cũ) khi chạy lại lệnh nop_bai
- Ghi nhật ký vào file log.txt các lần chương trình nop_bai được chạy: ai chạy,
ngày giờ nào, câu lệnh gì

file `bai4.sh`
```sh
nop_bai() {
    destFolder=/home/baitaplinux/$LOGNAME
    ls $destFolder
    if [ $? -ne 0 ]
    then
        mkdir $destFolder
    fi
    for arg in "$@"
    do
        destFile=`echo "$destFolder/$arg"`
        rm $destFile
        sudo cp $arg $destFile
        chmod 400 $destFile
    done
    echo "`date`:$LOGNAME" >> log.txt
}
```