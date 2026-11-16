# TD8 – Mélange de tableaux

## Introduction

Dans ce TD, vous écrirez des programmes permettant de mélanger un tableau. Nous utiliserons des tableaux d'entiers, mais n'importe quel autre type pourrait être utilisé à la place. Le premier programme procédera au mélange dans un nouveau tableau. Le second programme utilisera l'algorithme de **Fisher-Yates** pour faire un mélange en place.

Pour créer un mélange, il vous faut une fonctionnalité pour générer des nombres aléatoires. Pour cela, vous vous baserez sur la classe `Random` de `java.util`. Celle-ci permet notamment de générer des nombres entiers. Pour utiliser cette classe, vous devez tout d'abord l'importer dans votre fichier :

```java
import java.util.Random;
```

Vous pouvez ensuite créer une instance de `Random` pour l'utiliser dans votre code :

```java
Random random = new Random();
```

Dans cette ligne de code, nous avons créé une variable nommée `random`, de type `Random`, qui va nous permettre de générer des nombres pseudo-aléatoires. Ce qui nous intéresse ici est la production de nombres entiers avec une valeur maximale. Pour faire ça, vous utiliserez un code s'inspirant de la ligne suivante :

```java
int value = random.nextInt(10);
```

Le code ci-dessus génère un nombre entre 0 et 9 (la borne indiquée dans la méthode `nextInt` est exclue du tirage), avec une probabilité équivalente pour chacune des valeurs possibles.

## Exercice 1

Le premier exercice consiste à écrire une procédure qui prend en paramètre un tableau, et un indice contenu dans le tableau. La procédure va supprimer l'élément situé à l'indice passé en paramètre, en décalant le reste du tableau de façon à écraser cette valeur par la suivante, et ainsi de suite, jusqu'au bout du tableau. Le pseudo-code sera quelque chose de semblable à ceci :

```
procedure supprElement(T : tableau d'entiers, indice : entier)
    pour i de indice à taille(T) − 2 faire
        T[i] := T[i + 1]
    fin pour
fin procedure
```

Par exemple, si dans un tableau contenant les valeurs de 1 à 5, je veux supprimer celle à l'indice 2 (la valeur 3 donc), j'ai au départ :

```
1 2 3 4 5
```

La suppression doit conduire à supprimer 3 :

```
1 2 X 4 5
```

Il faut donc décaler les valeurs à droite du X d'une case vers la gauche :

```
1 2 4 5
```

> **Note :** le cinquième élément existe toujours (et vaut encore 5) et devra être ignoré dans les utilisations ultérieures du tableau.

## Exercice 2

Dans cette première version du mélange, on va prendre les éléments tirés du tableau d'origine, et les déplacer dans un nouveau tableau. Le principe détaillé est le suivant :

- tant que le tableau d'origine n'est pas vide, on tire un nombre aléatoire compris entre zéro inclus et le nombre d'éléments restant à mélanger exclus ;
- l'élément choisi est copié dans le tableau de destination (au premier indice libre) ;
- il est supprimé du tableau d'origine (il faut donc glisser les éléments restants vers la gauche pour garder un tableau d'un seul tenant – réutilisez la fonction de l'exercice précédent).

## Exercice 3

Dans cette version du mélange, nommée **algorithme de Fisher-Yates**, on part du haut du tableau et on échange la dernière valeur, puis l'avant-dernière, etc. avec une valeur du reste du tableau (ce qui est avant la valeur en cours d'échange) tirée aléatoirement via son indice.

Par exemple, on commence par un tableau ordonné avec :

```
1 2 3 4 5
```

On va remplacer le 5 (dernier élément, d'indice 4) par une des valeurs qui précèdent. Par exemple, l'appel à `nextInt(4)` nous donne 2 : on échange `tab[4]` avec `tab[2]` et on a alors :

```
1 2 5 4 3
```

La valeur 5 a été mélangée, on va maintenant faire de même avec la valeur qui précède, donc 4 (indice 3). On tire maintenant une valeur à sa gauche, avec `nextInt(3)`. Le résultat est par exemple 0, ce qui donne :

```
4 2 5 1 3
```

Les deux dernières valeurs sont mélangées, on va maintenant faire de même avec la valeur à la position 2 (c'est 5). On l'échange avec une valeur tirée parmi `nextInt(2)`. Mettons qu'on obtienne 1, le résultat sera :

```
4 5 2 1 3
```

On peut arrêter là (ou faire encore une itération, qui sera forcément une inversion car on tirera une valeur avec `nextInt(1)` qui renvoie zéro). On a donc notre tableau mélangé.

## Exercice 4

> *Cet exercice n'est à faire que s'il vous reste du temps sur la huitième séance de TD.*

Modifiez l'exercice 3 pour lui faire gérer un jeu de cartes (vous choisissez la taille, 52 ou 32 cartes). Pour gérer les cartes, vous pouvez utiliser deux tableaux de chaînes sur les valeurs (7, 8, …, dame, roi, as), et sur les couleurs (pique, trèfle, carreau, cœur). Le tableau des cartes deviendra donc un tableau avec, pour chacun de ses éléments, un tableau de deux entiers, le premier étant l'indice de la couleur, le second étant l'indice de la valeur.

Par exemple, pour un tableau qui ne contiendrait que les 4 cartes suivantes (jeu de 32 cartes) : roi de trèfle, dame de pique, 7 de carreau et as de pique, on aurait le code suivant :

```java
String values[] = {"7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
String colors[] = {"Coeur", "Carreau", "Pique", "Trèfle"};
int deck[][] = {
    {6, 3}, // values[6] -> Roi, colors[3] -> Trèfle
    {5, 2}, // values[5] -> Dame, colors[2] -> Pique
    {0, 1}, // values[0] -> 7, colors[1] -> Carreau
    {7, 2}, // values[7] -> As, colors[2] -> Pique
};
```

Le but de l'exercice est de créer le jeu avec toutes les cartes, puis de le mélanger et d'afficher le jeu mélangé (en listant son contenu dans la console).