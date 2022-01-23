# SDE_Program
Een applicatie waarbij je eten kan bestellen

## Factory (Jan)
Wanneer de gebruiker de vraag krijgt wat hij wilt bestellen, kan hij of zij kiezen tussen 3 verschillende keuzes. Wanneer de keuze is gemaakt, kijkt de ConsoleReader wat de gebruiker heeft ingevoerd. Hierna maakt de applicatie via de FoodFactory de gewenste class aan. Deze class stuurt dan weer terug naar de console wat er besteld is. Bijvoorbeeld: de gebruiker kiest de pizza, de applicatie maakt via de FoodFactory een nieuwe Pizza aan. Deze Pizza class stuurt dan een bericht terug naar de console met: "You ordered a pizza".

## State
In ons programma zitten 3 states verwerkt, waiting state, making state en finished state. Het programma begint in de waiting state en hier wordt het volgende gevraagd: "Can i take your order?". Je kan dan antwoorden met yes of no, met no wordt het programma altijd beïndigd. Als je met yes antwoord komt de vraag wat je wil bestellen met de optie erbij gegeven. Je beland dan ook in de making state. Zodra je bestellen verwerkt en gemaakt is kom je in de finished state terecht. Hier wordt gevraagd of je nog meer eten wil bestellen. Zo ja dan kom je weer terug in de making state en anders wordt het programma weer beïndigd.

## Facade
