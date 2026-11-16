#! /usr/bin/bash

read -p "Saisir un chemin de fichier : " path

read -p "Saisir la destination : " dest
mkdir $dest
cp -r $path $dest