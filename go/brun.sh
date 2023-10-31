#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Usage: $0 <filename>"
  exit 1
fi

filename=$1

start_time=$(date +%s.%N)
go build -o "$filename" "$filename.go"
end_time=$(date +%s.%N)

elapsed_time=$(echo "$end_time - $start_time" | bc)
echo "Build time: $elapsed_time seconds"

./$filename