//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #239527
//Name: #LeongShyeLi

package com.uum._a2;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class testReadFiles {
    @Test
    public void runReadFiles(){
        ArrayList<Info> info = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();
        FindDirectory.setFiles(files);
        String list[] = new String[files.size()];
        list = files.toArray(list);
        for (int i = 0; i<files.size(); i++) {
            String filename = list[i];
            ReadAndWriteFile.ReadFile(filename,info);
        }
        Info[] infolist = new Info[info.size()];
        infolist=info.toArray(infolist);
        
        String semFile1 = infolist[0].getSemester();
        Assert.assertEquals("A171", semFile1);
        String semFile2 = infolist[1].getSemester();
        Assert.assertEquals("A171", semFile2);
        
        String courseFile1 = infolist[0].getCourse();
        Assert.assertEquals("STIW3054", courseFile1);
        String courseFile2 = infolist[1].getCourse();
        Assert.assertEquals("STIW3054", courseFile2);
        
        String groupFile1 = infolist[0].getGroup();
        Assert.assertEquals("A", groupFile1);
        String groupFile2 = infolist[1].getGroup();
        Assert.assertEquals("A", groupFile2);
        
        String taskFile1 = infolist[0].getTask();
        Assert.assertEquals("Assignment1", taskFile1);
        String taskFile2 = infolist[1].getTask();
        Assert.assertEquals("Assignment1", taskFile2);
        
        String matrikFile1 = infolist[0].getMatrik();
        Assert.assertEquals("898989", matrikFile1);
        String matrikFile2 = infolist[1].getMatrik();
        Assert.assertEquals("123456", matrikFile2);
        
        int LOCFile1 = infolist[0].getLOC();
        Assert.assertEquals(24, LOCFile1);
        int LOCFile2 = infolist[1].getLOC();
        Assert.assertEquals(30, LOCFile2);
        
        int blankFile1 = infolist[0].getBlank();
        Assert.assertEquals(4, blankFile1);
        int blankFile2 = infolist[1].getBlank();
        Assert.assertEquals(6, blankFile2);
        
        int commentFile1 = infolist[0].getComment();
        Assert.assertEquals(6, commentFile1);
        int commentFile2 = infolist[1].getComment();
        Assert.assertEquals(7, commentFile2);
        
        int ActualLOCFile1 = infolist[0].getActualLOC();
        Assert.assertEquals(14, ActualLOCFile1);
        int ActualLOCFile2 = infolist[1].getActualLOC();
        Assert.assertEquals(17, ActualLOCFile2);
        
        int packageFile1 = infolist[0].getKpackage();
        Assert.assertEquals(1, packageFile1);
        int packageFile2 = infolist[1].getKpackage();
        Assert.assertEquals(1, packageFile2);
        
        int classFile1 = infolist[0].getKclass();
        Assert.assertEquals(1, classFile1);
        int classFile2 = infolist[1].getKclass();
        Assert.assertEquals(1, classFile2);
        
        int extendsFile1 = infolist[0].getKextends();
        Assert.assertEquals(1, extendsFile1);
        int extendsFile2 = infolist[1].getKextends();
        Assert.assertEquals(1, extendsFile2);
        
        int publicFile1 = infolist[0].getKpublic();
        Assert.assertEquals(2, publicFile1);
        int publicFile2 = infolist[1].getKpublic();
        Assert.assertEquals(2, publicFile2);
        
        int voidFile1 = infolist[0].getKvoid();
        Assert.assertEquals(2, voidFile1);
        int voidFile2 = infolist[1].getKvoid();
        Assert.assertEquals(2, voidFile2);
        
        int staticFile1 = infolist[0].getKstatic();
        Assert.assertEquals(1, staticFile1);
        int staticFile2 = infolist[1].getKstatic();
        Assert.assertEquals(1, staticFile2);
        
        int newFile1 = infolist[0].getKnew();
        Assert.assertEquals(1, newFile1);
        int newFile2 = infolist[1].getKnew();
        Assert.assertEquals(2, newFile2);
        
        int abstractFile1 = infolist[0].getKabstract();
        Assert.assertEquals(0, abstractFile1);
        int abstractFile2 = infolist[1].getKabstract();
        Assert.assertEquals(0, abstractFile2);
        
        int assertFile1 = infolist[0].getKassert();
        Assert.assertEquals(0, assertFile1);
        int assertFile2 = infolist[1].getKassert();
        Assert.assertEquals(0, assertFile2);
        
        int booleanFile1 = infolist[0].getKboolean();
        Assert.assertEquals(0, booleanFile1);
        int booleanFile2 = infolist[1].getKboolean();
        Assert.assertEquals(0, booleanFile2);
        
        int breakFile1 = infolist[0].getKbreak();
        Assert.assertEquals(0, breakFile1);
        int breakFile2 = infolist[1].getKbreak();
        Assert.assertEquals(0, breakFile2);
        
        int byteFile1 = infolist[0].getKbyte();
        Assert.assertEquals(0, byteFile1);
        int byteFile2 = infolist[1].getKbyte();
        Assert.assertEquals(0, byteFile2);
        
        int catchFile1 = infolist[0].getKcatch();
        Assert.assertEquals(0, catchFile1);
        int catchFile2 = infolist[1].getKcatch();
        Assert.assertEquals(0, catchFile2);
        
        int caseFile1 = infolist[0].getKcase();
        Assert.assertEquals(0, caseFile1);
        int caseFile2 = infolist[1].getKcase();
        Assert.assertEquals(0, caseFile2);
        
        int charFile1 = infolist[0].getKchar();
        Assert.assertEquals(0, charFile1);
        int charFile2 = infolist[1].getKchar();
        Assert.assertEquals(0, charFile2);
        
        int contFile1 = infolist[0].getKcontinue();
        Assert.assertEquals(0, contFile1);
        int contFile2 = infolist[1].getKcontinue();
        Assert.assertEquals(0, contFile2);
        
        int defaultFile1 = infolist[0].getKdefault();
        Assert.assertEquals(0, defaultFile1);
        int defaultFile2 = infolist[1].getKdefault();
        Assert.assertEquals(0, defaultFile2);
        
        int doFile1 = infolist[0].getKdo();
        Assert.assertEquals(0, doFile1);
        int doFile2 = infolist[1].getKdo();
        Assert.assertEquals(0, doFile2);
        
        int doubleFile1 = infolist[0].getKdouble();
        Assert.assertEquals(0, doubleFile1);
        int doubleFile2= infolist[1].getKdouble();
        Assert.assertEquals(0, doubleFile2);
        
        int elseFile1 = infolist[0].getKelse();
        Assert.assertEquals(0, elseFile1);
        int elseFile2= infolist[1].getKelse();
        Assert.assertEquals(0, elseFile2);
        
        int enumFile1 = infolist[0].getKenum();
        Assert.assertEquals(0, enumFile1);
        int enumFile2= infolist[1].getKenum();
        Assert.assertEquals(0, enumFile2);
        
        int kfinalFile1 = infolist[0].getKfinal();
        Assert.assertEquals(0, kfinalFile1);
        int kfinalFile2 = infolist[1].getKfinal();
        Assert.assertEquals(0, kfinalFile2);
        
        int kfinallyFile1 = infolist[0].getKfinally();
        Assert.assertEquals(0, kfinallyFile1);
        int kfinallyFile2 = infolist[1].getKfinally();
        Assert.assertEquals(0, kfinallyFile2);
        
        int floatFile1 = infolist[0].getKfloat();
        Assert.assertEquals(0, floatFile1);
        int floatFile2 = infolist[1].getKfloat();
        Assert.assertEquals(0, floatFile2);
        
        int forFile1 = infolist[0].getKfor();
        Assert.assertEquals(0, forFile1);
        int forFile2 = infolist[1].getKfor();
        Assert.assertEquals(0, forFile2);
        
        int ifFile1 = infolist[0].getKif();
        Assert.assertEquals(0, ifFile1);
        int ifFile2 = infolist[1].getKif();
        Assert.assertEquals(0, ifFile2);
        
        int implementsFile1 = infolist[0].getKimplements();
        Assert.assertEquals(0, implementsFile1);
        int implementsFile2 = infolist[1].getKimplements();
        Assert.assertEquals(0, implementsFile1);
        
        int importFile1 = infolist[0].getKimport();
        Assert.assertEquals(0, importFile1);
        int importFile2 = infolist[1].getKimport();
        Assert.assertEquals(0, importFile2);
        
        int instanceofFile1 = infolist[0].getKinstanceof();
        Assert.assertEquals(0, instanceofFile1);
        int instanceofFile2 = infolist[1].getKinstanceof();
        Assert.assertEquals(0, instanceofFile2);
        
        Assert.assertEquals(0, infolist[0].getKint());
        Assert.assertEquals(0, infolist[1].getKint());
        
        Assert.assertEquals(0, infolist[0].getKinterface());
        Assert.assertEquals(0, infolist[1].getKinterface());
        
        Assert.assertEquals(0, infolist[0].getKlong());
        Assert.assertEquals(0, infolist[1].getKlong());
        
        Assert.assertEquals(0, infolist[0].getKnative());
        Assert.assertEquals(0, infolist[1].getKnative());
        
        Assert.assertEquals(0, infolist[0].getKprivate());
        Assert.assertEquals(0, infolist[1].getKprivate());
        
        Assert.assertEquals(0, infolist[0].getKprotected());
        Assert.assertEquals(0, infolist[1].getKprotected());
        
        Assert.assertEquals(0, infolist[0].getKreturn());
        Assert.assertEquals(0, infolist[1].getKreturn());
        
        Assert.assertEquals(0, infolist[0].getKshort());
        Assert.assertEquals(0, infolist[1].getKshort());
        
        Assert.assertEquals(0, infolist[0].getKstrictfp());
        Assert.assertEquals(0, infolist[1].getKstrictfp());
        
        Assert.assertEquals(0, infolist[0].getKsuper());
        Assert.assertEquals(0, infolist[1].getKsuper());
        
        Assert.assertEquals(0, infolist[0].getKswitch());
        Assert.assertEquals(0, infolist[1].getKswitch());
        
        Assert.assertEquals(0, infolist[0].getKsynchoized());
        Assert.assertEquals(0, infolist[1].getKsynchoized());
        
        Assert.assertEquals(0, infolist[0].getKthis());
        Assert.assertEquals(0, infolist[1].getKthis());
        
        Assert.assertEquals(0, infolist[0].getKthrow());
        Assert.assertEquals(0, infolist[1].getKthrow());
        
        Assert.assertEquals(0, infolist[0].getKthrows());
        Assert.assertEquals(0, infolist[1].getKthrows());
        
        Assert.assertEquals(0, infolist[0].getKtransient());
        Assert.assertEquals(0, infolist[1].getKtransient());
        
        Assert.assertEquals(0, infolist[0].getKtry());
        Assert.assertEquals(0, infolist[1].getKtry());
        
        Assert.assertEquals(0, infolist[0].getKvolatile());
        Assert.assertEquals(0, infolist[1].getKvolatile());
        
        Assert.assertEquals(0, infolist[0].getKwhile());
        Assert.assertEquals(0, infolist[1].getKwhile());
        
        Assert.assertEquals(0, infolist[0].getKtrue());
        Assert.assertEquals(0, infolist[1].getKtrue());
        
        Assert.assertEquals(0, infolist[0].getKnull());
        Assert.assertEquals(0, infolist[1].getKnull());
        
        Assert.assertEquals(0, infolist[0].getKfalse());
        Assert.assertEquals(0, infolist[1].getKfalse());
        
        Assert.assertEquals(0, infolist[0].getKconst());
        Assert.assertEquals(0, infolist[1].getKconst());
        
        Assert.assertEquals(0, infolist[0].getKgoto());
        Assert.assertEquals(0, infolist[1].getKgoto());
        }
}
