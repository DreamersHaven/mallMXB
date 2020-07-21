package com.macro.mall.demo.idea;

import java.util.ArrayList;


/**
 * 1、IDEA中代码模板所处的位置：settings--Editor-Live templates
 */
public class TemplatesTest {
    //模板六 ：prsf 快捷键：CTRL+shift+Y 大小写切换
    private static final String MY_NAME="DONGYAXIN";
    //变形：psf/psfi/psfs
    public static final String MY_NAME1="DONGYAXIN";
    //模板1：psvm
    public static <Arraylist> void main(String[] args) {
        //模板2：sout
        System.out.println("hello");
        //变形：soutp/soutm/souty/xxx.sout
         

        int numt=10;
        System.out.println("numt = " + numt);
        //模板3：fori
        String[] arr=new String[]{"tom","Hanmeimei","Lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("i = " + i);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);

        }
        //模板四：list.for
        //变形：list.fori
        //变形：list.forr 倒序遍历

        //模板五：ifn
        //变形 ifnn


    }
}
