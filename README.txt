Compute All Permutations

Input:

Each line of input coming in on the BufferedReader represents a separate problem.  (Hint: Consider using the readLine() method in the BufferedReader class.)  Each line will consist of a comma separated list of strings. (Hint: Consider using the StringTokenizer class.) 

Output:

For each such line of input, you must write out onto the output all the possible permutations (orderings) of the input line, followed by a single blank line.  The order in which you list the permutations does not matter.

End of Input:

The input will be terminated by a blank line.  Once this blank line is reached on the input, simply output one more blank line on the output and then immediately return control to the caller (i.e. exit from the run function).

Example:

For example, if the input coming in on the BufferedReader looked like:

red,yellow
one,two,three

the output on the PrintWriter should look like:

red,yellow
yellow,red

one,two,three
one,three,two
two,one,three
two,three,one
three,one,two
three,two,one