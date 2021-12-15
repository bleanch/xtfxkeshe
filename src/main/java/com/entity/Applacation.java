package com.entity;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Applacation {
    private int fid;
    private String fname;
    private int uid;
    private String content;
    private int propity;
    private int gid;
    private int pid;
    private Date datetime;

    public Applacation(int fid, int gid, int pid) {
        this.fid = fid;
        this.gid = gid;
        this.pid = pid;
    }
}
