# WorldComapny: Algorithmique & Programmation Orientée Objet (APO)

Coursework for APO from Univ Grenoble Alpes, final revision project.

### Types of employee:
- **La Vente**: Employee code starts with 1000, Their monthly salary is composed of a fixed amount of €800 and 20% (0.2)
of the turnover they achieve per month.

- **La representation**: Employee code starts with 2000. Their monthly salary is composed of a fixed amount of 1000€ and
40% (0.4) of turnover.

- **Les techniciens affectés à la production**: Employee code starts with 3000. Their monthly salary is the number of
units produced multiplied by 8.5€.

- **la manutention**: Employee code starts with 4000. Their monthly salary is the number of monthly working hours (hours)
multiplied by an hourly salary of 34.50€.

Each employee must be displayable in the following form:
```
[codeEmploye] Bonjour, je m'appelle Prénom Nom et je gagne salaire euros. Je suis rôle depuis anneeEmbauche.
```

For example, for a company with 10 employees of varying types, we would have this:
```
[1000] Bonjour, je m'appelle Alex Ception et je gagne 1445.08 euros. Je suis vendeur depuis 2018
[1001] Bonjour, je m'appelle Bernard Tichaut et je gagne 2075.3 euros. Je suis vendeur depuis 1996
[2000] Bonjour, je m'appelle Céline Evitable et je gagne 3129.824 euros. Je suis représentant depuis 2001
[2001] Bonjour, je m'appelle Edith Orial et je gagne 3941.8 euros. Je suis représentant depuis 1977
[3000] Bonjour, je m'appelle Firmin Dustriel et je gagne 3000.5 euros. Je suis technicien depuis 1975
[3001] Bonjour, je m'appelle Gérard Manvussa et je gagne 1207.0 euros. Je suis technicien depuis 2019
[4000] Bonjour, je m'appelle Isabelle Parleurnom et je gagne 1380.0 euros. Je suis manutentionnaire depuis 2000
[4001] Bonjour, je m'appelle Jacques Use et je gagne 1231.65 euros. Je suis manutentionnaire depuis 2010
[3002] Bonjour, je m'appelle Lucie Fer et je gagne 2269.5 euros. Je suis technicien depuis 2000
[1002] Bonjour, je m'appelle Nordine Ateur et je gagne 1673.484 euros. Je suis vendeur depuis 2007
```

Finally, to display the list of employees, the company "asked me" to implement the compareTo interface in order to "sort" 
the employees by their years of employment. Thus, each Employee will implement the method `+ compareTo(e: Employee): int`
which will send a negative number if the current instance (this) of Employee was hired before the instance represented
by the parameter e; 0 if the 2 employees were hired in the same year and a positive number if the current employee (this)
was hired after employee e.

## The Personnel Class

The Personnel class contains an Employee array. You can test this class as you go by uncommenting the main method of the 
WorldCompany class.

In the Personnel class, you must first implement the `salaireMoyen` method which calculates the average salary of the company.

Next, you'll need to arrange the employees in the array based on each employee's `compareTo` method. The sorting technique
is given to you as a comment in the method to be completed.

## UML
![](uml/wvca00kh.bmp)