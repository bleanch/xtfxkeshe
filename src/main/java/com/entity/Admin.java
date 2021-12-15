package com.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Admin {
    private int id;
    private String name;
    private String acc;
    private String pwd;
}
