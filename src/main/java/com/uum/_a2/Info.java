//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #239527
//Name: #LeongShyeLi

package com.uum._a2;

public class Info {
    private String semester;
    private String course;
    private String group;
    private String task;
    private String matrik;
    private int LOC;
    private int blank;
    private int comment;
    private int actualLOC;
      
    private int kpackage;
    private int kclass; 
    private int kextends ; 
    private int kpublic;
    private int kvoid; 
    private int kstatic;
    private int knew;
    
    private int kabstract,kassert,kboolean,kbreak,kbyte,kcase,kcatch,kchar,kcontinue,kdefault,kdo,kdouble,kelse,kenum;
    private int kfinal,kfinally,kfloat,kfor,kif,kimplements,kimport,kinstanceof,kint,kinterface,klong,knative,kprivate,kprotected;
    private int kreturn,kshort,kstrictfp,ksuper,kswitch,ksynchoized,kthis,kthrow,kthrows,ktransient,ktry,kvolatile;
    private int kwhile,ktrue,knull,kfalse,kconst,kgoto;
    private int total;

    public Info(String semester, String course, String group, String task, String matrik, int LOC, int blank, int comment, int actualLOC, int kpackage, int kclass, int kextends, int kpublic, int kvoid, int kstatic, int knew, int kabstract, int kassert, int kboolean, int kbreak, int kbyte, int kcase, int kcatch, int kchar, int kcontinue, int kdefault, int kdo, int kdouble, int kelse, int kenum, int kfinal, int kfinally, int kfloat, int kfor, int kif, int kimplements, int kimport, int kinstanceof, int kint, int kinterface, int klong, int knative, int kprivate, int kprotected, int kreturn, int kshort, int kstrictfp, int ksuper, int kswitch, int ksynchoized, int kthis, int kthrow, int kthrows, int ktransient, int ktry, int kvolatile, int kwhile, int ktrue, int knull, int kfalse, int kconst, int kgoto) {
        this.semester = semester;
        this.course = course;
        this.group = group;
        this.task = task;
        this.matrik = matrik;
        this.LOC = LOC;
        this.blank = blank;
        this.comment = comment;
        this.actualLOC = actualLOC;
        this.kpackage = kpackage;
        this.kclass = kclass;
        this.kextends = kextends;
        this.kpublic = kpublic;
        this.kvoid = kvoid;
        this.kstatic = kstatic;
        this.knew = knew;
        this.kabstract = kabstract;
        this.kassert = kassert;
        this.kboolean = kboolean;
        this.kbreak = kbreak;
        this.kbyte = kbyte;
        this.kcase = kcase;
        this.kcatch = kcatch;
        this.kchar = kchar;
        this.kcontinue = kcontinue;
        this.kdefault = kdefault;
        this.kdo = kdo;
        this.kdouble = kdouble;
        this.kelse = kelse;
        this.kenum = kenum;
        this.kfinal = kfinal;
        this.kfinally = kfinally;
        this.kfloat = kfloat;
        this.kfor = kfor;
        this.kif = kif;
        this.kimplements = kimplements;
        this.kimport = kimport;
        this.kinstanceof = kinstanceof;
        this.kint = kint;
        this.kinterface = kinterface;
        this.klong = klong;
        this.knative = knative;
        this.kprivate = kprivate;
        this.kprotected = kprotected;
        this.kreturn = kreturn;
        this.kshort = kshort;
        this.kstrictfp = kstrictfp;
        this.ksuper = ksuper;
        this.kswitch = kswitch;
        this.ksynchoized = ksynchoized;
        this.kthis = kthis;
        this.kthrow = kthrow;
        this.kthrows = kthrows;
        this.ktransient = ktransient;
        this.ktry = ktry;
        this.kvolatile = kvolatile;
        this.kwhile = kwhile;
        this.ktrue = ktrue;
        this.knull = knull;
        this.kfalse = kfalse;
        this.kconst = kconst;
        this.kgoto = kgoto;
    }
    
