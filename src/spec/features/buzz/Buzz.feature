@Buzz
Feature: je souhaite tester le buzz
  en tant que utilisateur je souhaite tester la creation d'un nouveau buzz

  Background: 
    Given je me connecte sur l application orange
    When je saisis un username valide "Admin"
    And je saisis un passeword valide "admin123"
    And je clique sur le bouton login

  @Buzz1
  Scenario: test de creation d'un nouveau buzz
    When Je clique sur le bouton buzz
    And Je saisis un buzz "test automtion"
    And Je  clique sur le bouton post
    Then Je verifie le buzz cree
  