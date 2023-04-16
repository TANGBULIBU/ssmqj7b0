package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwushangdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwushangdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwushangdianView;


/**
 * 宠物商店评论表
 *
 * * @author: ZhuHongxuan
 * @Created: 2023.3.1 09:02:05
 */
public interface DiscusschongwushangdianService extends IService<DiscusschongwushangdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwushangdianVO> selectListVO(Wrapper<DiscusschongwushangdianEntity> wrapper);
   	
   	DiscusschongwushangdianVO selectVO(@Param("ew") Wrapper<DiscusschongwushangdianEntity> wrapper);
   	
   	List<DiscusschongwushangdianView> selectListView(Wrapper<DiscusschongwushangdianEntity> wrapper);
   	
   	DiscusschongwushangdianView selectView(@Param("ew") Wrapper<DiscusschongwushangdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwushangdianEntity> wrapper);
   	
}

