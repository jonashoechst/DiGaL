#!/bin/bash

cat *.tex | tr ' ' '\
' | tr '[:upper:]' '[:lower:]' | tr -d '[:punct:]' | grep -v '[^a-z]' | sort | uniq -c | sort -rn | head -50