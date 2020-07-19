package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Category;
import com.bdqn.entity.Entry;
import com.bdqn.service.CategoryService;
import com.bdqn.service.EntryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
public class EntryController {
    @Resource
    private CategoryService categoryService;

    @Resource
    private EntryService entryService;

    @RequestMapping("/getAll")
    public List<Category> getAll(){
        return   categoryService.getAll();
    }

    @RequestMapping("/findEntry")
    public List<Entry> findEntry(Integer categoryId){
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("categoryId",categoryId);
            return  entryService.findEntry(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping("/findEntryById")
    public Entry findEntryById(Integer id){
        try {
            return   entryService.findEntryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/addEntry")
    public Map<String,Object> addEntry(Entry entry){
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            if(entryService.addEntry(entry)>0){
                map.put("success",true);
                map.put("message","添加图书成功！");
            }else {
                map.put("success",false);
                map.put("message","添加图书失败！");
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/updateEntry")
    public Map<String,Object> updateEntry(Entry entry){
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            if(entryService.updateEntry(entry)>0){
                map.put("success",true);
                map.put("message","修改图书成功！");
            }else {
                map.put("success",false);
                map.put("message","修改图书失败！");
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    @RequestMapping("/deleteEntry")
    public Map<String,Object> deleteEntry(Integer id){
        try {
            Map<String,Object> map=new HashMap<String,Object>();
            if(entryService.deleteEntry(id)>0){
                map.put("success",true);
                map.put("message","删除图书成功！");
            }else {
                map.put("success",false);
                map.put("message","删除图书失败！");
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
