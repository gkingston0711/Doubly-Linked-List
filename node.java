package com.company;

public class node {
    protected String name;
    protected int data;
    protected node next;
    protected node previous;

    public node(){
        name=null;
        data=0;
        next=null;
        previous=null;

    }

    public node(String NAME, int DATA,node NEXT,node PREVIOUS){
        name=NAME;
        data=DATA;
        next=NEXT;
        previous=PREVIOUS;
    }

    public void set_name(String NAME){
        name=NAME;
    }

    public void set_data(int DATA){
        data=DATA;
    }

    public void set_next(node NEXT){
        next=NEXT;
    }

    public void set_previous(node PREVIOUS){
        previous=PREVIOUS;
    }

    public String get_name(){
        return name;
    }

    public int get_data(){
        return data;
    }

    public node get_next(){
        return next;
    }

    public node get_previous(){
        return previous;
    }
    public String change_name(String new_name){
        String temp=this.get_name();
        this.set_name(new_name);
        return temp;
    }
}
