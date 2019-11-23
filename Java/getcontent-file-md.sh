#!/bin/bash
# Author: Sơn Đỗ Xuân

# Description: Get content from file markdown.
# Usage manual: Execute command: bash getcontent-file-md.sh <file_md>

count=0
cat $1 | grep '^# \|^## \|^### \|^#### \|^##### \|^###### \|^```' |
	while read -r title
	do
		var1="\`\`\`"
		if [ "$title" = "$var1" ]
		then
			count=`expr $count + 1`
		fi	
		
		if [ `expr $count % 2` == 1 ]
		then
			continue
		fi
		
		var2=`echo ${title:0:6}`
		if [ "$var2" = "######" ]
		then
			title=`echo $title | sed 's/^###### //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "          - [$title](#$link)"
			continue
		fi
		var2=`echo ${title:0:5}`
		if [ "$var2" = "#####" ]
		then
			title=`echo $title | sed 's/^##### //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "        - [$title](#$link)"
			continue
		fi
		var2=`echo ${title:0:4}`
		if [ "$var2" = "####" ]
		then
			title=`echo $title | sed 's/^#### //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "      - [$title](#$link)"
			continue
		fi
		var2=`echo ${title:0:3}`
		if [ "$var2" = "###" ]
		then
			title=`echo $title | sed 's/^### //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "    - [$title](#$link)"
			continue
		fi
		var2=`echo ${title:0:2}`
		if [ "$var2" = "##" ]
		then
			title=`echo $title | sed 's/^## //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "  - [$title](#$link)"
			continue
		fi
		var2=`echo ${title:0:1}`
		if [ "$var2" = "#" ]
		then
			title=`echo $title | sed 's/^# //'`
			link=$(echo $title | tr 'A-Z ' 'a-z-' | tr -d '.,:?`\(\)')
			echo "- [$title](#$link)"
			continue
		fi
	done