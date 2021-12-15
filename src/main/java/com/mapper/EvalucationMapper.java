package com.mapper;

import com.entity.Applacation;
import com.entity.Evalucation;

import java.util.List;

public interface EvalucationMapper {
    List<Evalucation> gets();
    Evalucation get(int eid);
    int add(Evalucation evalucation);
    int update(Evalucation evalucation);
    int delete(int eid);
}
