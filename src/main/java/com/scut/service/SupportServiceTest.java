package com.scut.service;

import com.scut.dao.*;
import com.scut.entity.*;
import org.springframework.stereotype.*;

import javax.annotation.*;

/**
 * Created by pc on 2017/1/3.
 */
@Service
public class SupportServiceTest {
    @Resource
    private SupportDao supportDao;


    public boolean save(Support support) {
        try{
            supportDao.save(support);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeSupport(Integer uid, Integer commentId) {
        try{
            supportDao.deleteByUserIdAndCommentId(uid, commentId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}