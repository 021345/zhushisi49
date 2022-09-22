package com.zss.dao;

import com.zss.pojo.Project;

import java.sql.SQLException;
import java.util.List;

/**
 * 接口名通常是实体类+dao，对应操作实体类所对应的表
 */
public interface ProjectDao {
    //查询project表中的数据
    public List<Project> getProjects() throws ClassNotFoundException, SQLException;

    public int addProject(Project project) throws ClassNotFoundException, SQLException;
 }

