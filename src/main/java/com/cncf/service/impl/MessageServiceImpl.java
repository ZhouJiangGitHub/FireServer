package com.cncf.service.impl;

import com.cncf.dao.MessageDao;
import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageDao messageDao;

    @Override
    public boolean insertMessage(Message message) {
        return messageDao.insertMessage(message);
    }

    @Override
    public boolean updateValid(int id, int valid) {
        return messageDao.updateValid(id,valid);
    }

    @Override
    public Message selectMessageBySetId(int setId) {
        return messageDao.selectMessageBySetId(setId);
    }

}
