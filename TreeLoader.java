package trees;


/**
 * Load a tree from a text file.  Format is line based, with each line
 * consisting of a String for data, followed by two ints indicating if
 * the node has a left child or right child.  (1 is yes, 0 is no).
 * Ordering of nodes is postorder.
 *
 * @author John Donaldson
 * @author Benjamin Kuperman (Spring 2007)
 * @author Alexa Sharp (Fall 2012)
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class TreeLoader {
	public static BinaryTree<String> loadTreeFromFile(String fname) throws IOException {
		return new EmptyTree<String>();
	}
}
