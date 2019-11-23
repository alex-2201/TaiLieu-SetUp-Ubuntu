## BÀI TẬP LÝ THUYẾT MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 2: HỆ THỐNG TỆP
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---
**Câu hỏi 1**: So sánh liên kết vật lý và liên kết biểu tượng.

Trả lời:

## Key Differences Between Hard link and Soft link

1. A hard link is an additional name of the original file which refers inode to access the target file. In contrast, soft link is distinct to the original file and is an alias to original file but do not uses inode.

2. When an original file gets deleted soft link becomes invalid whereas, a hard link is valid even if the target file is deleted.

3. In Linux, the command used for the creation of hard link is "ln". As against, the command used for a soft link is "ln -s".

4. Hard link has same inode number dissimilar to soft link, where target file and its soft link have distinct inode number.

5. Hard links are restricted to its own partitions, but soft links can cover different file systems.

6. The performance of hard link is better than soft link in some cases.

7. Relative path and absolute path both are allowed in soft links. On the contrary, the relative path is not allowed in a hard link.

link https://techdifferences.com/difference-between-hard-link-and-soft-link.html

**Câu hỏi 2**: Trình bày các bước để xem các quyền truy cập của 1 tệp. Ta có thể
dùng lệnh gì để thay đổi quyền truy cập của 1 tệp? Đưa ra một ví dụ.

Trả lời:

```console
alex@alex-MS-7972:~$ ls -l myfile.txt 
-rw-r--r-- 1 alex alex 0 Thg 1  5 23:28 myfile.txt
alex@alex-MS-7972:~$ chmod 6711 myfile.txt # 1 1 0 111 001 001 means set_uid=1 set-gid=1 sticky=0
alex@alex-MS-7972:~$ ls -l myfile.txt 
-rws--s--x 1 alex alex 0 Thg 1  5 23:28 myfile.txt
alex@alex-MS-7972:~$ chmod g+w myfile.txt   # group thêm quyền write
alex@alex-MS-7972:~$ ls -l myfile.txt 
-rws-ws--x 1 alex alex 0 Thg 1  5 23:28 myfile.txt
alex@alex-MS-7972:~$ chmod a-rw myfile.txt # all bỏ quyền read, write
alex@alex-MS-7972:~$ ls -l myfile.txt 
---s--s--x 1 alex alex 0 Thg 1  5 23:28 myfile.txt
alex@alex-MS-7972:~$ chmod a=rw myfile.txt 
alex@alex-MS-7972:~$ ls -l myfile.txt
-rw-rw-rw- 1 alex alex 0 Thg 1  5 23:28 myfile.txt
```

**Câu hỏi 3**: Lệnh chown để làm gì? Cho ví dụ.

Trả lời:
> Thay đổi người sở hữu

```console
alex@alex-MS-7972:~$ ls -l myfile.txt
-rw-rw-rw- 1 alex alex 0 Thg 1  5 23:28 myfile.txt
alex@alex-MS-7972:~$ sudo chown user1 myfile.txt # change from alex to user1  
[sudo] password for alex: 
alex@alex-MS-7972:~$ ls -l myfile.txt
-rw-rw-rw- 1 user1 alex 0 Thg 1  5 23:28 myfile.txt
```

Bổ xung thay đổi group:
```console
alex@alex-MS-7972:~$ sudo chgrp Tin1 myfile.txt
alex@alex-MS-7972:~$ ls -l myfile.txt
-rw-rw-rw- 1 user1 Tin1 0 Thg 1  5 23:28 myfile.txt

```

## ref
https://unix.stackexchange.com/questions/79395/how-does-the-sticky-bit-work
