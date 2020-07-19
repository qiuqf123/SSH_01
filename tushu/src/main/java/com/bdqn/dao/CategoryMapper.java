package com.bdqn.dao;

import com.bdqn.entity.Category;

import java.util.List;

public interface CategoryMapper {
    // 查询所有分类
    List<Category> getAll();
}
