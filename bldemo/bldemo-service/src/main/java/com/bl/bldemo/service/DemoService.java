package com.bl.bldemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yujingyi on 2016/9/7.
 */
@Service
public class DemoService {

    public String getTestData() {
        return "testName";
    }

}
