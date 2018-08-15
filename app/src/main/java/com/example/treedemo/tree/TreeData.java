package com.example.treedemo.tree;

import java.util.ArrayList;

/**
 * Created by yuxiaogang on 2017/3/14.
 */

public class TreeData {
    private ArrayList<TreeData> children;
    private String froomid;
    private String projectid;
    private String projectname;
    private String roomid;
    private String roomname;
    private String leaf;
    private ArrayList<TreeData> threeChilder;

    public ArrayList<TreeData> getThreeChilder() {
        return threeChilder;
    }

    public void setThreeChilder(ArrayList<TreeData> threeChilder) {
        this.threeChilder = threeChilder;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public ArrayList<TreeData> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeData> children) {
        this.children = children;
    }

    public String getFroomid() {
        return froomid;
    }

    public void setFroomid(String froomid) {
        this.froomid = froomid;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }
}
