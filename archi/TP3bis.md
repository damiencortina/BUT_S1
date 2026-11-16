# TP3

## Telnet

Ancètre de SSH (1969) abandonné aujourd'hui car non chiffré.

Telnet est en 2 parties : 
* partie client (inetd_telnet)
* partie server (inetd_telnetd) d pour daemon

Certains usages de telnet peuvent être remplacés par netcat.

### Wireshark

Permet d'analyser le réseau

> Attention quand on modifie le groupe du user courant, il faut fermer la session et la rouvrir ou alors `su user` pour se conncter sur sois même (valable uniquemenet dans la fenètre de terminal dans laquelle la commande est lancée)

