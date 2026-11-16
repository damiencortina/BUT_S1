#! /usr/bin/bash

read -p "Saisir un login : " login
read -p "Saisir le nom complet : " name
read -s -p "Saisir le mdp : " motdepasse
useradd -p `mkpasswd ${motdepasse}` -c $name $login