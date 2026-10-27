# TP1 

## Le BIOS

Pour démarrer dans le BIOS, au boot quand le logo DELL apparait, **F12** (parfois F11 ou F8).

**BIOS Setup** pour avoir info sur la machine

**TODO: A détailler**

**TODO: recap de tous le process install**

## Installation à partir d'un clé et d'un accès à internet (_netinstall_)

Une fois la clé inserré :

Choisir : **UEFI General UDisk 5.00**

Si la machine a déjà boot, **Ctrl+Alt+Supr** pour reboot la machine.

Il est interessant de mettre son dossier `/home` dans une partition separée. On sépare ainsi les données personnelles de celles du système :

* réinstaller Linux sans perdre ses données
* changer de distribution
* simplifier les sauvegardes
* avoir plusieurs partitions système partageant un même `\home` (multiboot) (attention cependant cela peut poser des problèmes de fichiers de config)).

## Schéma de partitionnement MBR et GPT

Les deux 2 principaux schéma de partitionnement (ou format de table de partionnement) sont **MBR** et **GPT**.

**MBR** (systèmes **DOS** notament) est la plupart du temps remplacé par **GPT** depuis 2013 (il ne gère pas les disques de plus de 2,199 To (en secteurs de 512 octets)). 

En **MBR** on avait une notion de partitions **Primaires** au nombre maximimum de **4**. Pour faire des partition supplémentaires on pouvait créer une partition étendue (type de partition Primaire spécial) qui pouvait alors contenir des partition logiques. Souvent on mettait le système dans une partition primaire et le reste dans différentes partitions logiques.

## FAT16 et FAT32

Les partitions **FAT16** et **FAT32** (systeme de fichier de Windows, mais aussi partition **ESP** (EFI partition system)) fonctionnent de la facon suivante : 

* notre partition est divisée en 2^16 ou 2^32 blocs memoires
* chaque bloc ayant une taille de _taille_partition_/2^16 (ou 2^32) octets

> Le pb, c'est qu'un fichier de 2 octets stockés dans un bloc de 8 fait perdre 6 octets.

## BIOS vs UEFI

**BIOS** a été remplacé par **EFI** puis par **UEFI**. **EFI** a donné son nom à **ESP**(EFI partition system), qui est la partition contenant les fichiers de boot **UEFI**. Cette partition est en **FAT32** (car largement supporté).

**UEFI + GPT** est la configuration standard actuelle.

Avant c'était **BIOS + MBR**.

Quand l'ordinateur démarre, **UEFI** charge le fichier **.efi** situé dans la partition **ESP**