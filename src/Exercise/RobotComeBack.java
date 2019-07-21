package Exercise;

public class RobotComeBack {

    public boolean judgeCircle(String moves) {
        char[] chars=moves.toCharArray();
        int horizontal=0;
        int vertical=0;

        for (char i:chars
             ) {
            switch (i){
                case 'R':
                    horizontal++;
                    break;
                case 'L':
                    horizontal--;
                    break;
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
            }
        }
        return horizontal == 0 && vertical == 0;
    }
}
