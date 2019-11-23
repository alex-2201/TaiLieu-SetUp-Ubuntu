## BÀI TẬP THỰC HÀNH MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 2: HỆ THỐNG TỆP
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---

## Bài TH 1: Các câu lệnh cơ bản của hệ thống tệp
Bạn dùng lệnh gì để tìm ý nghĩa của câu lệnh ls bằng lệnh whatis

Trả lời:
```console 
alex@alex-MS-7972:~$ whatis ls
ls (1)               - list directory contents
```
Tìm đường dẫn đầy đủ đến tệp chương trình của ls

Trả lời:
```console
alex@alex-MS-7972:~$ which ls
/bin/ls
```
Tra cứu hướng dẫn sử dụng của lệnh này.
Trả lời:
```console
alex@alex-MS-7972:~$ man ls
```
Trong thư mục cá nhân của bạn, làm các việc sau :

Tạo 10 file : file1.txt, file2.txt, ..., file10.txt

Tạo 3 thư mục folder1, folder2, folder3

Dùng lệnh ls để liệt kê và xem các quyền truy cập của các thư mục và file.

Chuyển các file 1-3 vào thư mục folder2, các files 4-6 vào thư mục folder1, các
files 7-10 vào thư mục folder3

Trả lời: các lệnh em vừa sử dụng là:
```console
alex@alex-MS-7972:~$ touch file1.txt file2.txt file3.txt file4.txt file5.txt file6.txt file7.txt file8.txt file9.txt file10.txt
alex@alex-MS-7972:~$ mkdir folder1 folder2 folder3
alex@alex-MS-7972:~$ ls -l
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file10.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file1.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file2.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file3.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file4.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file5.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file6.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file7.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file8.txt
-rw-r--r-- 1 alex alex    0 Thg 1  5 22:23 file9.txt
drwxr-xr-x 2 alex alex 4096 Thg 1  5 22:03 folder1
drwxr-xr-x 2 alex alex 4096 Thg 1  5 20:51 folder2
drwxr-xr-x 2 alex alex 4096 Thg 1  5 22:24 folder3
alex@alex-MS-7972:~$ mv file1.txt file2.txt file3.txt folder1
alex@alex-MS-7972:~$ mv file4.txt file5.txt file6.txt folder2
alex@alex-MS-7972:~$ mv file7.txt file8.txt file9.txt file10.txt folder3
```
Lệnh sau sẽ làm gì :
```console
alex@alex-MS-7972:~$ ls -l folder1 folder2 folder3
folder1:
total 0
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file1.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file2.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file3.txt

folder2:
total 0
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file4.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file5.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file6.txt

folder3:
total 0
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file10.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file7.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file8.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file9.txt
```
> Liệt kê các file có trong các folder1 folder2 folder3

Dùng cơ chế đường ống để sắp xếp đầu ra của lệnh trên (kết hợp với lệnh sort)
```console
alex@alex-MS-7972:~$ ls -l folder1 folder2 folder3 | sort


folder1:
folder2:
folder3:
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file10.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file1.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file2.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file3.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file4.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file5.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file6.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file7.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file8.txt
-rw-r--r-- 1 alex alex 0 Thg 1  5 22:23 file9.txt
total 0
total 0
total 0
```
Dùng lệnh gì để xoá thư mục folder3?
```console
alex@alex-MS-7972:~$ rm -R folder3
```
## Bài TH 2: Quản lý User, Group
Tạo 3 nhóm sau : Tin1, Tin2, Tin3
```console
alex@alex-MS-7972:~$ sudo groupadd Tin1
alex@alex-MS-7972:~$ sudo groupadd Tin2
alex@alex-MS-7972:~$ sudo groupadd Tin3
```
Tạo các người dùng với các thông tin sau :
```console
alex@alex-MS-7972:~$ sudo adduser user1
Adding user `user1' ...
Adding new group `user1' (1001) ...
Adding new user `user1' (1001) with group `user1' ...
Creating home directory `/home/user1' ...
Copying files from `/etc/skel' ...
Enter new UNIX password: 123456
Retype new UNIX password: 123456
passwd: password updated successfully
Changing the user information for user1
Enter the new value, or press ENTER for the default
	Full Name []: 
	Room Number []: 
	Work Phone []: 
	Home Phone []: 
	Other []: 
