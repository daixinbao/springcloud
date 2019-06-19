package com.scf.error;

import com.scf.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * Created by daixn on 2019/6/19 23:24
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}
