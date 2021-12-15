package com.mapper;

import com.entity.Admin;

import java.util.List;

public interface AdminMapper {
     List<Admin> getadmins();
     Admin getadmin(int id);
     int addadmin(Admin admin);
     int updateadmin(Admin admin);
     int deleteadmin(int id);
}
