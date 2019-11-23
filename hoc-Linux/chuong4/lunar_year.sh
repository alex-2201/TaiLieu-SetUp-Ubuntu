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