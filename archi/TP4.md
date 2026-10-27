# TP4

Quand on télécharge une nouvelle version du noyau, il faut redémarrer le PC pour que le PC démarrer sur le nouveau noyau.

Avec un apt automremove, on supprime ensuite une ancienne version de linux (plusieurs anciennes versions du noyau sont conservés, on pourra démarrer dessus en cas de pb sur la version actuelle du noyau).

```bash
apt autoremove
...
...
...
Suppression de linux-image-XXXX+deb13-amd64
...
...
```

Installer de quoi ouvrir un pdf

```bash
apt install evince
```

```bash
apt install firefox-est
```

Quand on télécharge un logiciel, le télécharger dans **/opt**

ex:

```bash
cd /opt
wget <google chrome>
apt install ./<google>
```

> Utiliser `apt install ./<nom_fichier>` plutôt que dpkg car cela permet de télécharger les dépendances !

Dans `/etc/apt/sources.list.d` on trouve l'adresse du repo google qui a été ajoutée à l'install du paquet chrome.

Le fichier est `google-chrome.sources`. Certains anciens fichiers sont en `.list`

ATTENTION, route n'a pas le droit de lancer virtualbox quand on su -, repasser sur notre user.

SUpprimer un paquet install manuellement

```bash
apt remove --purge <nom paquet>
```

(comme quand installé depuis un dépot)

```bash
echo "lien" > /etc/apt/sources.list.d/<toto>.list