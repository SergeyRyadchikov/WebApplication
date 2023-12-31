package com.webapp.repository;

import com.webapp.domain.Message;

import java.util.LinkedList;
import java.util.List;

public class UseDataBase implements DataBase<Message> {

    private List<Message> listMessage = new LinkedList<>();

    @Override
    public List getListObject() {
        return listMessage;
    }

    @Override
    public void save(Message object) {
        listMessage.add(object);
    }

    @Override
    public List<Message> searchForName(String name) {
        List<Message> resultList = new LinkedList<>();
        for (Message message : listMessage){
            if (message.getText().contains(name) || message.getTag().contains(name)){
                resultList.add(message);
            }
        }
        return resultList;
    }


}
