package com.mapper;

import com.entity.Admin;
import com.entity.Applacation;

import java.util.List;

public interface ApplacationMapper {
    List<Applacation> gets();
    Applacation get(int fid);
    int add(Applacation applacation);
    int update(Applacation applacation);
    int delete(int fid);
}
