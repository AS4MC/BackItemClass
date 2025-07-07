# 🏹 WonderQuestBackItemClass

[![Version](https://img.shields.io/badge/version-1.0-blue.svg)](#)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-blue)](#)
[![Build](https://img.shields.io/badge/build-Maven-success)](#)

**WonderQuestBackItemClass** est un plugin Spigot/Mohist pour Minecraft 1.20.1 qui permet d’afficher automatiquement un objet visible dans le dos des joueurs selon leur classe, de manière cosmétique et immersive.

---

## ✨ Fonctionnalités principales

✅ Affiche un item spécifique derrière le joueur selon sa classe  
✅ Mise à jour en temps réel si la classe change  
✅ Aucun item ajouté à l’inventaire  
✅ ArmorStand invisible et sans gravité, positionné correctement  
✅ Suppression automatique des entités quand le joueur se déconnecte  
✅ Compatible Spigot et Mohist (Forge + Bukkit)

---

## 🛡️ Classes et items affichés

| Classe        | Permission LuckPerms                     | Item visible |
|---------------|------------------------------------------|--------------|
| Combattant    | `wonderquest.class.combattant`          | Épée en fer  |
| Constructeur  | `wonderquest.class.constructeur`        | Pioche en fer|
| Explorateur   | `wonderquest.class.explorateur`         | Carte remplie|
| Survivant     | `wonderquest.class.survivant`           | Pomme dorée  |

---

## ⚙️ Prérequis

- Java 17
- Un serveur Minecraft 1.20.1 Spigot ou Mohist
- [LuckPerms](https://luckperms.net)

---

## 📦 Téléchargements

🔽 **Dernière version (.jar)**  
[👉 Télécharger BackItemClass 1.0](https://github.com/votre-utilisateur/votre-repo/releases/latest/download/backitemclass-1.0.jar)

📁 **Télécharger le projet complet (sources)**  
[👉 Télécharger le projet complet](https://github.com/votre-utilisateur/votre-repo/archive/refs/heads/main.zip)

---

## 🛠️ Installation

1️⃣ Placez le fichier `.jar` dans votre dossier :
/plugins/


Copier
Modifier

2️⃣ Redémarrez le serveur.

---

## 🔧 Compilation (IntelliJ IDEA)

Si vous souhaitez compiler vous-même le plugin :

### 📁 Étapes principales

1️⃣ Clonez le projet :

git clone https://github.com/votre-utilisateur/votre-repo.git
2️⃣ Ouvrez le projet avec IntelliJ IDEA.

3️⃣ Ouvrez le panneau Maven :


Copier
Modifier
View > Tool Windows > Maven
4️⃣ Dans Lifecycle, double-cliquez :


Copier
Modifier
package
✅ Le .jar sera généré dans :


Copier
Modifier
target/backitemclass-1.0.jar
🛠️ Configuration des permissions
Attribuez la classe souhaitée à un joueur avec LuckPerms :

bash
Copier
Modifier
/lp user <pseudo> permission set wonderquest.class.<classe> true
Exemple :

bash
Copier
Modifier
/lp user Steve permission set wonderquest.class.explorateur true
✅ La classe est détectée automatiquement et l’item s’affiche dans le dos.

📂 Arborescence du projet
css
Copier
Modifier
src/
 └── main/
      ├── java/
      │    └── fr/
      │          └── wonderquest/
      │                 └── BackItemClass/
      │                         ├── BackItemClass.java
      │                         └── ArmorStandFactory.java
      └── resources/
            └── plugin.yml
pom.xml
⚙️ plugin.yml
yaml
Copier
Modifier
name: WonderQuestBackItemClass
version: 1.0
main: fr.wonderquest.BackItemClass.BackItemClass
api-version: 1.20
🧩 Dépendance Maven
xml
Copier
Modifier
<dependency>
    <groupId>org.spigotmc</groupId>
    <artifactId>spigot-api</artifactId>
    <version>1.20.1-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
🎨 Personnalisation
Pour modifier les items affichés, éditez :

Copier
Modifier
ArmorStandFactory.java
et adaptez le switch(classe) selon vos besoins.

✅ Exemple en jeu
Connectez-vous au serveur

Attribuez une permission

L’objet apparaîtra automatiquement dans votre dos

🏷️ Licence
Ce projet est distribué sous licence MIT.
Vous êtes libre de l’utiliser, le modifier et le partager.

🙏 Remerciements
Merci à tous les contributeurs et à la communauté Minecraft.

📫 Contact
Pour toute question :

Discord : VotrePseudo#0000

GitHub : Votre profil
