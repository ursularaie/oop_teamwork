// english below
Autorid: Ursula Raie (, oli paariline, aga ta kadus ära)
# Palli liikumise simulatsioon java keeles
## See repositoorium sisaldab faile palli liikumise simulatsiooni jaoks.
## Tutvustus
Programm simuleerib palli liikumist mingi suvalise kiirusega, kus kasutaja otsustab valib palli raadiuse ja kas kasutada gravitatsiooni või ei. Programm kuvab terminali palli kordinaadid ette antud suurusega ekraanis, koos palli ülejäänud infoga.
Klass Screen on klass pigem sellepärast, et oleks parem visualiseerida. Klass Ball on palli info ja meetod movement(), kus arvutatakse palli kordinaate, setCoordinates() omistab kordinaadid ballile, sellest tuleb ka info, kas programm peaks töötamise lõpetama. Main klassis on meetod main(), mis korraldab programmi peamist tööd ja meetodid userAnswerBallRadius() ja userAnswerGravity(), mis küsivad kasutajalt vastavalt palli raadiuse ja kas kasutada gravitatsiooni.
## Projekti tegemise protsess
* Siis kui ma veel sain paarilisega kontakti otsustasime idee, mida küsime kasutajalt ja mis on projekti struktuur ning mis klasse meil on vaja;
* kadus kontakt paarilisega;
* kui hakkasin ise tegema, siis vaatasin, et mulle piisab klassidest: Ball.java, Main.java ja Screen.java;
* tegin alguses Screen.java ja Ball.java alge;
* kirjutasin küsimused kasutajale;
* tegin algelised objektid main() meetodis testimiseks;
* tegin movement() meetodi, kus programm hakkas koordinaate arvutama ning main() meetodis tsükli, et arvutusi näha;
* lisasin gravitasiooni ja põrkest tuleneva aeglustuse ning millal pall seisma jääb;
* parandasin tsüklit.
## Ajakulu
Umbes 4 tundi kokku äkki.
## Mured
Palli liikumise füüsika tuli peamiselt AI-lt, sest ise ma ei mäleta enam põhimõtteliselt midagi füüsikast.
## Hinnang tulemusele
Tahaks väga loota, et programm töötab õigesti. Kuigi kirjutasin kõik koodi ise oleks tahtnud, et ei oleks pidanud füüsika osa kohta AI-lt nii palju küsima. Programm tundub natuke liiga vähe.
## Testimine
Tegin mingid objektid valmis ja vaatsin, et programm ei viskaks erroreid ja väljund näeks õige välja ning, et programm lõpeks.
## Kui on soov kasutada projekti
* klooni repo.
## Teada olevad vead
* hetkel ei ole teada ühestki veast, võib muutuda ajaga;
* kui leida viga palun kirjutada issues juurde.
## Plaanitud muudatused
* Teha graafiline liides;
* lisada failist lugemine ja faili kirjutamine;
* lisada erinevaid gravitatsioone.
