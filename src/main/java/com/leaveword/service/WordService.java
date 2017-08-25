package com.leaveword.service;

import com.leaveword.Utils.Response;

public interface WordService {
    Response getWords(Integer userId);
    Response leaveWord(Integer userId,String title,String content);
}
