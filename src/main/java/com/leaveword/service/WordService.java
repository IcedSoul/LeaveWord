package com.leaveword.service;

import com.leaveword.utils.Response;

public interface WordService {
    Response getWords(Integer userId);
    Response leaveWord(Integer userId,String title,String content);
}
