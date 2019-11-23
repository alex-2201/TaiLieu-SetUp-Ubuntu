#!/bin/bash
Nop_bai() {
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