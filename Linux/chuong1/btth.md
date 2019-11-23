## BÀI TẬP THỰC HÀNH MÔN HỌC: LINUX VÀ PMMNM
## CHƯƠNG 1: MỞ ĐẦU
### _Họ và tên: Nguyễn Văn Sơn_
### _Mã lớp: ĐTLT.CNTT01-K3_
### _Mã sinh viên: 201910429_
---
## Bài TH 1: CÀI ĐẶT UBUNTU
## Bài TH 2: Git và GitHub

### Thiết lập chứng thực cá nhân
Sau khi cài Git xong, việc đầu tiên bạn nên làm là khai báo tên và địa chỉ email
vào trong file cấu hình của Git trên máy. Để làm điều này bạn sẽ cần sử dụng
hai lệnh sau đây để thiết lập tên và email.
$ git config --global user.name "Tran Anh"
$ git config --global user.email "contact@gmail.com"
Sau khi thiết lập xong, hãy xem nội dung file ~/.gitconfig bằng lệnh cat
~/.gitconfig ; Em thấy nội dung gì?

```console
alex@alex-Inspiron-3542:~$ git config --global user.name "Son Nguyen"

alex@alex-Inspiron-3542:~$ git config --global user.email "n.vanson.2201@gmail.com"

alex@alex-Inspiron-3542:~$ cat ~/.gitconfig
[user]
	email = n.vanson.2201@gmail.com
	name = Son Nguyen
[credential]
	helper = store
```

### Tạo local repository
```console
alex@alex-Inspiron-3542:~$ git init git_example
Initialized empty Git repository in /home/alex/git_example/.git/

alex@alex-Inspiron-3542:~$ cd git_example/

alex@alex-Inspiron-3542:~/git_example$ touch readme.txt

alex@alex-Inspiron-3542:~/git_example$ git add readme.txt

alex@alex-Inspiron-3542:~/git_example$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   readme.txt

alex@alex-Inspiron-3542:~/git_example$ git commit -m "First Commit"
[master (root-commit) 3537738] First Commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 readme.txt

```

### Tạo repository trên Github và làm việc

```console
alex@alex-Inspiron-3542:~$ git clone https://github.com/nguyenvanson2201/hoc-git.git
Cloning into 'hoc-git'...
warning: You appear to have cloned an empty repository.

alex@alex-Inspiron-3542:~$ cd hoc-git/

alex@alex-Inspiron-3542:~/hoc-git$ echo "# Huong dan Git co ban" > README.md

alex@alex-Inspiron-3542:~/hoc-git$ git add README.md

alex@alex-Inspiron-3542:~/hoc-git$ git commit -m "First commit on Github"
[master (root-commit) 7abd6db] First commit on Github
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
 ```
> Sau khi thực hiện các câu lệnh trên, tệp tin vẫn chưa xuất hiện trên github
```console
alex@alex-Inspiron-3542:~/hoc-git$ git push origin master
Counting objects: 3, done.
Writing objects: 100% (3/3), 250 bytes | 250.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/nguyenvanson2201/hoc-git.git
 * [new branch]      master -> master

```



