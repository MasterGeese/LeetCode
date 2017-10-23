package judgeRouteCircle657;

public class JudgeRouteCircle {
	public static boolean judgeCircle(String moves) {
        int horizontal = 0, vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
                case 'L':
                    horizontal--;
                    break;
                case 'R':
                    horizontal++;
                    break;
                default:
                	System.err.println("String must be composed of the following characters (case sensitive): 'UDLR' ");
                	break;
            }
        }
        return ((horizontal == 0) && (vertical == 0));
    }
	public static void main(String[] args) {
		System.out.println(judgeCircle("LR"));
		System.out.println(judgeCircle("UUDDLRLR"));
		System.out.println(judgeCircle("URLURL"));
		System.out.println(judgeCircle("U"));
		System.out.println(judgeCircle("fish"));
	}

}
