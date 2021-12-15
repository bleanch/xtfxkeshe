package com.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Member {
    private int mid;
    private String name;
    private int gid;
    private String acc;
    private String pwd;
    private int duty;
}
