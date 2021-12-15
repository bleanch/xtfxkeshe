package com.mapper;

import com.entity.Group;
import com.entity.Member;

import java.util.List;

public interface MemberMapper {
    List<Member> gets();
    List<Member> getmems(int gid);
    Member get(int mid);
    int add(Member member);
    int update(Member member);
    int delete(int mid);
}
