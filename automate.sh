#!/bin/bash
exec > log.txt 2>&1   # All output goes to log.txt
#List of java file to create
files=("BubbleSort" "SelectionSort" "InsertionSort" "MergeSort" "QuickSort")
echo "Start creating the files...."
#Create java files
for file in "${files[@]}"; do
    fileName="$file.java"
    if [[ -f "$fileName" ]]; then
        echo "$fileName already exists. Skipping...."
        continue
    else
        echo "Creating file...."
        touch "$file.java" 
        fileName="$file"
        echo "public class $file {" >> "$file.java"
        methodName="$(tr '[:upper:]' '[:lower:]' <<< ${fileName:0:1})${fileName:1}"
        echo "    public static int[] $methodName(int arr[]) {" >> "$file.java"
        echo "        //Write your code here
                    
                    " >> "$file.java"
        echo "        return arr;" >> "$file.java"
        echo "    }" >> "$file.java"
        echo "}" >> "$file.java"
        echo "$file.java is created successfully which have the method $methodName also return arr"
    fi
done