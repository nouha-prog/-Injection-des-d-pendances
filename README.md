##  TP : Injection des Dépendances en Java  

Ce projet est un **travail pratique** sur l'injection des dépendances en Java, basé sur trois méthodes différentes : **instanciation statique, instanciation dynamique et utilisation du framework Spring**.  

---

###  **1. Instructions Git pour commencer**  

Avant de commencer à coder, assure-toi d'avoir **cloné le projet** et bien configuré Git sur ton environnement local.  

```sh
# 1️⃣ Cloner le projet
git clone https://github.com/nouha-prog/-Injection-des-d-pendances.git

# 2️⃣ Se déplacer dans le dossier du projet
cd Injection-des-d-pendances

# 3️⃣ Vérifier l'état du projet
git status
```

Si tu modifies du code, voici comment l'ajouter et le pousser sur GitHub :  

```sh
# 4️⃣ Ajouter un fichier spécifique
git add chemin/vers/fichier.java

# 5️⃣ Commit avec un message clair
git commit -m "Ajout de [Nom de la fonctionnalité]"

# 6️⃣ Pousser les modifications sur GitHub
git push origin main
```

---

###  **2. Objectifs du TP**  

L'objectif de ce TP est de comprendre et implémenter **l'injection des dépendances** en Java à travers différentes méthodes.

#### 🔹 **Partie 1 : Création des interfaces et implémentations**  
1️⃣ **Créer l’interface `IDao`** avec une méthode `getData()`.  
2️⃣ **Créer une implémentation `DaoImpl`** de cette interface.  
3️⃣ **Créer l’interface `IMetier`** avec une méthode `calcul()`.  
4️⃣ **Créer une implémentation `MetierImpl`** de cette interface en utilisant **le couplage faible**.  

#### 🔹 **Partie 2 : Injection des dépendances**  
💡 **Trois méthodes d’injection des dépendances** sont mises en place :  
👉 **Par instanciation statique** (directement dans le code).  
👉 **Par instanciation dynamique**  
👉 **En utilisant le Framework Spring** :  
   - **Version XML**   
   - **Version Annotations**

---

### 🛠 **3. Technologies utilisées**  
- **Java** (JDK 8 ou plus)  
- **Spring Framework**  
- **Maven** (pour la gestion des dépendances)  
- **Git** (pour la gestion du code source)  

---

### 📂 **4. Structure du projet**  

```bash
📺 src/main/java
 ┗ 📂 dao               # Interface et implémentation de la couche DAO
   ├📚 IDao.java       # Interface DAO
   ├📚 DaoImpl.java    # Implémentation de l'interface DAO
   └📚 DaoImplV2.java  # Deuxième version de l'implémentation DAO
 ┗ 📂 metier            # Interface et implémentation de la couche métier
   ├📚 IMetier.java    # Interface métier
   └📚 MetierImpl.java # Implémentation du métier avec injection des dépendances
 ┗ 📂 presentation      # Classes de test et exécution
   ├📚 presentationV1.java  # Injection par instanciation statique
   └📚 presentationV2.java  # Injection par instanciation dynamique
```

---

###  **5. Comment exécuter le projet ?**  

Assure-toi d'avoir Java installé et exécute la classe `presentationV1` ou `presentationV2` selon la méthode d’injection des dépendances que tu veux tester.

Avec **Spring**, utilise la configuration XML ou les annotations pour lancer l’application.

---

###  **Auteur**  
**Nouha-prog**  
 [GitHub](https://github.com/nouha-prog)  

---

