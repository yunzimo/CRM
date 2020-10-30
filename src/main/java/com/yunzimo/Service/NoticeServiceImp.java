package com.yunzimo.Service;

import com.yunzimo.Bean.Notice;
import com.yunzimo.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public boolean insertNotice(Notice notice) {
        int i = noticeMapper.insertNotice(notice);
        return i>0;
    }

    @Override
    public List<Notice> showNotices() {
        List<Notice> notices = noticeMapper.showNotices();
        return notices;
    }
}
