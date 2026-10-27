# TP3

> Attention en tentant de de se connecter au reseau de l'iut il peut manquer curl (a installer avec apt)

>

## Se connecter au réseau(spécifique )


Status de la connexion
```bash
status-portal.sh
```

Se connecter
```bash
logon-portal.sh
```

Se déco
```bash
logout-portal.sh
```

Lister les paquets qui peuvent etre update (ca marche pas, à creuser)

```bash
apt list --upgradable
```

Sur la machine en général il n'y a que deux versions du noyau (celle qui est installée, et la nouvelle). (En cas de kernel panic, on peut bouter sur l'ancienne version).


```bash
nano /etc/apt/sources.list
```

Mise à jour de l'ip vers ftp.u-strasbg.fr et ajout des dépots contrib et non-free

Réinstallation de gpm (souris dans le terminal)

```bash
apt install gpm
```


Affichage des périphériques
```bash
lspci
```
La ligne VGA indique la carte graphique

Installation de xorg
```bash
apt install xorg
```

Démarer xorg
```bash
startx
```

> on pourrait aussi décider d'installer wayland plutöt que xorg

Installer Mate (choix dans ce TP)
```bash
apt install mate-core
```

mate-core contient une installation minimale de mate (peux de programmes en plus)

Creuser la commande tasksel (voir manuel du TP)

> On peut installer plusieurs envs de bureau et démarrer avec startx