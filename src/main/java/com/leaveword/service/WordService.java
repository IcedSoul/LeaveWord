package com.leaveword.service;

import com.leaveword.utils.Response;

/**
 * @author guoxiaofeng
 */
public interface WordService {
    /**
     *
     * Get word by Id
     * @param userId userId
     * @return response
     */
    Response getWords(Integer userId);

    /**
     *
     * Leave Word
     * @param userId userId
     * @param title title
     * @param content content
     * @return response
     */
    Response leaveWord(Integer userId,String title,String content);
}
