package com.leaveword.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.leaveword.Utils.CommonTools;
import com.leaveword.Utils.Response;
import com.leaveword.domain.Word;
import com.leaveword.repository.UserRepository;
import com.leaveword.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    WordRepository wordRepository;

    @Override
    public Response getWords(Integer userId) {
        List<Word> words = wordRepository.findAll();
        if(words.size()>0)
            return new Response("0", JSONArray.toJSONString(words));
        else
            return new Response("0", "没有留言");
    }

    @Override
    public Response leaveWord(Integer userId, String title, String content) {
        if(userRepository.findOne(userId) == null)
            return new Response("-1","用户不存在");
        if(CommonTools.isEmpty(title))
            return new Response("-1","标题不能为空");
        if(CommonTools.isEmpty(content))
            return new Response("-1","内容不能为空");
        Word word = new Word();
        word.setUserId(userId);
        word.setTitle(title);
        word.setContent(content);
        word.setLeaveTime(CommonTools.getCurrentTime());
        wordRepository.save(word);
        return new Response("0", JSON.toJSONString(word));
    }
}
