# MDI - Conception Objet (Design Patterns)

Cette première série de travaux pratiques nous a permis d'explorer, à travers de courts exemples,
l'implémentation de plusieurs **design patterns**.

Les design patterns sont une réponse à des problèmes de conception bien particuliers, et servent donc,
premièrement, à **accélerer** les processus de développement, mais également à offrir une **lisibilité** au code source logiciel,
grâce à la standardisation de l'architecture, induite par le pattern.

- Le *1er sujet* traîte du pattern **Observer**. Celui-ci met en place un système de collection d'entités (dits *Observers*) souhaitant observer
  un objet (*dit Subject*) particulier. Lorsque cet objet est modifié, on alerte alors chacun des observateurs avec un système particulier
  de notifications.
  Dans notre cas, nous souhaitions notifier les *Observers* lors de la réception d'un *Mail* au sein d'une *MailBox* pour deux buts distincts :
  compter le nombre de mails reçus ainsi qu'afficher dans une *frame* le contenu du dernier mail.
 
 - Le *2ème sujet* expose cette fois un cas d'utilisation du pattern **Visiteur**. Ce cas peut s'apparenter à la manière avec laquelle
   nous avons implémenté un compilateur dans le cadre du module Compilation au semestre dernier. 
   
   // TODO
   
 - Enfin, le *3ème sujet* nous demande un esprit critique afin de détecter les erreurs de conception pour un cas de logiciel visant à
   régir la gestion d'une pizzeria, sur le plan humain mais principalement au niveau de la gestion des commandes reçues en temps réel.
   
   // TODO
