#! /usr/bin/bash

read -p "Saisir un mot clé : " keyword
read -p "Saisir un nom de fichier : " filename
apt-cache search keyword > $filename
echo "Recherche terminée (voir $filename)"