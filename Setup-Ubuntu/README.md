# Cai Google Chorme

buoc 1: download tap tin
Doi voi 64 bit
```
$ cd /tmp
$ wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
```
buoc 2: cai dat tap tin
```
$ sudo dpkg -i google-chrome-stable_current_*
```
Nếu bạn gặp lỗi “Errors were encountered while processing“, đây là lỗi thiếu một số gói ứng dụng cần thiết để sử dụng được Google Chrome. Nhập dòng lệnh sau, nhấn Enter nếu được hỏi “Do you want to continue [Y/n]?“:
```
$ sudo apt-get -f install
```
# Cai dat NVM, Nodejs va NPM

cai dat curl:
```
sudo apt install curl
```
buoc 2: cai dat nvm
```
curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
```
Reload system environment using this command. It will set the required environment variables to use nvm on the system.
dung lenh duoi
```
source ~/.profile     ## Debian based systems 
source ~/.bashrc      ## CentOS/RHEL systems 
```
buoc 3: cai nodejs
- liet ke cac nodejs
```
nvm ls-remote
```
- cai dat nodejs
```
nvm install v10.16.3
```
buoc 4: Set Node.js Default Version
- xem version nao dang la default:
```
nvm list
```
- chon version default:
```
nvm use v10.16.3
```
- kiem tra:
```
nodejs -v
```
# Cai pyenv
buoc 1 : cai git

```
sudo apt install git
```
buoc 2 cai pyenv:
```
curl https://pyenv.run | bash
curl -L https://github.com/pyenv/pyenv-installer/raw/master/bin/pyenv-installer | bash

```
add path vao bashrc

`printf 'export PATH="$HOME/.pyenv/bin:$PATH"\neval "$(pyenv init -)"\neval "$(pyenv virtualenv-init -)"\n' >> ~/.bashrc`

tat terminal xong bat lai.
```
pyenv update
```
buoc 3: cai python
```
pyenv install --list
```
sau do cai cac goi can thiet
```
sudo apt-get install -y make build-essential libssl-dev zlib1g-dev libbz2-dev \
libreadline-dev libsqlite3-dev wget curl llvm libncurses5-dev libncursesw5-dev \
xz-utils tk-dev libffi-dev liblzma-dev python-openssl git
```
tiep theo chon version de install
```
pyenv install 3.7.0
```
Xem cac version co trong pyenv:
```
pyenv versions
```
Chon version lam global vi du 3.7.0
```
pyenv global 3.7.0
```

- Su dung cho local project:
```
$ pyenv install 3.7.0
Installed Python-3.7.0 to /Users/dvf/.pyenv/versions/3.7.0
$ mkdir my_project && cd my_project
$ python --version
Python 3.6.6
$ pyenv local 3.7.0
$ python --version
Python 3.7.0
```

[Cac loi thuong xay ra khi build](https://github.com/pyenv/pyenv/wiki/Common-build-problems)

# cai dat pipenv
buoc 1: cai dat pip

https://linuxize.com/post/how-to-install-pip-on-ubuntu-18.04/

```
sudo apt update
sudo apt install python3-pip
sudo pip3 install pipenv
```
Cai dat pipenv cho project
```
mkdir python-example && cd python-example
pipenv --python 3.6
```
Link tham khao

Su dung pipenv va pyenv
https://viblo.asia/p/su-dung-pyenv-pipenv-cho-cac-du-an-python-cua-ban-L4x5xdyr5BM

# Cai dat unikey
buoc 1:https://vinasupport.com/huong-dan-cai-bo-go-tieng-viet-ibus-unikey-tren-ubuntu/

buoc 2: https://askubuntu.com/questions/1029588/18-04-ctrlshift-to-change-language
You can set such keyboard shortcut as follows:

On Ubuntu 18.04 LTS and 19.04 with GNOME desktop from GNOME Tweaks.

Install it

sudo apt-get install gnome-tweaks
Then open GNOME Tweaks (gnome-tweaks).

Select Keyboard & Mouse tab
Click Additional Layout Options button
Expand Switching to another layout
Select Ctrl + Shift here
See screenshot below:

GNOME Tweaks - set <Ctrl+Shift>

# Cai dat Docker
https://docs.docker.com/install/linux/docker-ce/ubuntu/

