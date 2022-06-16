package com.lemonsoul.testgithubaction.service.impl;

import com.lemonsoul.testgithubaction.service.InfoService;
import org.springframework.stereotype.Service;


/**
 * @author lemonSoul
 * @date 2021/9/30
 */
@Service
public class LogsServiceImpl implements InfoService {
    @Override
    public String getAllLogs() {
        return "success!";
    }
}