Is the information correct? [Y/n] y
alex@alex-MS-7972:~$ sudo adduser user2
...
alex@alex-MS-7972:~$ sudo adduser user3
...
alex@alex-MS-7972:~$ sudo adduser user4
...
alex@alex-MS-7972:~$ sudo adduser user5
...
alex@alex-MS-7972:~$ sudo adduser user1 Tin1
alex@alex-MS-7972:~$ sudo adduser user2 Tin1
alex@alex-MS-7972:~$ sudo adduser user3 Tin2
alex@alex-MS-7972:~$ sudo adduser user4 Tin1
alex@alex-MS-7972:~$ sudo adduser user4 Tin2
alex@alex-MS-7972:~$ sudo adduser user5 Tin2
alex@alex-MS-7972:~$ sudo adduser user5 Tin3
```
Gõ lệnh :
less /etc/passwd
```console
alex@alex-MS-7972:~$ less /etc/passwd
user1:x:1001:1001:,,,:/home/user1:/bin/bash
user2:x:1002:1002:,,,:/home/user2:/bin/bash
user3:x:1003:1003:,,,:/home/user3:/bin/bash
user4:x:1004:1005:,,,:/home/user4:/bin/bash
user5:x:1005:1008:,,,:/home/user5:/bin/bash
/etc/passwd (END)
```
> Each line contains seven attributes or fields: name, password, user ID, group ID, gecos, home directory and shell.

tham khảo
http://www.linfo.org/etc_passwd.html

Gõ lệnh
less /etc/group
Chỉ ra các dòng có ghi thông tin về group và các thành viên trong group đó.
```console
alex@alex-MS-7972:~$ less /etc/group
Tin1:x:1004:user1,user2,user4
Tin2:x:1006:user3,user4,user5
Tin3:x:1007:user5
(END))
```
Xóa user5 và thư mục cá nhân của user5 khỏi hệ thống.
```console
alex@alex-MS-7972:~$ sudo deluser --remove-home  user5
Looking for files to backup/remove ...
Removing files ...
Removing user `user5' ...
Warning: group `user5' has no more members.
Done.
alex@alex-MS-7972:~$ ls ..
alex  linuxbrew  user1  user2  user3  user4
```
## Bài TH 3: Liên kết vật lý và biểu tượng

Lệnh gì để tạo một liên kết vật lý đến tệp file1.txt, đặt tên là hardlinkfile.txt
Lệnh gì để tạo một liên kết biểu tượng đến file1.txt, đặt tên là softlinkfile.txt
Lệnh gì để xem inode-ID của 2 file liên kết vừa tạo ?
Ghi vào file1.txt nội dung sau:

    Truong Dai Hoc Bach Khoa Ha Noi

```console
alex@alex-MS-7972:~$ ln /folder1/file1.txt hardlinkfile.txt
alex@alex-MS-7972:~$ ln -s  ./folder1/file1.txt softlinkfile.txt
alex@alex-MS-7972:~$ ls -li hardlinkfile.txt
35784538 -rw-r--r-- 2 alex alex 27 Thg 1  5 22:07 hardlinkfile.txt 
alex@alex-MS-7972:~$ ls -li softlinkfile.txt
34392009 lrwxrwxrwx 1 alex alex 19 Thg 1  5 22:05 softlinkfile.txt -> ./folder1/file1.txt
alex@alex-MS-7972:~$ echo "Dai Hoc Bach Khoa Ha Noi" > ./folder1/file1.txt
```

Mở 2 file liên kết vừa tạo để xem nội dung (lệnh cat)
Sửa hardlinkfile.txt thành:
Truong Dai Hoc Xay Dung Ha Noi

```console
alex@alex-MS-7972:~$ gedit hardlinkfile.txt
```

Bây giờ kiểm tra nội dung của file1.txt và softlinkfile.txt
```console
alex@alex-MS-7972:~$ cat softlinkfile.txt 
Dai Hoc Xay Dung Ha Noi
alex@alex-MS-7972:~$ cat ./folder1/file1.txt
Dai Hoc Xay Dung Ha Noi
```
Bạn nhận thấy điều gì?
> Nội dung cả 2 file còn lại đều là Dai Hoc Xay Dung Ha Noi

Làm tương tự khi thay đổi nội dung softlinkfile.txt và kiểm tra nội dung của 2 files
còn lại. Bạn rút ra kết luận gì?

```console
alex@alex-MS-7972:~$ gedit softlinkfile.txt 
alex@alex-MS-7972:~$ cat ./folder1/file1.txt
Dai Hoc Cong Nghiep Ha Noi
alex@alex-MS-7972:~$ cat hardlinkfile.txt 
Dai Hoc Cong Nghiep Ha Noi
```

> Cả 2 file còn lại cũng thay đổi giống file softlinkfile.txt

## Bài TH 4: Quyền và phân quyền

Tạo 1 file foo.txt

Gõ lệnh

ls –l foo.txt

Giải thích 10 ký tự đầu tiên về việc phân quyền của file.
Trả lời:
```console
alex@alex-MS-7972:~$ touch foo.txt
alex@alex-MS-7972:~$ ls -l foo.txt

