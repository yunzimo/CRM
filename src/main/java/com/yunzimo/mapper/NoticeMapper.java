package com.yunzimo.mapper;


import com.yunzimo.Bean.Notice;

import java.util.List;

public interface NoticeMapper {


    int insert(Notice record);

    int insertSelective(Notice record);

    public List<Notice> showNotices();

    int insertNotice(Notice notice);
}