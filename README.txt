Syed Shihan
Due Date: 10/1/20
CS Project One README
Prof. Purtee

Program Status/Algorithm Description:
The program I have created is mostly functional albeit with a few bugs/handicaps. The program
works by taking in an integer (linebreak) and a block of text (inputString) that the user must
input. The integer is used to dictate the amount of characters that each outputted line must be
less than or equal to. The outputted lines is the block of text that the user inputted, just
restructured so that it aligns to the “character limit” and organized so that there is only a single
space between each word. For tokens/words larger than the “limit”, they are printed on their own
lines. Additionally blank lines in the input are still kept in the output. However it should be noted
that the program needs a symbol to register that there is a blank line (will explain in more detail
in the Bugs/Handicaps section). Lastly, the program stops reading the user inputted text after it
finds the word “Stop.
” on its own line.

Bugs/Handicaps:
● Copy and Pasting the Input
In order to input text with multiple lines, users must copy and paste it into the
console. (I tried to fix this for a long time however was unable to figure out how)
● Limited # of Input Lines
Due to the way I set up my program, the maximum size of the inputString must
be no greater than 16 lines.
If user input is less than that, they must click enter until input is 16 lines long for
the program to work.
● Usage of Symbol Indicator for Blank Line
In order for my program to know whether or not to print a blank line, the user
must type in an “*” symbol for it to do so.
For example consider the Input: “red orange yellow * blue green purple”
After the *, the program will print a blank line because the “*” is used to
indicate a blank line for my program.
However in a few instances of testing, the program has been shown to start a
new line rather than print a blank line.
■ To fix this, simply input two “*” symbols one after the other.
