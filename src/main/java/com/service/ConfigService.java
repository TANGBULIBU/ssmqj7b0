
package com.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.entity.ConfigEntity;
import com.utils.PageUtils;


/**
 * 系统用户
 * * @author: ZhuHongxuan
 * @Created: 2023.3.1 09:02:05
 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params);
}
