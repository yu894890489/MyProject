package com.yu.dao;

import com.yu.bean.AdminBean;

public interface AdminBeanMapper {
    int deleteByPrimaryKey(String id);

    int insert(AdminBean record);

    int insertSelective(AdminBean record);

    AdminBean selectByPrimaryKey(String id);
    
    AdminBean getAdmin(AdminBean admin);
    
    int updateByPrimaryKeySelective(AdminBean record);

    int updateByPrimaryKey(AdminBean record);
}