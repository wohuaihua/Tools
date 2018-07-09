package com.huaihua.www.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
public static void main(String[] args){
    String str = "\"second\":{b56a2e92933e42dfb2194d667c3d1c67},\"girl2\":\"刘朱\",\"first\":11,\"third\":{29484c7863434e4e827e1fabbff9b0c3}";
    Pattern p=Pattern.compile("\\{([^\\}]+)\\}");
    Matcher m=p.matcher(str);
    while(m.find()){
        System.out.println(m.group(1));
    }
     
 
}
}