package com.bdqn.service;

import com.bdqn.entity.Entry;

import java.util.List;
import java.util.Map;

public interface EntryService {

    // 查询图书列表
    List<Entry> findEntry(Map<String,Object> map)throws Exception;

    // 根据id 查询图书
    Entry findEntryById(Integer id)throws Exception;

    // 增加图书
    int addEntry(Entry entry)throws Exception;

    // 修改图书
    int updateEntry(Entry entry)throws Exception;

    // 删除图书
    int deleteEntry(Integer id)throws Exception;

}
