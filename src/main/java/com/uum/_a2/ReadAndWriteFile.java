//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #239527
//Name: #LeongShyeLi
package com.uum._a2;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import jxl.Workbook;
import jxl.write.*;

public class ReadAndWriteFile {

    private static final String EXCEL_FILE_LOCATION = FindDirectory.getExcelFile();
    static String filename;
    static ArrayList<String> files = new ArrayList<>();
    static ArrayList<Info> info = new ArrayList<>();
   
    public static void ReadFile(String filename, ArrayList<Info> info) {
        String semester = null, course = null, group = null, task = null, matrik = null, name = null;
        int LOC = 0, blank = 0, comment = 0, actualLOC = 0;
        int kpackage = 0, kclass = 0, kextends = 0, kpublic = 0, kvoid = 0, kstatic = 0, knew = 0, kabstract = 0, kassert = 0, kboolean = 0;
        int kbreak = 0, kbyte = 0, kcase = 0, kcatch = 0, kchar = 0, kcontinue = 0, kdefault = 0, kdo = 0, kdouble = 0, kelse = 0;
        int kenum = 0, kfinal = 0, kfinally = 0, kfloat = 0, kfor = 0, kif = 0, kimplements = 0, kimport = 0, kinstanceof = 0, kint = 0;
        int kinterface = 0, klong = 0, knative = 0, kprivate = 0, kprotected = 0, kreturn = 0, kshort = 0, kstrictfp = 0, ksuper = 0, kswitch = 0;
        int ksynchoized = 0, kthis = 0, kthrow = 0, kthrows = 0, ktransient = 0, ktry = 0, kvolatile = 0, kwhile = 0, ktrue = 0, knull = 0, kfalse = 0, kconst = 0, kgoto = 0;

        try {
            FileReader readFile = new FileReader(filename);
            BufferedReader br = new BufferedReader(readFile);
            String line = br.readLine();

            while (line != null) {
                LOC++;//count Line of code
                if (line.trim().isEmpty()) {
                    blank++;
                }//count lines of blank
                if (line.startsWith("//")) {
                    comment++;
                }//count line of comments
                actualLOC = LOC - blank - comment;

                if (line.startsWith("//Semester")) {
                    if (line.contains("#")) {
                        int firstidx = line.indexOf("#") + 1;
                        int lastidx = line.length();
                        semester = line.substring(firstidx, lastidx);
                    }
                }//end if find Semester
                if (line.startsWith("//Course")) {
                    if (line.contains("#")) {
                        int firstidx = line.indexOf("#") + 1;
                        int lastidx = line.length();
                        course = line.substring(firstidx, lastidx);
                    }
                }//end if find Course
                if (line.startsWith("//Group")) {
                    if (line.contains("#")) {
                        int firstidx = line.indexOf("#") + 1;
                        int lastidx = line.length();
                        group = line.substring(firstidx, lastidx);
                    }
                }//end if find Group
                if (line.startsWith("//Task")) {
                    if (line.contains("#")) {
                        int firstidx = line.indexOf("#") + 1;
                        int lastidx = line.length();
                        task = line.substring(firstidx, lastidx);
                    }
                }//end if find Task
                if (line.startsWith("//Matrik")) {
                    if (line.contains("#")) {
                        int firstidx = line.indexOf("#") + 1;
                        int lastidx = line.length();
                        matrik = line.substring(firstidx, lastidx);
                    }
                }//end if find Matrik   
                if (line.contains("package ")) {
                    kpackage++;
                }
                if (line.contains("class ")) {
                    kclass++;
                }
                if (line.contains("extends ")) {
                    kextends++;
                }
                if (line.contains("public ")) {
                    kpublic++;
                }
                if (line.contains("void ")) {
                    kvoid++;
                }
                if (line.contains("static ")) {
                    kstatic++;
                }
                if (line.contains("new ")) {
                    knew++;
                }
                if (line.contains("abstract ")) {
                    kabstract++;
                }
                if (line.contains("assert ")) {
                    kassert++;
                }
                if (line.contains("boolean ")) {
                    kboolean++;
                }
                if (line.contains("break ")) {
                    kbreak++;
                }
                if (line.contains("byte ")) {
                    kbyte++;
                }
                if (line.contains("case ")) {
                    kcase++;
                }
                if (line.contains("catch ")) {
                    kcatch++;
                }
                if (line.contains("char ")) {
                    kchar++;
                }
                if (line.contains("continue ")) {
                    kcontinue++;
                }
                if (line.contains("default ")) {
                    kdefault++;
                }
                if (line.contains("do ")) {
                    kdo++;
                }
                if (line.contains("double ")) {
                    kdouble++;
                }
                if (line.contains("else ")) {
                    kelse++;
                }
                if (line.contains("enum ")) {
                    kenum++;
                }
                if (line.contains("final ")) {
                    kfinal++;
                }
                if (line.contains("finally ")) {
                    kfinally++;
                }
                if (line.contains("float ")) {
                    kfloat++;
                }
                if (line.contains("for ")) {
                    kfor++;
                }
                if (line.contains("if ")) {
                    kif++;
                }
                if (line.contains("implements ")) {
                    kimplements++;
                }
                if (line.contains("import ")) {
                    kimport++;
                }
                if (line.contains("instanceof ")) {
                    kinstanceof++;
                }
                if (line.contains(" int ")) {
                    kint++;
                }
                if (line.contains("interface ")) {
                    kinterface++;
                }
                if (line.contains("long ")) {
                    klong++;
                }
                if (line.contains("ative ")) {
                    knative++;
                }
                if (line.contains("private ")) {
                    kprivate++;
                }
                if (line.contains("protected ")) {
                    kprotected++;
                }
                if (line.contains("return ")) {
                    kreturn++;
                }
                if (line.contains("short ")) {
                    kshort++;
                }
                if (line.contains("strictfp ")) {
                    kstrictfp++;
                }
                if (line.contains("super ")) {
                    ksuper++;
                }
                if (line.contains("switch ")) {
                    kswitch++;
                }
                if (line.contains("synchronized ")) {
                    ksynchoized++;
                }
                if (line.contains("this ")) {
                    kthis++;
                }
                if (line.contains("throw ")) {
                    kthrow++;
                }
                if (line.contains("throws ")) {
                    kthrows++;
                }
                if (line.contains("transient ")) {
                    ktransient++;
                }
                if (line.contains("try ")) {
                    ktry++;
                }
                if (line.contains("volatile ")) {
                    kvolatile++;
                }
                if (line.contains("while ")) {
                    kwhile++;
                }
                if (line.contains("true ")) {
                    ktrue++;
                }
                if (line.contains("null ")) {
                    knull++;
                }
                if (line.contains("false ")) {
                    kfalse++;
                }
                if (line.contains("const ")) {
                    kconst++;
                }
                if (line.contains("goto ")) {
                    kgoto++;
                }
                line = br.readLine();
            }//end while

            br.close();
            info.add(new Info(semester, course, group, task, matrik, LOC, blank, comment, actualLOC, kpackage, kclass, kextends, kpublic, kvoid, kstatic, knew, kabstract, kassert, kboolean, kbreak, kbyte, kcase, kcatch, kchar, kcontinue, kdefault, kdo, kdouble, kelse, kenum, kfinal, kfinally, kfloat, kfor, kif, kimplements, kimport, kinstanceof, kint, kinterface, klong, knative, kprivate, kprotected, kreturn, kshort, kstrictfp, ksuper, kswitch, ksynchoized, kthis, kthrow, kthrows, ktransient, ktry, kvolatile, kwhile, ktrue, knull, kfalse, kconst, kgoto));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//End ReadFile

    public static void main(String[] args) throws IOException, WriteException {
        FindDirectory.setFiles(files);
        String list[] = new String[files.size()];
        list = files.toArray(list);
        for (int i = 0; i < files.size(); i++) {
            filename = list[i];
            ReadFile(filename,info);
        }
        File f = new File(EXCEL_FILE_LOCATION);
        WritableWorkbook myexel = Workbook.createWorkbook(f);
        WritableSheet mysheet = myexel.createSheet("StudentFilesInfo", 0);
        
        Iterator itr = info.iterator();
        while (itr.hasNext()) {
            Info inf = (Info) itr.next();
            mysheet.addCell(new Label(0, 0, "Semester"));
            mysheet.addCell(new Label(1, 0, inf.getSemester()));
            mysheet.addCell(new Label(0, 1, "Course"));
            mysheet.addCell(new Label(1, 1, inf.getCourse()));
            mysheet.addCell(new Label(0, 2, "Group"));
            mysheet.addCell(new Label(1, 2, inf.getGroup()));
            mysheet.addCell(new Label(0, 3, "Task"));
            mysheet.addCell(new Label(1, 3, inf.getTask()));
            mysheet.addCell(new Label(5, 5, "Java Keywords"));
            mysheet.addCell(new Label(0, 6, "Matrik"));
            mysheet.addCell(new Label(1, 6, "LOC"));
            mysheet.addCell(new Label(2, 6, "Blank"));
            mysheet.addCell(new Label(3, 6, "Comment"));
            mysheet.addCell(new Label(4, 6, "ActualLOC"));
            mysheet.addCell(new Label(5, 6, "package"));
            mysheet.addCell(new Label(6, 6, "class"));
            mysheet.addCell(new Label(7, 6, "extends"));
            mysheet.addCell(new Label(8, 6, "public"));
            mysheet.addCell(new Label(9, 6, "void"));
            mysheet.addCell(new Label(10, 6, "static"));
            mysheet.addCell(new Label(11, 6, "new"));
            mysheet.addCell(new Label(12, 6, "abstract"));
            mysheet.addCell(new Label(13, 6, "assert"));
            mysheet.addCell(new Label(14, 6, "boolean"));
            mysheet.addCell(new Label(15, 6, "break"));
            mysheet.addCell(new Label(16, 6, "byte"));
            mysheet.addCell(new Label(17, 6, "case"));
            mysheet.addCell(new Label(18, 6, "catch"));
            mysheet.addCell(new Label(19, 6, "char"));
            mysheet.addCell(new Label(20, 6, "continue"));
            mysheet.addCell(new Label(21, 6, "default"));
            mysheet.addCell(new Label(22, 6, "do"));
            mysheet.addCell(new Label(23, 6, "double"));
            mysheet.addCell(new Label(24, 6, "else"));
            mysheet.addCell(new Label(25, 6, "enum"));
            mysheet.addCell(new Label(26, 6, "final"));
            mysheet.addCell(new Label(27, 6, "finally"));
            mysheet.addCell(new Label(28, 6, "float"));
            mysheet.addCell(new Label(29, 6, "for"));
            mysheet.addCell(new Label(30, 6, "if"));
            mysheet.addCell(new Label(31, 6, "implements"));
            mysheet.addCell(new Label(32, 6, "import"));
            mysheet.addCell(new Label(33, 6, "instanceof"));
            mysheet.addCell(new Label(34, 6, "int"));
            mysheet.addCell(new Label(35, 6, "interface"));
            mysheet.addCell(new Label(36, 6, "long"));
            mysheet.addCell(new Label(37, 6, "active"));
            mysheet.addCell(new Label(38, 6, "private"));
            mysheet.addCell(new Label(39, 6, "protected"));
            mysheet.addCell(new Label(40, 6, "return"));
            mysheet.addCell(new Label(41, 6, "short"));
            mysheet.addCell(new Label(42, 6, "strictfp"));
            mysheet.addCell(new Label(43, 6, "super"));
            mysheet.addCell(new Label(44, 6, "switch"));
            mysheet.addCell(new Label(45, 6, "synchronized"));
            mysheet.addCell(new Label(46, 6, "this"));
            mysheet.addCell(new Label(47, 6, "throw"));
            mysheet.addCell(new Label(48, 6, "throws"));
            mysheet.addCell(new Label(49, 6, "transient"));
            mysheet.addCell(new Label(50, 6, "try"));
            mysheet.addCell(new Label(51, 6, "volatile"));
            mysheet.addCell(new Label(52, 6, "while"));
            mysheet.addCell(new Label(53, 6, "true"));
            mysheet.addCell(new Label(54, 6, "null"));
            mysheet.addCell(new Label(55, 6, "false"));
            mysheet.addCell(new Label(56, 6, "const"));
            mysheet.addCell(new Label(57, 6, "goto"));
            mysheet.addCell(new Label(58, 6, "total"));
        }//end iterator
        
        int row=7;
        int i;
        Info[] infolist = new Info[info.size()];
        infolist=info.toArray(infolist);
        do{
                for(i=0;i<infolist.length;i++){
                Label matrik = new Label(0,row,infolist[i].getMatrik());
                mysheet.addCell(matrik);
                Label loc = new Label(1,row,String.valueOf(infolist[i].getLOC()));
                mysheet.addCell(loc);
                Label blank = new Label(2,row,String.valueOf(infolist[i].getBlank()));
                mysheet.addCell(blank);    
                Label comment = new Label(3,row,String.valueOf(infolist[i].getComment()));
                mysheet.addCell(comment);
                Label actualLOC= new Label(4,row,String.valueOf(infolist[i].getActualLOC()));
                mysheet.addCell(actualLOC);
                Label kpackage = new Label(5,row,String.valueOf(infolist[i].getKpackage()));
                mysheet.addCell(kpackage);
                Label kclass = new Label(6,row,String.valueOf(infolist[i].getKclass()));
                mysheet.addCell(kclass);
                Label kextends = new Label(7,row,String.valueOf(infolist[i].getKextends()));
                mysheet.addCell(kextends);
                 Label kpublic= new Label(8,row,String.valueOf(infolist[i].getKpublic()));
                mysheet.addCell(kpublic);
                Label  kvoid= new Label(9,row,String.valueOf(infolist[i].getKvoid()));
                mysheet.addCell(kvoid);
                Label  kstatic= new Label(10,row,String.valueOf(infolist[i].getKstatic()));
                mysheet.addCell(kstatic);
                Label  knew= new Label(11,row,String.valueOf(infolist[i].getKnew()));
                mysheet.addCell(knew);
                Label kabstract= new Label(12,row,String.valueOf(infolist[i].getKabstract()));
                mysheet.addCell(kabstract);
                Label  kassert= new Label(13,row,String.valueOf(infolist[i].getKassert()));
                mysheet.addCell(kassert);
                Label kboolean = new Label(14,row,String.valueOf(infolist[i].getKboolean()));
                mysheet.addCell(kboolean);
                Label kbreak  = new Label(15,row,String.valueOf(infolist[i].getKbreak()));
                mysheet.addCell(kbreak);
                Label kbyte= new Label(16,row,String.valueOf(infolist[i].getKbyte()));
                mysheet.addCell(kbyte);
                Label kcatch= new Label(18,row,String.valueOf(infolist[i].getKcatch()));
                mysheet.addCell(kcatch);
                Label kcase = new Label(17,row,String.valueOf(infolist[i].getKcase()));
                mysheet.addCell(kcase);
                Label kchar = new Label(19,row,String.valueOf(infolist[i].getKchar()));
                mysheet.addCell(kchar);
                Label kcontinue = new Label(20,row,String.valueOf(infolist[i].getKcontinue()));
                mysheet.addCell(kcontinue);
                Label kdefault = new Label(21,row,String.valueOf(infolist[i].getKdefault()));
                mysheet.addCell(kdefault);
                Label kdo = new Label(22,row,String.valueOf(infolist[i].getKdo()));
                mysheet.addCell(kdo);
                Label kdouble = new Label(23,row,String.valueOf(infolist[i].getKdouble()));
                mysheet.addCell(kdouble);
                Label kelse = new Label(24,row,String.valueOf(infolist[i].getKelse()));
                mysheet.addCell(kelse);
                Label kenum = new Label(25,row,String.valueOf(infolist[i].getKenum()));
                mysheet.addCell(kenum);
                Label kfinal = new Label(26,row,String.valueOf(infolist[i].getKfinal()));
                mysheet.addCell(kfinal);
                Label kfinally = new Label(27,row,String.valueOf(infolist[i].getKfinally()));
                mysheet.addCell(kfinally);
                Label kfloat = new Label(28,row,String.valueOf(infolist[i].getKfloat()));
                mysheet.addCell(kfloat);
                Label kfor = new Label(29,row,String.valueOf(infolist[i].getKfor()));
                mysheet.addCell(kfor);
                Label kif  = new Label(30,row,String.valueOf(infolist[i].getKif()));
                mysheet.addCell(kif);
                Label kimplements = new Label(31,row,String.valueOf(infolist[i].getKimplements()));
                mysheet.addCell(kimplements);
                Label kimport = new Label(32,row,String.valueOf(infolist[i].getKimport()));
                mysheet.addCell(kimport);
                Label kinstanceof = new Label(33,row,String.valueOf(infolist[i].getKinstanceof()));
                mysheet.addCell(kinstanceof);
                Label kint = new Label(34,row,String.valueOf(infolist[i].getKint()));
                mysheet.addCell(kint);
                Label kinterface = new Label(35,row,String.valueOf(infolist[i].getKinterface()));
                mysheet.addCell(kinterface);
                Label klong = new Label(36,row,String.valueOf(infolist[i].getKlong()));
                mysheet.addCell(klong);
                Label kactive = new Label(37,row,String.valueOf(infolist[i].getKnative()));
                mysheet.addCell(kactive);
                Label kprivate = new Label(38,row,String.valueOf(infolist[i].getKprivate()));
                mysheet.addCell(kprivate);
                Label kprotected = new Label(39,row,String.valueOf(infolist[i].getKprotected()));
                mysheet.addCell(kprotected);
                Label kreturn = new Label(40,row,String.valueOf(infolist[i].getKreturn()));
                mysheet.addCell(kreturn);
                Label kshort = new Label(41,row,String.valueOf(infolist[i].getKshort()));
                mysheet.addCell(kshort);
                Label kstrictfp = new Label(42,row,String.valueOf(infolist[i].getKstrictfp()));
                mysheet.addCell(kstrictfp);
                Label ksuper = new Label(43,row,String.valueOf(infolist[i].getKsuper()));
                mysheet.addCell(ksuper);
                Label kswitch = new Label(44,row,String.valueOf(infolist[i].getKswitch()));
                mysheet.addCell(kswitch);
                Label ksynchronized = new Label(45,row,String.valueOf(infolist[i].getKsynchoized()));
                mysheet.addCell(ksynchronized);
                Label kthis = new Label(46,row,String.valueOf(infolist[i].getKthis()));
                mysheet.addCell(kthis);
                Label kthrow = new Label(47,row,String.valueOf(infolist[i].getKthrow()));
                mysheet.addCell(kthrow);
                Label kthrows = new Label(48,row,String.valueOf(infolist[i].getKthrows()));
                mysheet.addCell(kthrows);
                Label ktransient = new Label(49,row,String.valueOf(infolist[i].getKtransient()));
                mysheet.addCell(ktransient);
                Label ktry = new Label(50,row,String.valueOf(infolist[i].getKtry()));
                mysheet.addCell(ktry);
                Label kvolatile = new Label(51,row,String.valueOf(infolist[i].getKvolatile()));
                mysheet.addCell(kvolatile);
                Label kwhile = new Label(52,row,String.valueOf(infolist[i].getKwhile()));
                mysheet.addCell(kwhile);
                Label ktrue = new Label(53,row,String.valueOf(infolist[i].getKtrue()));
                mysheet.addCell(ktrue);
                Label knull = new Label(54,row,String.valueOf(infolist[i].getKnull()));
                mysheet.addCell(knull);
                Label kfalse = new Label(55,row,String.valueOf(infolist[i].getKfalse()));
                mysheet.addCell(kfalse);
                Label kconst = new Label(56,row,String.valueOf(infolist[i].getKconst()));
                mysheet.addCell(kconst);
                Label kgoto = new Label(57,row,String.valueOf(infolist[i].getKgoto()));
                mysheet.addCell(kgoto);
                Label ktotal = new Label(58,row,String.valueOf(infolist[i].getTotal()));
                mysheet.addCell(ktotal);
                row++;
                }
        }while(i<infolist.length);
        myexel.write();
        myexel.close();
        
        System.out.println("Successfully write info to excel file in "+EXCEL_FILE_LOCATION);
        
    }//end main
}//end class

