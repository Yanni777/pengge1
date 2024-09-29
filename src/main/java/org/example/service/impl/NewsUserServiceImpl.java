package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.NewsUser;
import org.example.service.NewsUserService;
import org.example.mapper.NewsUserMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【news_user】的数据库操作Service实现
* @createDate 2024-09-27 16:25:32
*/
@Service
public class NewsUserServiceImpl extends ServiceImpl<NewsUserMapper, NewsUser>
    implements NewsUserService{

}




