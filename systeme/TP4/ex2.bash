#! /usr/bin/bash

read -p "Saisir un login : " login
echo "Si le login s'affiche c'est qu'il existe."
cat /etc/passwd | cut -d : -f1 | grep "^${login}$"