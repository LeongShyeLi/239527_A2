/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sally Leong
 */
public class TestFindDirectory {
    @Test
    public void RunPath(){
        ArrayList<Info> info = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();
        FindDirectory.setFiles(files);
        
        String expectlist[] = new String[files.size()];
        expectlist[0]="C:\\Users\\Sally Leong\\Documents\\NetBeansProjects\\239527_A2\\src\\main\\java\\com\\uum\\_a2\\MyThread1.java";
        expectlist[1]="C:\\Users\\Sally Leong\\Documents\\NetBeansProjects\\239527_A2\\src\\main\\java\\com\\uum\\_a2\\MyThread2.java";
        
        String list[] = new String[files.size()];
        list = files.toArray(list);
        
       Assert.assertArrayEquals(expectlist, list);
    }
}
