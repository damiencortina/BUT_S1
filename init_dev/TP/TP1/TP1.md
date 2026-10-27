## TP1

```java
// Hello est le nom de la classe.
// BONNE PRATIQUE : nommer le fichier avec le nom de la classe
public class Hello {
    // La fonction main défini le point d'entrée (début) du programme
    public static void main(String [] args) {
        // Une instruction (elle se termine par un ;)
        // Ecriture sur la sortie standard
        System.out.println("Bonjour !");
    }
}
```

Etqpe suiv la compilation (trad en language machine)

On obtient alors un programme compilé

On peut alors executé ce programme compilé

Comment compiler ?

```bash
javac Hello.java
```
> **javac** est le compilateur (java compiler)

On obtient alors un fichier Hello.class

On peut exécuter ce fichier avec 

```bash
java Hello
```

> utiliser Hello, pas de .class


Attention Scanner.next() ne consomme qu'un seul mot.

.next signifie passe au mot suivant.

Chaque appel entrainera la consommation du mot suivant.
Si au premier appel on a saisi 2 mots, le procher .next() ne demandera aucune saisie, et utilisera le seconde mot de la première saisie.

Ex :

```java
String nom = monScanner.next() // deamnde une saisie
// Cortina Damien
// nom = "Cortina"
String prenom = monScanner.next() // ne demande pas de saisie, utilise "Damien"
// prenom = "Damien"
```