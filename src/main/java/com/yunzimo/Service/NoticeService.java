package com.yunzimo.Service;

import com.yunzimo.Bean.Notice;

import java.util.List;

public interface NoticeService {
    public boolean insertNotice(Notice notice);
    public List<Notice> showNotices();
}
