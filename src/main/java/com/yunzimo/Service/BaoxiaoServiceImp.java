package com.yunzimo.Service;

import com.yunzimo.Bean.Baoxiao;
import com.yunzimo.mapper.BaoxiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaoxiaoServiceImp implements BaoxiaoService {

    @Autowired
    private BaoxiaoMapper baoxiaoMapper;
    @Override
    public List<Baoxiao> getAllBaoXiao() {
        List<Baoxiao> allBaoXiao = baoxiaoMapper.getAllBaoXiao();
        return allBaoXiao;
    }
}
