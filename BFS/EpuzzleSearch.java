/** EpuzzleSearch.java
 * COM1005 - (Bsc)Computer Science
 * Jun Zhang (jzhang213@sheffield.ac.uk)
 * 4 May 2022 Version
 */
package BFS;
public class EpuzzleSearch extends Search {

    private int[] puzzleList;
    private final int[] TARGET;

    /** Constructor
     * @param arr the array of tile content
     * @param goal the array of target
     */
    public EpuzzleSearch(int[] arr, int[] goal){
        puzzleList = arr;
        TARGET = goal;
    }

    /**
     * accessor for the puzzle list
     * @return the array of tile content
     */
    public int[] getPuzzleList() {
        return puzzleList;
    }

    /**
     * accessor for the target
     * @return the array of target
     */
    public int[] getTarget() {
        return TARGET;
    }
}