# _Character API_

#### _A backend for RPGs_

#### By _**Sam Gespass, Anduin Mooney, Rodney, Ross Fletcher**_

## Description

_This API allows the user to create and keep track of characters, spells, effects, and equipment._

## Specs

| Spec | Input | Output |
| :-------------     | :------------- | :------------- |
| This app can create new characters | Character(arg) | characterInstantiated = true |
| This app can save info about the character | getName() | "Daniel" |
| This app can create new spells | Spell(arg) | spellInstantiated = true |
| This app can save info about the spell | getDamage()) | 3 |
| This app can allow a character to use a spell | addSpellToCharacter(spell, character) | "Character can use spell" |
| This app can create new equipment | Equipment(arg) | equipmentInstantiated = true |
| This app can save info about the equipment | getMagicDefense() | 5 |
| This app can create new status effects | Effect(arg) | effectInstantiated = true |
| This app can save info about the effects | getStrength | -2 |
| This app can give a character a status effect | addEffectToCharacter(effect, character) | "Character has effect" |
| This app can give a spell a status effect | addEffectToSpell(Poison, Poison) | "Spell poison "
| This app can give a character equipment | addEquipmentToCharacter(equipment, character) | "Character has a/some equipment" |
| This app can return all characters | getAllCharacters() | A long list of characters |
| This app can return specific characters | findById(2) | "Name": "John"... |
| This app can return all spells | getAllSpells() | A long list of spells |
| This app can return specific spells | findById(2) | "Name": "Freeze"... |
| This app can return all equipment | getAllEquipment() | A long list of equipment |
| This app can return specific equipment | findById(3) | "Name":, "Sword"... |
| This app can return all effects | getAllEffects() | A long list of effects |
| This app can return specific effects | findById(2) | "Name": "Poison"... |
| This app can update info of characters | update(args) | new info |
| This app can update info of status effects | update(args) | new info |
| This app can update info of equipment | update(args) | new info |
| This app can update info of spells | update(args) | new info |
| This app can delete a specific character | deleteById(1) | character is deleted |
| This app can delete all characters | deleteAll() | all characters are deleted |
| This app can delete a specific status effect | deleteById(1) | effect is deleted |
| This app can delete all status effects | deleteAll() | all effects are deleted |
| This app can delete a specific spell | deleteById(1) | spell is deleted |
| This app can delete all spells | deleteAll() | all spells are deleted |
| This app can delete a specific equipment | deleteById(1) | equipment is deleted |
| This app can delete all equipment | deleteAll() | all equipment is deleted |

## Setup/Installation Requirements

* Click on the following [link](https://github.com/darthtoad/Character-API) to download the CharacterAPI
* Choose one of the two options:
A) Open in intelliJ and run the app.  
B) Go to the src/main/java directory in the terminal/command line and issue this command sequence: javac App.java && java App
C) Request your APIs with Postman or another client using [link](localhost:4567)

## Wish List

* When a status effect is added or removed from a character, the character's points are modified.
* Remove status effects, spells, and equipment from a character
* Remove status effects from spells
* Make a mechanism for attacking, using spells, defending, and defending from spells, including evasion
* Make a new class for items

## Known Bugs

_There are currently no known bugs or issues. Please [message](mailto:darth.toad@gmail.com) me if you run into any and I'll do my best to fix them as quickly as possible!_

## Support and contact details

_Email me at [darth.toad@gmail.com](mailto:darth.toad@gmail.com) if you have any questions, comments, or concerns, or post your issue on GitHub._

## Technologies Used

* _Java_
* _IntelliJ_
* _Gradle_
* _Postman_
* _PostgreSQL_
* _Git_
* _GitHub_

### License

Copyright (c) 2017 ****_Sam Gespass_****

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
