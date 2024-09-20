package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.NewsHeadline;
import org.example.service.NewsHeadlineService;
import org.example.mapper.NewsHeadlineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author hp
* @description 针对表【news_headline】的数据库操作Service实现
* @createDate 2024-09-19 15:56:45
*/
@Service
public class NewsHeadlineServiceImpl extends ServiceImpl<NewsHeadlineMapper, NewsHeadline>
    implements NewsHeadlineService {
    @Autowired
    private NewsHeadlineMapper newsHeadlineMapper;
    public List<NewsHeadline> findAll() {
        return newsHeadlineMapper.selectList(null);
    }

}




