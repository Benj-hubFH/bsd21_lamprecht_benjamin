# Hangman

Hangman is a crude programmed game in which you need to find a word or whole sentences by guessing single letters.

*From the creator:*
>If you are as eager to hang yourself as I was writing that code...be my guest!

*From the Alpha-critics:*
>The Testcases revealed 4 critical Errors.
Why isn't there the correct indentation on line 58?

## Installation

There is no installation required. Execute Hangman.bat to start the game. These are the [words](in.txt) to play through. If you want changes, feel free to edit file: in.txt

## Usage

The game chooses a random line of the in.txt\
A n-amount of '_' are displayed to show you the amount of letters needed to be guessed.\

If you enter a right letter, the positions of matches will be changed to given input.\
You need to repeat it as long till all spots are revealed and you start the next line from in.txt.\

If you enter a wrong letter, then the 'Hangman' will be build up.\
You are allowed to miss 11 times till the whole Hangman will be displayed and it's Game Over.\
If you amount some misses and manage to solve the word, the miss-counter will be reset to 0 when starting the next line from in.txt

## Contributing
Repo will be available if you send a request at [Benj-hub](https://github.com/Benj-hub)\
TODO:

    1. Currently only ASCII-Code is accepted.
    2. The Program should run on Browser to be online available
    3. The Hangman should be displayed in a bigger array.
    4. The in.txt should be replaced with an online Dictionary
    5. Game modes should be introduced which fetches famous quotes.

## License
I literally don't want to be associated with that thing. It's your problem now.

## Author
[Benjamin Lamprecht, Benj-hubFH](https://github.com/Benj-hubFH/bsd21_lamprecht_benjamin)\
Educational institution:
[Campus02](https://www.campus02.at/)
