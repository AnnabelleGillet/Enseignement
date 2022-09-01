Ce code example montre comment utiliser Java RMI, en compilant et exécutant le serveur et le cliant avec ant. 
Plusieurs commandes ant sont disponibles. 

# Nettoyage des fichiers existants

```
ant clean
```
# Execution du serveur

```
ant run-serveur
```
Commande à utiliser afin de compiler, créer un jar et l'exécuter (dépendance avec les commandes ```ant compile-serveur``` et ```ant jar-serveur```). Le serveur lance le rmiregistry puis enregistre un objet dans ce dernier. 

# Execution du client

```
ant run-client
```
Commande à utiliser afin de compiler, créer un jar et l'exécuter (dépendance avec les commandes ```ant compile-client``` et ```ant jar-client```). Le client se connecte au rmiregistry afin de récupérer l'objet enregistré par le serveur, et appelle la méthode de l'objet. 
