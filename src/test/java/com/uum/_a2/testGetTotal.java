
package com.uum._a2;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


public class testGetTotal {
    @Test
    public void runGetTotal(){
        ArrayList<Info> info = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();
        FindDirectory.setFiles(files);
        
        String list[] = new String[files.size()];
        list = files.toArray(list);
        for (int i = 0; i<files.size(); i++) {
            String filename = list[i];
            ReadAndWriteFile.ReadFile(filename,info);
        }
        int ExpectedResultFile1 = 23;
        int ExpectedResultFile2 = 27;
        
        Info[] infolist = new Info[info.size()];
        infolist=info.toArray(infolist);
        
        int resultFile1 = infolist[0].getTotal();
        int resultFile2 = infolist[1].getTotal();
        Assert.assertEquals(ExpectedResultFile1, resultFile1);
        Assert.assertEquals(ExpectedResultFile2, resultFile2);
    }
}
