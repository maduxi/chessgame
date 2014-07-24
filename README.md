ChessGame - Try Catch quest.
=========

This program discovers how Chess pieces fit on a customizable board without threating each other.

To run this program you will need to compile the sources and run it with the following parameters:

ChessGame {col} {rows} {kings} {queens} {bishops} {rooks} {knights} 

For example for 3x3 board with 2 kings and 1 rook you would invoke it like this:

ChessGame 3 3 2 0 0 1 0 

And obtain this result:

Problem configuration:

Board: 3 x 3
Kings (k): 2
Queens (q): 0
Bishops (b): 0
Rooks (r): 1
Knights (n): 0

Options: 4
|k| |k|
| | | |
| |r| |

|k| | |
| | |r|
|k| | |

| |r| |
| | | |
|k| |k|

| | |k|
|r| | |
| | |k|

For a harder problem, a 7×7 board with 2 Kings, 2 Queens, 2 Bishops and 1 Knight, you would run the program with this parameters:

ChessGame 7 7 2 2 2 0 1 

And you would see:

Problem configuration:

Board: 7 x 7
Kings (k): 2
Queens (q): 2
Bishops (b): 2
Rooks (r): 0
Knights (n): 1

Calculating
........................................................................................................................

Options: 2379646

…

(each board possibility, and this may take a while, be ready to see the more than 2 million options...)

…

