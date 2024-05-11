package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaoCollectionEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 阅读资料收藏 服务类
 */
public interface ZiliaoCollectionService extends IService<ZiliaoCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}