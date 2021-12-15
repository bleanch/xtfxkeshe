package com.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Group {
    private int gid;
    private int lid;
    private String name;
    private int num;

    public Group(int gid, int lid, String name) {
        this.gid = gid;
        this.lid = lid;
        this.name = name;
    }
}
