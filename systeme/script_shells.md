

Plusieurs 


Un fichier commence par un shebang "#!/bin/bash"

## APpeler un script shell

```
./monscript.sh
```

Le script doit avoir les droits d'execution
La premère ligne doit indiquer le shell à appeller

```
/bin/bash monscript.sh
```

Pas besoin droit d'exec, droit de lecture suffit

## Variable

```
mavariable='mavaleur'
```

AUCUN ESPACE AUTOUR DU = !!
Sinon ça ne marche pas

Pour mettre une ' dans un texte entre apostrophe, il faut l'échapper:

```bash
mavariable='Mon texte n\'est pas incroyable'
```

```bash
echo $mavariable
```

Une var $toto peut s'écrire ${toto}

```bash
echo "Taille ${mavariable}"
```

## Les quotes

* `''` chaîne non analysée
* `""` chaîne non analysée.
* `` sera remplacé par le résultat de l'execution de ce qui se trouve entre parenthèse.

equivalent à $()

La différence, c'est que $() est imbricable (l'execution commencera par les paranthèses les plus profondes)

Pas la peine d'échapper les guillements à l'interieur d'un `$()`.

## Les variables

```bash
read mavariable
```

Demander au user de saisir une variable.

Pour lire plusieurs var

```bash
read mavariable1 mavariable2
```

```bash
read -p 'Entrez votre nom' name
```

-s masque la saisie (pour un mdp par ex)

-t ajoute un timer (valeur vide utilisée si dépassé)

> La doc de read se trouve dans man bash (et non man read (doc de read en C))

## Calcul mathématique

Utilisation de let pour les calculs

```bash
let "a = 5 * 3"
```

Utiliser un dollar ici va avoir un impact sur l'ordre d'execution.

### Dates

```bash
dateDebut=$(date +%s)
```

Autres possibilités de calculs :

* bc
* $(())

## Paramètres et codes de retour

Pour passer des paramètres

```bash
./monscript var1 var2
```

Seront accessibles avec

```bash
$0 # non du script
$1 # var1
$2 # var2
$# # nombre de paramètres
```
Si on veut plus de 9 paramètres `shift` si v.bash < 3

### Codes de retour

Les commandes renvoient un code de retour entre 0 et 255.

0 signifie execution OK

On peut récupérer le code de retour dans 

```bash
$? # contient le code retour
```

Attention $? change à CHAQUE exécution, il faut donc stocker sa valeur dans une autre variable si on veut réutiliser sa valeur.

#### Renvoie manuel

```bash
return 0
# or
exit
```

Si rien n'est indiqué, il renverra automatiquement 0.

## Tests et Conditions

```bash
test "${login}" = "toto"
# or
["${login}" = "toto"]
```

### Condition

```bash
if ["${login}" = "toto"]
then
    echo "C'est vrai"
elif [test]
then
#...
else
    echo "C'est pas vrai"
fi
```

#### 3 tests possibles

##### test sur chaîne

Attention, le = ne permet pas de comparer des nombres.

##### test sur des nombres

```bash
-eq
-ne
-lt
-le
-gt
-ge
```

##### Test sur des fichiers

```bash

```

#### combiner les tests

```bash
&& et ||
```

Peut aussi s'utiliser pour lier conditionnelement l'exec des plusieurs commandes

Ou au sein d'un test

```bash
-o
```

On peut faire des tests plus complexes avec des {} pour gérer la priorité dans les conditions

On peut aussi utiliser des () mais il faut toutes les échapper.

