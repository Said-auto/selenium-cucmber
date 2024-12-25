@AddUser
Feature: Ajout d'un nouveau utilisateur
en tant qu'administrateur je souhaite rajouter un nouveau utilisateur

Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide "Admin"
    And je saisis un passeword valide "admin123"
    And je clique sur le bouton login

  @Adduser1
  Scenario: Ajout d'un nouveau utilisateur
    When Je clique sur le module Admin
    And Je clique sur le bouton add
    And Je selectionne le userrole
    And Je selectionne le statut
    And Je saisi l'employee name
    And Je saisi l'username
    And Je saisi le password
    And Je confirme le password
    And Je clique sur lebouton save 
    Then Je verifie l'ajout du nouveau utilisateur
   

  