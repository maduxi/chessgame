ChessGame
=========

This program discovers how Chess pieces fit on a customizable board without threating each other.



How To build and run
=====================
To run this program you will need to compile the sources. Download the project an using the terminal inside the project folder, invoke Maven to build the package:

mvn package

After the compilation has been finished, you will find a new folder called target. Inside this folder you will find a jar archive. To execute this file you may run a command similar to this:

java -cp target/chessgame-1.0-SNAPSHOT.jar es.madhava.chessgame.ChessGame 3 3 2 0 0 1 0

This is the description of the required parameters:

ChessGame {col} {rows} {kings} {queens} {bishops} {rooks} {knights} 

For example for a 3x3 board with 2 kings and 1 rook you would invoke it like this:

ChessGame 3 3 2 0 0 1 0 

For a harder problem, a 7×7 board with 2 Kings, 2 Queens, 2 Bishops and 1 Knight, you would run the program with this parameters:

ChessGame 7 7 2 2 2 0 1 

That with reply you with more than 2 million boards, and may take a while to print.


=====
Development for trycatch.us 