-rw-r--r-- 1 alex alex 0 Thg 1 10 21:48 foo.txt
```


1. '-' : tệp thông thường
2. 'r' : người sở hữu có quyền đọc
3. 'w' : người sở hữu có quyền ghi
4. '-' : người sở hữu không có quyền thực thi
5. 'r' : nhóm người sử dụng có quyền đọc
6. '-' : nhóm người sử dụng không có quyền ghi
7. '-' : nhóm người sử dụng không có quyền thực thi
8. 'r' : những người sử dụng khác có quyền đọc
9. '-' : những người sử dụng khác không có quyền ghi
10. '-' : những người sử dụng khác không có quyền thực thi

Tạo 1 file foo2.txt

Gõ lệnh

umask 0007

ls –l foo2.txt

Giải thích vì sao quyền truy cập của foo2.txt và foo.txt lại khác nhau.

Trả lời:

```console
alex@alex-MS-7972:~$ umask 0007
alex@alex-MS-7972:~$ touch foo2.txt
alex@alex-MS-7972:~$ ls -l foo2.txt
-rw-rw---- 1 alex alex 0 Thg 1 10 21:54 foo2.txt
```

Lệnh umask thay đổi quyền ngầm định khi tạo mới file. Tham số 0007 có ý nghĩa:
```console
alex@alex-MS-7972:~$ umask -S
u=rwx,g=rwx,o=
```
Người dung khác không được gán quyền gì cả.

Thay đổi quyền truy cập cho file foo.txt để chỉ người sở hữu file có quyền đọc và
ghi. Còn tất cả các người khác không có quyền gì cả.

Trả lời: các lệnh em vừa sử dụng là:

```console
alex@alex-MS-7972:~$ sudo chmod go-rw foo.txt
alex@alex-MS-7972:~$ ls -l foo.txt
-rw------- 1 alex alex 0 Thg 1 10 21:48 foo.txt
```

Đăng nhập bằng account của user2, thử đọc thông tin tệp foo.txt

Đăng nhập lại bằng account của bạn, tìm cách thay đổi quyền để user2 có thể đọc
được thông tin của file foo.txt


Dùng lệnh chown để đổi quyền sở hữu của tệp foo2.txt sang cho người dùng là
user3 và group Tin2.

Trả lời: các lệnh em vừa sử dụng là:
```console
user2@alex-MS-7972:~$ cat foo.txt
cat: foo.txt: Permission denied
alex@alex-MS-7972:~$ sudo chmod 664 foo2.txt
alex@alex-MS-7972:~$ sudo chown user3:Tin2 foo2.txt
alex@alex-MS-7972:~$ ls -l foo2.txt
-rw-rw-r-- 1 user3 Tin2 0 Thg 1 10 22:00 foo2.txt
```