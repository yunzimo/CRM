package com.yunzimo.Controller;


import com.yunzimo.Bean.Baoxiao;
import com.yunzimo.Service.BaoxiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Bao")
public class BaoxiaoController {

    @Autowired
    private BaoxiaoService baoxiaoService;

    @RequestMapping("getAllBaoXiao")
    @ResponseBody
    public List<Baoxiao> getAllBaoXiao(){
        List<Baoxiao> allBaoXiao = baoxiaoService.getAllBaoXiao();
        return allBaoXiao;
    }

}
