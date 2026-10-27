# TP3

[PDF des consignes](https://iut.e-concept-applications.fr/TP3-IntroSys-S1.pdf)

[PDF des corrections](https://iut.e-concept-applications.fr/TP3-IntroSys-S1-correction.pdf)

## Question 1

Lister les fichiers du répertoire « /home/toto/Documents/ » dont le nom de fichier commence par « TP »

```bash
ls /home/toto/Documents/TP*
```

## Question 2

Lister les fichiers du répertoire « /home/toto/Documents/ » dont le nom de fichier commence par « TP » suivi d’un caractère suivi de « .txt »

```bash
 ls /home/toto/Documents/TP*.txt
 ```

 ## Question 3

 Lister les fichiers du répertoire « /home/toto/Documents/ » dont le nom de fichier contient le mot « cours » et se terminant par « .pdf »

 ```bash
ls /home/toto/Documents/*cours*.pdf
 ```

 ## Question 4

 Ajouter le droit en exécution sur le fichier toto.sh pour l’utilisateur et le groupe, sans modifier les autres droits

 ```bash
chmod ug+x toto.sh
 ```

 ## Question 5

 Copier le fichier toto.txt dans le répertoire /var en changeant son nom pour titi.txt (en une seule commande)

 ```bash
cp toto.txt /var/titi.txt
 ```

 ## Question 6

Créer les répertoires toto et toto/titu en une seule commande

 ```bash
mkdir -p toto/titu
 ```

## Question 7

Rechercher tous les fichiers PDF dans le profil utilisateur de toto

```bash
find /home/toto -name *.pdf
```

ou

```bash
find /home/toto -iname *.pdf
```

## Question 8

Créer l’alias « lc » permettant d’afficher la liste des fichiers en colonnes

```bash
alias lc="ls -C"
```

## Question 9

Lister uniquement les répertoires du répertoire courant

```bash
ls -d */
```

ou

```bash
ls -l | grep "^d"
```

## Question 10

Lister les fichiers du répertoire courant en affichant pour chaque fichier uniquement le mode et le nom du fichier

```bash
ls -l | awk '/^-/{print $1, $9}'
```

## Question 11

Lister uniquement les répertoires du répertoire courant, et en n’affichant que le nom des répertoires
listés

```bash
ls -l | awk '/^d/{print $9}'
```

## Question 12

Afficher la liste des utilisateurs du système ainsi que le terminal qu’ils utilisent (et uniquement ça)

```bash
cat /etc/passwd | awk -F ':' '{print $1, $7}'
```

## Question 13

Afficher les lignes 20 à 50 du fichier /var/log/boot.log en partant de la fin, et qui ne commencent pas par le mot « Oct ».

```bash
sudo cat /var/log/boot.log | tail -n 50 | head -n 20 | grep -v '^Oct'
```

## Question 14

Affichez les dix plus gros fichiers ou répertoire figurant dans le dossier /home/toto/

```bash
du -h /home/toto | sort -hr | head
```