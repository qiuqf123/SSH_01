package com.bdqn.service.impl;

import com.bdqn.dao.EntryMapper;
import com.bdqn.entity.Entry;
import com.bdqn.service.EntryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class EntryServiceImpl implements EntryService {
    @Resource
    private EntryMapper entryMapper;
    @Override
    public List<Entry> findEntry(Map<String, Object> map) throws Exception {
        return entryMapper.findEntry(map);
    }

    @Override
    public Entry findEntryById(Integer id) throws Exception {
        return entryMapper.findEntryById(id);
    }

    @Override
    public int addEntry(Entry entry) throws Exception {
        return entryMapper.addEntry(entry);
    }

    @Override
    public int updateEntry(Entry entry) throws Exception {
        return entryMapper.updateEntry(entry);
    }

    @Override
    public int deleteEntry(Integer id) throws Exception {
        return entryMapper.deleteEntry(id);
    }


}
