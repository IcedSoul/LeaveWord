package com.leaveword.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author guoxiaofeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String status;
    private Object content;
}
