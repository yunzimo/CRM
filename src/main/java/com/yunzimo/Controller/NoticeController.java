package com.yunzimo.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunzimo.Bean.Notice;
import com.yunzimo.Service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("saveNotice")
    public String saveNotice(Notice notice){
        notice.setNdate(new Date());
        boolean b = noticeService.insertNotice(notice);
        if(b){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        return "redirect:../main.jsp";
    }

    @RequestMapping("showNotices")
    @ResponseBody
    public PageInfo<Notice> showNotices(){
        PageHelper.startPage(1,3);
        List<Notice> notices = noticeService.showNotices();
        PageInfo<Notice> pageInfo=new PageInfo<>(notices);
        //System.out.println("pageInfo中的list集合"+pageInfo.getList());
        return pageInfo;
    }
}
