# EvolutionGamingDemo

1. Open the browser and maximize it.
2. Open  ss.com
3. switch to Russian language.
4. Go to the section “Электротехника”, open search ('Поиск') and in Search enter the search phrase (eg. 'Computer') and select a different search parameters.
5. Click Search
6. Sort the results by price and select option 'Продажа' in "Тип сделки" dropdown.
7. Open “Расширенный поиск”. (advanced search)
8. Enter search option price between 160 and 300.
9. Choose at least 3 random ads.
10. Press “Добавить выбранные в закладки” ( = add to memo)
11. Open “Закладки” and check that the ads on the page match the previously selected
12. Close the browser.

# Getting Started

Please follow below instruction to copy the project and running on your local machine for testing purpuse

#### Prerequisites

Maven home: D:\apache-maven-3.5.0
Java version: 1.8.0_65, vendor: Oracle Corporation
Chrome version: Version 61.0.3163.100 (Official Build) (64-bit)
Git Bash - optional

# Running the tests

Given scenario is automated using selenium cucumber.
Gherkin language is used in cucumber for these scenario.

#### Below is the work flow of calling methods in this framework

Feature File >>>> Step Definition File >>>> Main File

For example: Feature file is created for EvolutionGaming demo in which scenario is written in gherkin language.
This feature file calls step difinition file through glue code.
Then step definition file calls main EvolutionGaming page file in which all methods are defined.

# Installation

### Linux Machine

If you’re on Fedora for example (or any closely-related RPM-based distro such as RHEL or CentOS), you can use below command to install Git:
##### $ sudo dnf install git-all

If you’re on a Debian-based distribution like Ubuntu, try apt-get:
##### $ sudo apt-get install git-all

1. Clone the project from below location:

git clone https://github.com/globus/automation-examples

2. Go to source folder in local machine
cd EvolutionGamingDemo

3. Run " mvn test " command in your maven or git bash
mvn test
