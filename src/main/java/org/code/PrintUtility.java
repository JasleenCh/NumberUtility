package org.code;

import java.util.List;

public class PrintUtility {

    public void print(List<Integer> numberList, String format){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =0;i< numberList.size(); i++
             ) {
            if(i== numberList.size()-1){
                stringBuffer.append(numberList.get(i));
            }
            else {
                stringBuffer.append(numberList.get(i) + format);
            }
        }
        System.out.println(stringBuffer);
    }
}
