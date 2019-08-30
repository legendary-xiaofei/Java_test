package Exercise.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Son extends Father {

    private String mSonName;
    protected int mSonAge;
    public String mSonBirthday;

    public void printSonMsg(){
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    private void setSonName(String name){
        mSonName = name;
    }

    private void setSonAge(int age){
        mSonAge = age;
    }

    private int getSonAge(){
        return mSonAge;
    }

    private String getSonName(){
        return mSonName;
    }

    private static void printFields(){


        Class mclass=Son.class;
        System.out.println("类的名称："+mclass.getName());

        //获取的是public访问权限的变量
        Field []fields=mclass.getFields();

        //获取本类声明的变量（不管访问权限）

        Field[]fields1=mclass.getDeclaredFields();

        for (Field field:fields1){

            int modifiers=field.getModifiers();
            System.out.print(Modifier.toString(modifiers)+" ");
            System.out.println(field.getType().getName()+" "+field.getName());
        }
    }

    public static void main(String[] args) {
        Son.printFields();
    }

}
