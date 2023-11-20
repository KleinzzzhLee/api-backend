package com.api.project.service;

import com.api.project.common.BaseResponse;
import com.api.project.model.dto.userinterfaceinfo.UserInterfaceInfoUpdateRequest;
import com.api.project.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Lzzh
* @description 针对表【user_interface_info(用户)】的数据库操作Service
* @createDate 2023-11-15 16:30:59
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    BaseResponse<Boolean> invoke(long interfaceInfoId, long userId);
}
