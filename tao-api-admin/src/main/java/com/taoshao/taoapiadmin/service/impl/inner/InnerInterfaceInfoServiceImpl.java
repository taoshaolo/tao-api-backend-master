package com.taoshao.taoapiadmin.service.impl.inner;

import com.taoshao.taoapiadmin.service.InterfaceInfoService;
import com.taoshao.taoapicommon.model.entity.InterfaceInfo;
import com.taoshao.taoapicommon.service.InnerInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author csw
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        return interfaceInfoService.query()
                .eq("url", path)
                .eq("method", method)
                .one();
    }
}




