package com.mapper;

import com.entity.Evalucation;
import com.entity.Group;
import com.entity.Member;

import java.util.List;

public interface GroupMapper {
    List<Group> gets();
    Group get(int gid);
    int add(Group group);
    int update(Group group);
    int delete(int gid);
}
