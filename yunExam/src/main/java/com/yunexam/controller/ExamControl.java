package com.yunexam.controller;

import com.yunexam.domain.ExamInformation;
import com.yunexam.service.ExamInfoService;
import com.yunexam.service.serviceimpl.ExamInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ExamControl {

    @Autowired
    private ExamInfoService examInfoService;

    /**
     *  获取考试信息
     * @return 考试信息
     * @throws SQLException
     */
    @RequestMapping(path = "/examInfo.json")
    public List<ExamInformation> getExamInformation() throws SQLException {
       return examInfoService.FindExamInfo();
    }
}
