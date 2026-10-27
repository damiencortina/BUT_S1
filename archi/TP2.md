# TP2

**La première étape :**

> changer le mdp root et user !!!

> apt update

> apt upgrade

## Changer de terminal quand on est sans interface graphique

ALT + F1 (tty1)
ALT + F2 (tty2)
ALT + F3 (tty3)
ALT + F4 (tty4)
ALT + F5 (tty5)
ALT + F6 (tty6)

## Compte root et user

Le prompt d'un compte root est un `#`

Le prompt d'un compte user est un `$`

On ne peut pas supprimer un user actuellement connecté.

Deconnecter un user
```
logout
```

## addgroup

```bash
addgroup --gid 400 etud
```

`--gid` permet de spécifier un id pour le groupe.

## ID du user

**UID** : id du user

**GID** : id du group

Chaque utilisateur a son propre groupe, qui porte son nom, dans lequel il est seul.

## who

Liste les users connectés

## clear

Nettoie la fenetre (retire tous les affichages précédents)

## AJouter un user à un groupe

```
usermod -aG etud dcortina
```

## Attention ! Les droits d'un user ne sont maj que quand le user se connecte

## Les fichiers users

```bash
more /etc/passwd
```

```bash
more /etc/shadow
```

```bash
more /etc/group
```

Les lignes longues correspondent à des users qui ont un vrai mot de passe.

Les mdp sont cryptés, en fonction du temps (un meme mdp ne sera jamais crypté pareil)


## Changer le groupe primaire d'un user

```bash
usermod -g <groupe> <user>
```

```bash
usermod -gid <id_groupe> <user>
```

Attention, changer un groupe primaire doit être fait quand un user est déconnecté, sinon on cours le risque que certains fichiers du user soient rattachés à l'ancien group, puis au nouveau.

## Avoir des infos sur son user

```bash
whoami
```

```bash
id
```

## Fichiers :
**/etc/network/interfaces**

La configuration réseau

**/etc/hostname**

Nom de la machine (on peut modifier le nom du PC !!)

**/etc/hosts**

Liste des adresses dispo sur la machine ?

```bash
ping localhost
```

Tester la communication avec une adresse

```bash
ip address show
```


```bash
ifconfig
```

Configuration réseau

```bash
uname
```

Quand in se co sur une machine a distance on peut obtenir des infos dessus

-n pour le nom de la machine

-v pour la version du noyau

On pourrait utiliser dpkg pour récupérer la liste des paquets et utiliser cette liste pour restaurer la machine ailleurs.

Avec dpkg -l on liste les paquets installés, y compris leur version d'architecture.

On peut installer du 32bit sur un pc 64bit

All signifie que 32 et 64 sont dispos sur la machine (peut etre parce que c'est du 32)

dpkg --print-architecture

dpkg --add-architecture

i386 processeurs intel de milieu 90 (32bits)

apt dist-upgrade update la version de la distribution

le paquet gpm ajoute la souris dans le terminal !!!


cat /dev/input/mice permet quand on bouge la souris de voir le fichier souris se remplire