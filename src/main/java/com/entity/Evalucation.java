package com.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Evalucation {
    private int eid;
    private int gid;
    private int uid;
    private String content;
    private int grade;
    private int aid;

    public Evalucation(int eid, int gid, int uid, String content, int aid) {
        this.eid = eid;
        this.gid = gid;
        this.uid = uid;
        this.content = content;
        this.aid = aid;
    }
}
