package com.bdqn.service;

import com.bdqn.entity.Category;

import java.util.List;

public interface CategoryService {
    // 查询所有分类
    List<Category> getAll();
}
