# TP3

## Syntaxe Java

### Ces trois codes sont équivalents.

```java
int n = scanner.nextInt(); // Attention dans le cas d'un float, le formatage est localisé (sur une machine francaise il faudra une virgule, sur une machine US, un point)
```

```java
int n = Integer.valueOf(scanner.next()); // retourne un int primitif
```

```java
int n = Integer.parseInt(scanner.nextInt()); // retourne un Integer (objet)
```

### Extraire un caractère :

```java
char c = scanner.next().charAt(0);
```

### La première forme est plus correcte que la suivante

```java
for(int i=0; i<n; i++){
    result += c;
} 
```

```java
for(int i=1; i<=n; i++){
    result += c;
} 
```

### Penser à utiliser le type `long` plutôt que `int` si les chiffres sont grand

Pour la suite de Fibonacci, penser à utiliser des `long` plutôt que des `int` car les chiffres deviennent vite gigantesques.

## Commandes

### Calculatrice pour la base 2

```bash
$ bc -ql
obase=2
2026
```

Pour quitter :

```bash
quit
```

### Obtenir le timestamp d'une date :

```bash
$ date -d '18 sept 2026 UTC' +%s
```
* -d permet de saisir une date (date actuelle si non précisé)
* +%s pour avoir une timestamp