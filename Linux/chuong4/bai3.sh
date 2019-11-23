#!/bin/bash
source ./lunar_year.sh 
for year in {1990..2020}
do
    amLich=$(lunar_year "$year")
    echo "$year : $amLich"
done