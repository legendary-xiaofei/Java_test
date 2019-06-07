package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Keyborad_row {
    public String [] findWords(String[] words) {

        /**
         * 测试用例
         * String []tt={"Hello", "Alaska","Dad", "Peace"};
         */
        ArrayList<String> arrayList = new ArrayList<>();
        char[][] keyborad = {{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'},
                {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'},
                {'Z', 'X', 'C', 'V', 'B', 'N', 'M'}};
        char [][]temp=new char[words.length][];
        int len = 0;
        int target_row=-1;
        boolean isbreak=false,isbbreak=false;
        boolean isfound=true;
        for (int i=0;i<words.length;i++){
            temp[i]=words[i].toCharArray();
        }
            for (int j=0;j<words.length;j++){//第几个单词
                int []rows=new int[temp[j].length];
                for (int m=0;m<temp[j].length;m++){//每个单中的第m个字符

                    for (int r=0;r<3;r++){
                        for (int n=0;n<keyborad[r].length;n++){
                            if (temp[j][m]==keyborad[r][n]||temp[j][m]==keyborad[r][n]+32){
                                rows[m]=r;
                                isbreak=true;
                                break;
                            }
                        }
                        if (isbreak){
                            isbreak=false;
                            isbbreak=true;
                            break;
                        }
                        }
                    if (isbbreak){
                        isbbreak=false;

                        int tee=m;
                        if (m>=1&&rows[--tee]!=rows[m]){
                            isfound=false;
                            break;
                        }
                    }
                    }
                if (!isfound){
                    isfound=true;
                }
                else {arrayList.add(words[j]);
                }
            }

            String [] resulet=new String[arrayList.size()];
            for (int i=0;i<arrayList.size();i++){
                resulet[i]=arrayList.get(i);
            }

            return resulet;

    }
}
