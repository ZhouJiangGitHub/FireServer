package com.cncf.service.impl;

import com.cncf.dao.MessageSetDao;
import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.service.MessageSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSetServiceImpl implements MessageSetService{

    @Autowired
    private MessageSetDao messageSetDao;

    @Override
    public boolean insertMessageSet(MessageSet messageSet) {
        return messageSetDao.insertMessageSet(messageSet);
    }

    @Override
    public boolean updateValid(int id, int valid) {
        return messageSetDao.updateValid(id,valid);
    }

    @Override
    public List selectAllMessageSet() {
        return messageSetDao.selectAllMessageSet();
    }

}