    public int getTotal() {
        total = (actualLOC +( kpackage + kclass + kextends + kpublic + kvoid + kstatic + knew+kfinal+kfinally+kfloat+kfor+kif+kimplements+kimport+kinstanceof+kint+kinterface+klong+knative+kprivate+kprotected+kreturn+kshort+kstrictfp+ksuper+kswitch+ksynchoized+kthis+kthrow+kthrows+ktransient+ktry+kvolatile+kwhile+ktrue+knull+kfalse+kconst+kgoto));
        return total;
    }
    
    public int getLOC() {
        return LOC;
    }

    public void setLOC(int LOC) {
        this.LOC = LOC;
    }

    public int getBlank() {
        return blank;
    }

    public void setBlank(int blank) {
        this.blank = blank;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getActualLOC() {
        return actualLOC;
    }

    public void setActualLOC(int actualLOC) {
        this.actualLOC = actualLOC;
    } 

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getMatrik() {
        return matrik;
    }

    public void setMatrik(String matrik) {
        this.matrik = matrik;
    }

    public int getKpackage() {
        return kpackage;
    }

    public int getKclass() {
        return kclass;
    }

    public int getKextends() {
        return kextends;
    }

    public int getKpublic() {
        return kpublic;
    }

    public int getKvoid() {
        return kvoid;
    }

    public int getKstatic() {
        return kstatic;
    }

    public int getKnew() {
        return knew;
    }


    public int getKabstract() {
        return kabstract;
    }

    public int getKassert() {
        return kassert;
    }

    public int getKboolean() {
        return kboolean;
    }

    public int getKbreak() {
        return kbreak;
    }

    public int getKbyte() {
        return kbyte;
    }

    public int getKcase() {
        return kcase;
    }

    public int getKcatch() {
        return kcatch;
    }

    public int getKchar() {
        return kchar;
    }

    public int getKcontinue() {
        return kcontinue;
    }

    public int getKdefault() {
        return kdefault;
    }

    public int getKdo() {
        return kdo;
    }

    public int getKdouble() {
        return kdouble;
    }

    public int getKelse() {
        return kelse;
    }

    public int getKenum() {
        return kenum;
    }

    public int getKfinal() {
        return kfinal;
    }

    public int getKfinally() {
        return kfinally;
    }

    public int getKfloat() {
        return kfloat;
    }

    public int getKfor() {
        return kfor;
    }

    public int getKif() {
        return kif;
    }

    public int getKimplements() {
        return kimplements;
    }

    public int getKimport() {
        return kimport;
    }

    public int getKinstanceof() {
        return kinstanceof;
    }

    public int getKint() {
        return kint;
    }

    public int getKinterface() {
        return kinterface;
    }

    public int getKlong() {
        return klong;
    }

    public int getKnative() {
        return knative;
    }

    public int getKprivate() {
        return kprivate;
    }

    public int getKprotected() {
        return kprotected;
    }

    public int getKreturn() {
        return kreturn;
    }

    public int getKshort() {
        return kshort;
    }

    public int getKstrictfp() {
        return kstrictfp;
    }

    public int getKsuper() {
        return ksuper;
    }

    public int getKswitch() {
        return kswitch;
    }

    public int getKsynchoized() {
        return ksynchoized;
    }

    public int getKthis() {
        return kthis;
    }

    public int getKthrow() {
        return kthrow;
    }

    public int getKthrows() {
        return kthrows;
    }

    public int getKtransient() {
        return ktransient;
    }

    public int getKtry() {
        return ktry;
    }

    public int getKvolatile() {
        return kvolatile;
    }

    public int getKwhile() {
        return kwhile;
    }

    public int getKtrue() {
        return ktrue;
    }

    public int getKnull() {
        return knull;
    }

    public int getKfalse() {
        return kfalse;
    }

    public int getKconst() {
        return kconst;
    }

    public int getKgoto() {
        return kgoto;
    }
    
    

}
